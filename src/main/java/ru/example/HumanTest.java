package ru.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    Human donald = new Human("Donald");

    @Test
    void move() {
        assertEquals("Donald", donald.getName());
    }
}