package com.mock;

public class AnotherClass {

  public String method() {
    return StaticClass.staticMethod();
  }

  public String deepStub(Employee employee) {
    String postfix = employee.getAddress().getEmail().getPostfix();
    return postfix + "Test";
  }
}
