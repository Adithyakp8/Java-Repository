package Optional;

import java.util.Optional;

public class Sample2 {
    public static void main(String[] args) {

        Optional<String> name = display();
        System.out.println(name.orElse("null value"));
    }

    public static Optional<String> display() {

        String name = "adithya";
        return Optional.ofNullable(name);

    }
}
