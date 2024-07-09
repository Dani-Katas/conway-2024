package org.example;

public abstract class Cell {

  public static Cell alive() {
    return new AliveCell();
  }

  public static Cell dead() {
    return new DeadCell();
  }

  public abstract Cell nextGeneration(final Neighbors neighbors);

  public abstract boolean isAlive();

  public boolean isDead() {
    return !isAlive();
  }
}
