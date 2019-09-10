package com.mock;

public class Email {
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public String getPostfix() {
    return postfix;
  }

  public void setPostfix(String postfix) {
    this.postfix = postfix;
  }

  String prefix;
  String postfix;
}
