package org.example;

public class DeadCell extends Cell {

  public DeadCell() {
    super();
  }

  @Override
  public boolean isAlive() {
    return false;
  }

  @Override
  public boolean isDead() {
    return true;
  }
}
