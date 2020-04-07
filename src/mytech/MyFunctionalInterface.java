package mytech;

import java.lang.FunctionalInterface;

@FunctionalInterface
public interface MyFunctionalInterface {
    //this interface called functional interface since it has only one abstract method in it. eg; Runnable has run() method only.
    double getValue();
}
