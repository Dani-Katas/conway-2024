package org.example;

public class AliveCell extends Cell {

  public AliveCell() {
    super();
  }

  @Override
  public boolean isAlive() {
    return true;
  }

  @Override
  public boolean isDead() {
    return false;
  }
}
