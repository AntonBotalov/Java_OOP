package ru.gb.lessons.interfaces.core;

import ru.gb.lessons.interfaces.core.clients.*;
import ru.gb.lessons.interfaces.core.clients.Runnable;

import java.util.ArrayList;
import java.util.List;

public class VetClinic {
    private final List<Animal> animals;

    public VetClinic(Human headPhysician) {
        this.animals = new ArrayList<>();
    }

    private static void heal(Animals patients) {
        System.out.println(patients.getClassName() + "вылечен");
    }

    public List<Swimable> getSwimingAnimals(Animals patients) {
        List<Swimable> swimmingAnimals = new ArrayList<>();
        for (Animal element : this.animals) {
            if (element instanceof Swimable) swimmingAnimals.add((Swimable) element);
        }
        return swimmingAnimals;
    }

    public List<Runnable> getRunningAnimals() {
        List<Runnable> runningAnimals = new ArrayList<>();

        for (Animal element : this.animals)
            if (element instanceof Runnable) runningAnimals.add((Runnable) element);

        return runningAnimals;
    }

    public List<Flyable> getFlyingAnimals() {
        List<Flyable> flyingAnimals = new ArrayList<>();

        for (Animal element: this.animals)
            if (element instanceof Flyable) flyingAnimals.add((Flyable) element);

        return flyingAnimals;
    }

    public List<Soundable> getSpeakingAnimals() {
        List<Soundable> speakingAnimals = new ArrayList<>();

        for (Animal element: this.animals)
            if (element instanceof Soundable) speakingAnimals.add((Soundable) element);

        return speakingAnimals;
    }

}
