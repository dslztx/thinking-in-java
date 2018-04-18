package chapter8;

import chapter0.PrintUtils;

class Actor {

  public void act() {

  }
}

class HappyActor extends Actor {

  public void act() {
    PrintUtils.print("HappyActor");
  }
}

class SadActor extends Actor {

  public void act() {
    PrintUtils.print("SadActor");
  }
}

class Stage {

  private Actor actor = new HappyActor();

  public void change() {
    actor = new SadActor();
  }

  public void performPlay() {
    actor.act();
  }
}

public class Transmogrify {

  public static void main(String[] args) {
    Stage stage = new Stage();
    stage.performPlay();
    stage.change();
    stage.performPlay();
  }
}
