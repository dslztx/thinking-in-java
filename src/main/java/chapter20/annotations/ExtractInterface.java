package chapter20.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ~/Apps/jdk1.7/bin/apt -factory chapter20.InterfaceExtractorProcessorFactory chapter20/Multiplier.java -s chapter20
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface ExtractInterface {

  public String value();
}
