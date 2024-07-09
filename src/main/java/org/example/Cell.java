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
    final long aliveNeighbors = neighbors.stream().filter(Cell::isAlive).count();
    if (aliveNeighbors == 2 || aliveNeighbors == 3) {
      return new Cell(true);
    }

    return new Cell(false);
  }

  public boolean isAlive() {
    return alive;
  }
}
