package com.test.fizzbuzz.controller;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.test.fizzbuzz.common.AbstractTest;
import com.test.fizzbuzz.FizzBuzzApplication;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest(webEnvironment = RANDOM_PORT)
@ContextConfiguration(classes = FizzBuzzApplication.class)
@AutoConfigureMockMvc
class NumbersControllerTest extends AbstractTest {

  @Test
  void startCalculate() throws Exception {
    String url = "/";
    List<Integer> goodData = getPositiveData();
    String payload = convertToJson(goodData);
    mvc.perform(createPostRequest(payload, url))
        .andExpect(status().isOk());
  }
}