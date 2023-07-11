public class Duck extends Animal{
    String creature = "duck";
    Boolean run = true;
    Boolean fly = true;
    Boolean swim = true;

    public Duck(String name, String color, Integer age, Boolean vaccination,
            String species, Integer legsCount,  Boolean run, Boolean fly, Boolean swim) {
        super(name, color, age, vaccination, species, legsCount, species, run, fly, swim);
    }
}
