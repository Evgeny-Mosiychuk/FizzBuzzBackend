package com.test.fizzbuzz.controller;

import com.test.fizzbuzz.service.CalculateService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class NumbersController {
  private final CalculateService calculateService;

  @PostMapping("/")
  public String calculate(@RequestBody List<Integer> nums) {
    return calculateService.calculate(nums);
  }
}
