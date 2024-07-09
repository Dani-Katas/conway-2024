package org.example;

import java.util.ArrayList;
import java.util.List;

public class Neighbors {

  private final List<Cell> cells;

  private Neighbors(final List<Cell> cells) {
    this.cells = cells;
  }

  public static Neighbors of(
    final Cell cell1,
    final Cell cell2,
    final Cell cell3,
    final Cell cell4,
    final Cell cell5,
    final Cell cell6,
    final Cell cell7,
    final Cell cell8) {
    return new Neighbors(List.of(cell1, cell2, cell3, cell4, cell5, cell6, cell7, cell8));
  }

  static Neighbors allDead() {
    return of(Cell.dead(), Cell.dead(), Cell.dead(), Cell.dead(), Cell.dead(), Cell.dead(), Cell.dead(), Cell.dead());
  }

  static Neighbors withAliveAmount(final int amount) {
    if (amount > 8 || amount < 0) {
      throw new IllegalArgumentException("Amount of alive cells must be less than 9");
    }

    final ArrayList<Cell> cells = new ArrayList<>();

    for (int i = 0; i < 8; i++) {
      cells.add(i < amount ? Cell.alive() : Cell.dead());
    }

    return new Neighbors(cells);
  }

  long countAlive() {
    return cells.stream().filter(Cell::isAlive).count();
  }
}
