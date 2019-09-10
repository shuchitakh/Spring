package com.mock;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest({StaticClass.class})
public class StaticClassTest {

  private AnotherClass anotherClass;

  @Before
  public void setUp() {
    PowerMockito.mockStatic(StaticClass.class);
    anotherClass = new AnotherClass();
  }

  @Test
  public void testStatic() {
    PowerMockito.when(StaticClass.staticMethod()).thenReturn("abc");
    Assertions.assertEquals("abc", anotherClass.method());
  }

}
