package chapter9;

import chapter0.PrintUtils;

interface Game {

  boolean move();
}

interface GameFactory {

  Game getGame();
}

class Checkers implements Game {

  private static final int MOVES = 3;
  private int moves = 0;

  public boolean move() {
    PrintUtils.print("Checkers move " + moves);
    return ++moves != MOVES;
  }
}

class CheckersFactory implements GameFactory {

  public Game getGame() {
    return new Checkers();
  }
}

class Chess implements Game {

  private static final int MOVES = 4;
  private int moves = 0;

  public boolean move() {
    PrintUtils.print("Chess move " + moves);
    return ++moves != MOVES;
  }
}

class ChessFactory implements GameFactory {

  public Game getGame() {
    return new Chess();
  }
}

public class Games {

  public static void playGame(GameFactory factory) {
    Game s = factory.getGame();
    while (s.move()) {

    }
  }

  public static void main(String[] args) {
    playGame(new CheckersFactory());

    playGame(new ChessFactory());
  }
}
