package org.example;

public class Cell {

  protected final boolean alive;

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
        return Cell.alive();
      }

      return Cell.dead();
    }

    if (neighbors.countAlive() == 2 || neighbors.countAlive() == 3) {
      return Cell.alive();
    }

    return Cell.dead();
  }

  public boolean isAlive() {
    return alive;
  }

  public boolean isDead() {
    return !alive;
  }
}
