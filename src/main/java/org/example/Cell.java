package org.example;

import java.util.List;

public class Cell {

  private final boolean alive;

  public Cell(final boolean alive) {
    this.alive = alive;
  }

  public static Cell alive() {
    return new Cell(true);
  }

  public static Cell dead() {
    return new Cell(false);
  }

  public Cell nextGeneration(final List<Cell> neighbors) {
    if (neighbors.get(0).isAlive()) {
      return new Cell(true);
    }

    return new Cell(false);
  }

  public boolean isAlive() {
    return alive;
  }
}
