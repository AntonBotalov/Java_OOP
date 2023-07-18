package ru.gb.lessons.interfaces.core.drugStore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pharmacy implements Iterable<Component>, Comparable<Pharmacy>, Marker {
    private List<Component> components;
    private int componentsCount;

    public Pharmacy() {
        this.components = new ArrayList<>();
        this.componentsCount = 0;
    }
    public Pharmacy addComponent (Component component) {
        this.components.add(component);
        this.componentsCount++;
        return this;
    }

    public List<Component> getComponents() {
        return components;
    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "components=" + components +
                ", index=" + componentsCount +
                '}'+"Total power = "+getDrugPower()+"\n";
    }

    @Override
    public Iterator<Component> iterator() {
//        return new Iterator<Component>() { //Анонимный класс
//            public Component next() {
//                return components.get(componentsCount++);
//            }
//
//            public boolean hasNext() {
//                return componentsCount < components.size();
//            }
//        };
        return new ComponentIterator();
    }

    public int getDrugPower() {
        int power = 0;
        for (Component component : components) {
            power += component.getPower();
        }
        return power;
    }

    @Override
    public int compareTo(Pharmacy o) {
        int power = getDrugPower();
        int comparison1 = Integer.compare(power, o.getDrugPower());

        return comparison1 == 0 ? compareComponents(o.components) : comparison1;
    }
//        Альтернативная запись:
//        if (pow1 > pow2) return 1;
//        else if (pow1 < pow2) return -1;
//        else return 0;

    public int compareComponents(List<Component> componentsToCompare) {
        int comparedLess = 0;
        int comparedMore = 0;
        for (Component c: this.components) {
            for (Component c1: componentsToCompare) {
                if (c.compareTo(c1) < 0) comparedLess++;
                else if (c.compareTo(c1) > 0) comparedMore++;
            }
        }
        return Integer.compare(comparedMore, comparedLess);
    }


}
