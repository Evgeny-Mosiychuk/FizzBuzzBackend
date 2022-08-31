package com.test.fizzbuzz.common;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.test.fizzbuzz.FizzBuzzApplication;
import com.test.fizzbuzz.service.CalculateService;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;

@SpringBootTest(webEnvironment = RANDOM_PORT)
@ContextConfiguration(classes = FizzBuzzApplication.class)
@AutoConfigureMockMvc
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AbstractTest {

  @Autowired
  protected MockMvc mvc;

  @Autowired
  protected CalculateService service;

  protected MockHttpServletRequestBuilder createPostRequest(String requestJson, String url) {
    return post(url)
        .contentType(new MediaType(MediaType.APPLICATION_JSON.getType(), MediaType.APPLICATION_JSON.getSubtype(), StandardCharsets.UTF_8))
        .content(requestJson);
  }
  protected String convertToJson(Object object) throws JsonProcessingException {
    ObjectMapper mapper = new ObjectMapper();
    mapper.registerModule(new JavaTimeModule());
    mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, false);
    ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
    return ow.writeValueAsString(object);
  }

  public List<Integer> getPositiveData() {
    return List.of(1,2,3,5,15);
  }

  public List<Integer> getNegativeData() {
    return List.of(-1,-2,-3,-5,-15);
  }
}
