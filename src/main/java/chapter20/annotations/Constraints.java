package chapter20.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

enum ConstraintsA {
  A, B,
}

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface ConstraintsB {

}

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Constraints {

  int a = 10;

  int f() default 10;

  int[] ff() default {10, 20};

  String g() default "hello";

  String[] gg() default {"hello", "world"};

  Class h() default Constraints.class;

  Class[] hh() default {Constraints.class, Object.class};

  ConstraintsA j() default ConstraintsA.A;

  ConstraintsA[] jj() default {ConstraintsA.A, ConstraintsA.B};

  ConstraintsB k() default @ConstraintsB;

  ConstraintsB[] kk() default {@ConstraintsB, @ConstraintsB};
}