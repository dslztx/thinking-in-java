package chapter9.interfaceprocessor;

import chapter0.PrintUtils;

public class Apply {

  public static void process(Processor p, Object s) {
    PrintUtils.print("Using Processor " + p.name());
    PrintUtils.print(p.process(s));
  }
}
