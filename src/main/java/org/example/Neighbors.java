package org.example;

public enum Neighbors {
  ALL_DEAD,
  ONE_ALIVE,
  TWO_ALIVE,
  THREE_ALIVE,
  FOUR_ALIVE,
  FIVE_ALIVE,
  SIX_ALIVE,
  SEVEN_ALIVE,
  ALL_ALIVE;

  long countAlive() {
    return switch (this) {
      case ALL_DEAD -> 0;
      case ONE_ALIVE -> 1;
      case TWO_ALIVE -> 2;
      case THREE_ALIVE -> 3;
      case FOUR_ALIVE -> 4;
      case FIVE_ALIVE -> 5;
      case SIX_ALIVE -> 6;
      case SEVEN_ALIVE -> 7;
      case ALL_ALIVE -> 8;
    };
  }
}
