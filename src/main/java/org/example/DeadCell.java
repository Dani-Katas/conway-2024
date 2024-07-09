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
  public Cell nextGeneration(final Neighbors neighbors) {
    if (neighbors.countAlive() == 3) {
      return Cell.alive();
    }

    return Cell.dead();
  }
}
