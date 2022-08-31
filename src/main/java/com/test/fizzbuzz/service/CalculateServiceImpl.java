package com.test.fizzbuzz.service;

import com.test.fizzbuzz.config.ValueConfig;
import java.util.List;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CalculateServiceImpl implements CalculateService {

  private final ValueConfig config;

  public String calculate(List<Integer> numbers) {
    Map<Integer, String> map = config.getMapping();
    StringBuilder sb = new StringBuilder();
    for (Integer number: numbers) {
      StringBuilder numberPresentation = new StringBuilder();
      for (Map.Entry<Integer, String> entry: map.entrySet()) {
        if (number % entry.getKey() == 0) {
          numberPresentation.append(entry.getValue());
        }
      }
      if (numberPresentation.length() == 0) {
        sb.append(number);
      } else {
        sb.append(numberPresentation);
      }
      sb.append(" ");
    }


//    StringBuilder sb = new StringBuilder();
//    for (Integer number: numbers) {
//      if (number % 3 == 0 && number % 5 == 0) {
//        sb.append("FizzBuzz");
//      } else if (number % 3 == 0) {
//        sb.append("Fizz");
//      } else if (number % 5 == 0) {
//        sb.append("Buzz");
//      } else {
//        sb.append(number);
//      }
//      sb.append(" ");
//    }
    return sb.toString().trim();
  }
}
