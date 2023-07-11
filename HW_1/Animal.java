public class Animal {
    private String name;
    private Integer age;
    private String vaccination;
    private String color;
    private String species;
    private Owner owner;
    private Integer legsCount;
    private Boolean run;
    private Boolean fly;
    private Boolean swim;
    private String creature;

    public Animal(String name, Integer age, String vaccination, String color, String species, Owner owner,
            Integer legsCount, Boolean run, Boolean fly, Boolean swim, String creature) {
        this.name = name;
        this.age = age;
        this.vaccination = vaccination;
        this.color = color;
        this.species = species;
        this.owner = owner;
        this.legsCount = legsCount;
        this.run = run;
        this.fly = fly;
        this.swim = swim;
        this.creature = creature;
    }

    public Animal(String name, String color, Integer age, Boolean vaccination, String species, Integer legsCount,
            String creature, Boolean run, Boolean fly, Boolean swim) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.species = species;
        this.legsCount = legsCount;
        this.run = run;
        this.fly = fly;
        this.swim = swim;
        this.creature = creature;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void foo() {
        System.out.println("I'm Foo");
    }

    public void toGo() {
        if (this.run) {
            System.out.println(this.name + ": I can run");
        } else {
            System.out.println(this.name + ": I can't run");
        }

    }

    public void toFly() {
        if (this.fly) {
            System.out.println(this.name + ": I can fly");
        } else {
            System.out.println(this.name + ": I can't fly");
        }
    }

    public void toSwim() {
        if (this.swim) {
            System.out.println(this.name + ": I can swim");
        } else {
            System.out.println(this.name + ": I can't swim");
        }
    }

    @Override
    public String toString() {
        return String.format("Animal: {name = %s, owner = %s}", name, owner);
    }

}