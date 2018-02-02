package chapter7;

import chapter0.PrintUtils;

class Game {

  Game(int i) {
    PrintUtils.print("Game constructor");
  }
}

class BoardGame extends Game {

  BoardGame(int i) {
    super(i);
    PrintUtils.print("BoardGame constructor");
  }
}

public class Chess extends BoardGame {

  Chess() {
    super(11);
    PrintUtils.print("Chess constructor");
  }

  public static void main(String[] args) {
    Chess x = new Chess();
  }
}
