package org.example;

import java.util.List;

public class Cell {

  public static Cell alive() {
    return new Cell();
  }

  public static Cell dead() {
    return new Cell();
  }

  public Cell nextGeneration(final List<Cell> neighbors) {
    return new Cell();
  }

  public boolean isAlive() {
    return false;
  }
}
