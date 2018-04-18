package chapter8;

import chapter0.PrintUtils;

class Shared {

  private static long counter = 0;
  private final long id = counter++;
  private int refcount = 0;

  public Shared() {
    PrintUtils.print("Creating " + this);
  }

  public void addRef() {
    refcount++;
  }

  protected void dispose() {
    if (--refcount == 0) {
      PrintUtils.print("Disposing " + this);
    }
  }

  public String toString() {
    return "Shared " + id;
  }
}

class Composing {

  private static long counter = 0;
  private final long id = counter++;
  private Shared shared;

  public Composing(Shared shared) {
    PrintUtils.print("Creating " + this);
    this.shared = shared;
    this.shared.addRef();
  }

  protected void dispose() {
    PrintUtils.print("disposing " + this);
    shared.dispose();
  }

  public String toString() {
    return "Composing " + id;
  }
}

public class ReferenceCounting {

  public static void main(String[] args) {
    Shared shared = new Shared();
    Composing[] composings = {new Composing(shared), new Composing(shared), new Composing(shared),
        new Composing(shared), new Composing(shared)};
    for (Composing c : composings) {
      c.dispose();
    }
  }
}
