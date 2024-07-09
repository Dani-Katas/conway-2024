package org.example;

public class Cell {

  private final boolean alive;

  public Cell(final boolean alive) {
    this.alive = alive;
  }

  public static Cell alive() {
    return new AliveCell();
  }

  public static Cell dead() {
    return new DeadCell();
  }

  public Cell nextGeneration(final Neighbors neighbors) {
    if (!alive) {
      if(neighbors.countAlive() == 3) {
        return new Cell(true);
      }

      return new Cell(false);
    }

    if (neighbors.countAlive() == 2 || neighbors.countAlive() == 3) {
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
