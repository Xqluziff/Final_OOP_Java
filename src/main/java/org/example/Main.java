package org.example;

public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new LogCalculableFactory(new Log());
        ViewCalculator view = new ViewCalculator(calculableFactory);
        view.run();
    }
}