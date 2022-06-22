package com.company;
import java.util.ArrayDeque;
import java.util.Deque;

public class QuKonsumowanie {
    Deque<Command> kolejka = new ArrayDeque<>();
    public QuKonsumowanie(Deque<Command> kolejka) {
        this.kolejka = kolejka;
    }
    public void konsumowanie() {
        for (Command element : this.kolejka) {
            element.operation();
            kolejka.pop();
        }
    }
}
