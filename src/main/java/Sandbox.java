import com.speters33w.csv_enumbuilder.Main;

public class Sandbox {

    private Sandbox() {

    }

    public static void main(String[] mainArgs) {
        String[] args;

        args = new String[]{"src/main/java/examples/planets.csv"};
        Main.main(args);
        args = new String[]{"src/main/java/examples/primitives.csv", "Primitive"};
        Main.main(args);
        args = new String[]{"src/main/java/examples/directions_unformatted.csv"};
        Main.main(args);
        args = new String[]{"src/main/java/examples/directions.csv"};
        Main.main(args);
        args = new String[]{"src/main/java/examples/tests.csv", "Test"};
        Main.main(args);
        args = new String[]{"src/main/java/examples/PubChemElements_all.csv", "ElementUnformatted"};
        Main.main(args);
        args = new String[]{"src/main/java/examples/PubChemElements_all_formatted.csv", "Element"};
        Main.main(args);
    }

}
