package com.slp.springbootinit.enum_;

public enum Status {
  WAIT("wait"),RUNNING("running"),SUCCEED("succeed"),FAILED("failed");

  private final String name;

  Status(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}