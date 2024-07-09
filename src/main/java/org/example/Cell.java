package org.example;

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

  public Cell nextGeneration(final Neighbors neighbors) {
    final long aliveNeighbors = neighbors.countAlive();
    if (!alive) {
      if(aliveNeighbors == 3) {
        return new Cell(true);
      }

      return new Cell(false);
    }

    if (aliveNeighbors == 2 || aliveNeighbors == 3) {
      return new Cell(true);
    }

    return new Cell(false);
  }

  public boolean isAlive() {
    return alive;
  }

  public boolean isDead() {
    return !alive;
  }
}
