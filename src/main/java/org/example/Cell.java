package org.example;

public abstract class Cell {

  public static Cell alive() {
    return new AliveCell();
  }

  public static Cell dead() {
    return new DeadCell();
  }

  public Cell nextGeneration(final Neighbors neighbors) {
    if (isDead()) {
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

  public abstract boolean isAlive();

  public abstract boolean isDead();
}
