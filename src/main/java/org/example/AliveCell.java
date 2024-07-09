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
  public Cell nextGeneration(final Neighbors neighbors) {
    if (neighbors.countAlive() == 2 || neighbors.countAlive() == 3) {
      return Cell.alive();
    }

    return Cell.dead();
  }
}
