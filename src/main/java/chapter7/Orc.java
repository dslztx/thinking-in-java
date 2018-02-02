package chapter7;

import chapter0.PrintUtils;

class Villain {

  private String name;

  public Villain(String name) {
    this.name = name;
  }

  protected void set(String nm) {
    name = nm;
  }

  public String toString() {
    return "I'm a Villain and my name is " + name;
  }
}

public class Orc extends Villain {

  private int orcNumber;

  public Orc(String name, int orcNumber) {
    super(name);
    this.orcNumber = orcNumber;
  }

  public static void main(String[] args) {
    Orc orc = new Orc("Limburger", 12);
    PrintUtils.print(orc);
    orc.change("Bob", 19);
    PrintUtils.print(orc);
  }

  public void change(String name, int orcNumber) {
    set(name);
    this.orcNumber = orcNumber;
  }

  public String toString() {
    return "Orc " + orcNumber + ": " + super.toString();
  }

}
