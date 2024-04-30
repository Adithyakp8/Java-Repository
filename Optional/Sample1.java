package Optional;

import java.util.Optional;

public class Sample1 {

    public static void main(String[] args) {
        String name = "Adithya";

        // if (name != null) {
        // System.out.println(name);
        // }else{
        // System.out.println("null value");
        // }

        Optional<String> optional = Optional.ofNullable(name);
        System.out.println(optional.orElse("null value"));
        System.out.println(optional.isPresent());
        optional.ifPresent(System.out::println);
        optional.filter(o -> o.equals("adithya")).ifPresent(System.out::println);
    }

}