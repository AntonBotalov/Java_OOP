package ru.gb.lessons.interfaces.core.personal;

import ru.gb.lessons.interfaces.core.clients.Human;

public class Nurse extends Human {
    public Nurse(String fullName) {
        super(fullName);
    }

    public void help(){
        System.out.println("Помогла провести операцию");
    }
}
