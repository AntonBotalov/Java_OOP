package ru.gb.lessons.interfaces.core.clients.wild.impl;

import ru.gb.lessons.interfaces.core.clients.Runnable;
import ru.gb.lessons.interfaces.core.clients.Soundable;
import ru.gb.lessons.interfaces.core.clients.Swimable;
import ru.gb.lessons.interfaces.core.clients.owners.Owner;
import ru.gb.lessons.interfaces.core.clients.wild.WildAnimal;

import java.time.LocalDate;

/**
 Одна из реализаций дикого животного
 */
public class WildCat extends WildAnimal implements Runnable, Soundable {
    public WildCat() {
    }

    public WildCat(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int run() {
        System.out.println(CLASS_NAME+" бегает со скоростью: 10 км/ч");
        return 10;
    }

    @Override
    public int sound() {
        System.out.println(CLASS_NAME+" издает звук: 25 дБ");
        return 25;
    }
}
