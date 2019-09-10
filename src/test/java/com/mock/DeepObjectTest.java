package com.mock;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Answers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class DeepObjectTest {
  @Mock(answer = Answers.RETURNS_DEEP_STUBS)
  Employee employee;

  AnotherClass anotherClass;

  @BeforeEach
  public void setUp() {
    anotherClass = new AnotherClass();
  }

  @Test
  public void testDeepStub() {
    Mockito.when(employee.getAddress().getEmail().getPostfix()).thenReturn("abc");
    Assertions.assertEquals("abcTest", anotherClass.deepStub(employee));
  }
}
