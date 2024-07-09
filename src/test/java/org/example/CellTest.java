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

  @Test
  public void an_alive_cells_keeps_alive_with_two_alive_neighbors() {
    Cell cell = Cell.alive();
    List<Cell> neighbors = List.of(Cell.alive(), Cell.alive(), Cell.dead(), Cell.dead(), Cell.dead(), Cell.dead(), Cell.dead(), Cell.dead());

    Cell nextCell = cell.nextGeneration(neighbors);

    assertThat(nextCell.isAlive()).isTrue();
  }

  @Test
  public void an_alive_cells_keeps_alive_with_three_alive_neighbors() {
    Cell cell = Cell.alive();
    List<Cell> neighbors = List.of(Cell.alive(), Cell.alive(), Cell.alive(), Cell.dead(), Cell.dead(), Cell.dead(), Cell.dead(), Cell.dead());

    Cell nextCell = cell.nextGeneration(neighbors);

    assertThat(nextCell.isAlive()).isTrue();
  }

  @Test
  public void a_dead_cell_remains_dead_with_two_neighbors() {
    Cell cell = Cell.dead();
    List<Cell> neighbors = List.of(Cell.alive(), Cell.alive(), Cell.dead(), Cell.dead(), Cell.dead(), Cell.dead(), Cell.dead(), Cell.dead());

    Cell nextCell = cell.nextGeneration(neighbors);

    assertThat(nextCell.isAlive()).isFalse();
  }

  @Test
  public void a_dead_cell_revives_with_three_neighbors() {
    Cell cell = Cell.dead();
    List<Cell> neighbors = List.of(Cell.alive(), Cell.alive(), Cell.alive(), Cell.dead(), Cell.dead(), Cell.dead(), Cell.dead(), Cell.dead());

    Cell nextCell = cell.nextGeneration(neighbors);

    assertThat(nextCell.isAlive()).isTrue();
  }

  /*@Test
  public void an_alive_cells_keeps_alive_with_four_alive_neighbors() {
    Cell cell = Cell.alive();
    List<Cell> neighbors = List.of(Cell.alive(), Cell.alive(), Cell.alive(), Cell.alive(), Cell.dead(), Cell.dead(), Cell.dead(), Cell.dead());

    Cell nextCell = cell.nextGeneration(neighbors);

    assertThat(nextCell.isAlive()).isFalse();
  }*/
}
