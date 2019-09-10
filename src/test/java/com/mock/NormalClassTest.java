package com.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class NormalClassTest {
  @Mock
  Employee employee;

  NormalClass normalClass; //The class to test should be an actual object

  @BeforeEach
  void setup() {
    normalClass = new NormalClass(employee);
  }

  @DisplayName("Test a normal method using mockito")
  @Test
  void testStatic() {
    when(employee.getName()).thenReturn("name");
    when(employee.getAddress()).thenReturn(new Address());

    assertEquals("nameaddress", normalClass.testMethod(employee));
  }
}
