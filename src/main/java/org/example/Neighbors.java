package org.example;

public enum Neighbors {
  ALL_DEAD {
    @Override
    public long countAlive() {
      return 0;
    }
  },
  TWO_ALIVE {
    @Override
    public long countAlive() {
      return 2;
    }
  },
  THREE_ALIVE {
    @Override
    public long countAlive() {
      return 3;
    }
  },
  FOUR_ALIVE {
    @Override
    public long countAlive() {
      return 4;
    }
  };

  public abstract long countAlive();
}
