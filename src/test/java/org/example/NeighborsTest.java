package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NeighborsTest {
  @Test
  void does_not_create_neighbors_with_nine_alive() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> Neighbors.withAliveAmount(9));
  }

  @Test
  void does_not_create_neighbors_with_a_big_amount() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> Neighbors.withAliveAmount(200));
  }

  @Test
  void does_not_create_neighbors_with_a_negative_amount() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> Neighbors.withAliveAmount(-1));
  }

  @Test
  void does_not_create_neighbors_with_a_big_negative_amount() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> Neighbors.withAliveAmount(-200));
  }
}