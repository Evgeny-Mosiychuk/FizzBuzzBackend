package com.test.fizzbuzz.service;

import com.test.fizzbuzz.common.AbstractTest;
import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculateServiceImplTest extends AbstractTest {

  @Test
  void calculateNegative() {
    var negativeData = service.calculate(getNegativeData());
    var expected = new String("-1 -2 Fizz Buzz FizzBuzz");
    Assertions.assertEquals(expected, negativeData);
  }

  @Test
  void calculatePositive() {
    var negativeData = service.calculate(getPositiveData());
    var expected = new String("1 2 Fizz Buzz FizzBuzz");
    Assertions.assertEquals(expected, negativeData);
  }

  @Test
  void calculateEmptyList() {
    var emptyData = service.calculate(new ArrayList<>());
    var expected = new String("");
    Assertions.assertEquals(expected, emptyData);
  }
}