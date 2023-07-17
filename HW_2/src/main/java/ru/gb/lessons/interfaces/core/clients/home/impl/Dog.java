package ru.gb.lessons.interfaces.core.clients.home.impl;

import ru.gb.lessons.interfaces.core.clients.Runnable;
import ru.gb.lessons.interfaces.core.clients.Soundable;
import ru.gb.lessons.interfaces.core.clients.home.Pet;
import ru.gb.lessons.interfaces.core.clients.owners.Owner;

import java.time.LocalDate;

/**
 Одна из реализаций домашнего животного
 */
public class Dog extends Pet implements Runnable, Soundable {
    public Dog() {
    }

    public Dog(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int run() {
        System.out.println(CLASS_NAME+" бегает со скоростью: 10 км/ч");
        return 10;
    }

    @Override
    public int sound() {
        System.out.println(CLASS_NAME+" издает звук: 30 дБ");
        return 25;
    }
}
