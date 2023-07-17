package ru.gb.lessons.interfaces.core.clients.home.impl;

import ru.gb.lessons.interfaces.core.clients.Flyable;
import ru.gb.lessons.interfaces.core.clients.Runnable;
import ru.gb.lessons.interfaces.core.clients.Swimable;
import ru.gb.lessons.interfaces.core.clients.owners.Owner;
import ru.gb.lessons.interfaces.core.clients.wild.WildAnimal;

import java.time.LocalDate;

public class Duck extends WildAnimal implements Flyable, Runnable, Swimable {
    public Duck() {
    }

    public Duck(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int fly() {
        System.out.println(CLASS_NAME+" летит со скоростью: 5км/ч");
        return 5;
    }

    @Override
    public int run() {
        System.out.println(CLASS_NAME+" ходит со скоростью: 2км/ч");
        return 2;
    }

    @Override
    public int swim() {
        System.out.println(CLASS_NAME+" плавает со скоростью: 5км/ч");
        return 5;
    }
}
