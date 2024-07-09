package org.example;

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

  public List<Cell> getCells() {
    return cells;
  }

  long countAlive() {
    return getCells().stream().filter(Cell::isAlive).count();
  }
}
