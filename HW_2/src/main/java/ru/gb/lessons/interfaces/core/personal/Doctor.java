package ru.gb.lessons.interfaces.core.personal;

import ru.gb.lessons.interfaces.core.clients.Human;

public class Doctor extends Human {

    public Doctor(String fullName) {
        super(fullName);
    }

    public void Operation() {
        System.out.println("Успешно провел операцию");
    }

}
