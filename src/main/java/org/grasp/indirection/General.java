package org.grasp.indirection;

import java.util.UUID;

public class General {

  private final String id = UUID.randomUUID().toString();

  public String getId() {
    return id;
  }
}
