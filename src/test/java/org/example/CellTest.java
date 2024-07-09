package org.example;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;

public class CellTest {
  @Test
  public void an_alive_cells_dies_with_all_neighbors_dead() {
    Cell cell = Cell.alive();
    List<Cell> neighbors = List.of(Cell.dead(), Cell.dead(), Cell.dead(), Cell.dead(), Cell.dead(), Cell.dead(), Cell.dead(), Cell.dead());

    Cell nextCell = cell.nextGeneration(neighbors);

    assertThat(nextCell.isAlive()).isFalse();
  }
}
