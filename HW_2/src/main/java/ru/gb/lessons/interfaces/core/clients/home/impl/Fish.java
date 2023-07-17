package ru.gb.lessons.interfaces.core.clients.home.impl;

import ru.gb.lessons.interfaces.core.clients.Swimable;
import ru.gb.lessons.interfaces.core.clients.home.Pet;
import ru.gb.lessons.interfaces.core.clients.owners.Owner;

import java.time.LocalDate;

/**
 Одна из реализаций домашнего животного
 */
public class Fish extends Pet implements Swimable {
    public Fish() {
    }

    public Fish(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int swim() {
        System.out.println(CLASS_NAME+" плавает со скоростью: 10км/ч");
        return 10;
    }

}
