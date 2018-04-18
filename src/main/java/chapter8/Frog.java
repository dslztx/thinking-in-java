package chapter8;

import chapter0.PrintUtils;

class Characteristic {

  private String s;

  Characteristic(String s) {
    this.s = s;
    PrintUtils.print("Creating Characteristic " + s);
  }

  protected void dispose() {
    PrintUtils.print("disposing Characteristic " + s);
  }
}

class Description {

  private String s;

  Description(String s) {
    this.s = s;
    PrintUtils.print("Creating Description " + s);
  }

  protected void dispose() {
    PrintUtils.print("disposing Description " + s);
  }
}

class LivingCreature {

  private Characteristic p = new Characteristic("is alive");
  private Description t = new Description("Basic Living Creature");

  LivingCreature() {
    PrintUtils.print("LivingCreature");
  }

  protected void dispose() {
    PrintUtils.print("LivingCreature dispose");
    t.dispose();
    p.dispose();
  }
}

class Animal extends LivingCreature {

  private Characteristic p = new Characteristic("has heart");
  private Description t = new Description("Animal not Vegetable");

  Animal() {
    PrintUtils.print("Animal()");
  }

  protected void dispose() {
    PrintUtils.print("Animal dispose");
    t.dispose();
    p.dispose();
    super.dispose();
  }
}

class Amphibian extends Animal {

  private Characteristic p = new Characteristic("can live in water");
  private Description t = new Description("Both water and land");

  Amphibian() {
    PrintUtils.print("Amphibian()");
  }

  protected void dispose() {
    PrintUtils.print("Amphibian dispose");
    t.dispose();
    p.dispose();
    super.dispose();
  }
}


public class Frog extends Amphibian {

  private Characteristic p = new Characteristic("Croaks");
  private Description t = new Description("Eats Bugs");

  public Frog() {
    PrintUtils.print("Frog()");
  }

  public static void main(String[] args) {
    Frog frog = new Frog();
    PrintUtils.print("Bye!");
    frog.dispose();
  }

  protected void dispose() {
    PrintUtils.print("Frog dispose");
    t.dispose();
    p.dispose();
    super.dispose();
  }
}
