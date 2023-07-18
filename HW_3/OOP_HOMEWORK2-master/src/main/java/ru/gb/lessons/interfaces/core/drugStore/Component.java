package ru.gb.lessons.interfaces.core.drugStore;

public class Component {
    private String name;
    private String weight;
    private int power;

    public Component(String name, String weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }
    @Override
    public String toString() {
        return "Component{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", power=" + power +
                '}';
    }

    public String getName() {
        return name;
    }
    public int getPower() {
        return this.power;
    }

    public int compareTo(Component o) {
        int compareResult = getName().compareToIgnoreCase(o.getName());
        return Integer.compare(compareResult, 0);
    }
}
