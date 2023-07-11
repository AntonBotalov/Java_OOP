import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal bars = new Cat("Barsik", "white", 1, true, null, 4,
                true, false, false);
        bars.toGo();
        bars.toFly();
        bars.toSwim();
        System.out.println();

        Animal cra = new Duck("Cra", "black", 3, null, null, 2,
                true, true, true);
        cra.toGo();
        cra.toFly();
        cra.toSwim();
        System.out.println();

    }
}
