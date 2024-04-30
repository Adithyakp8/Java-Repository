package AnonymousClass;

public class Test1 {
    public static void main(String[] args) {
        Animal animal = () -> System.out.println("bark");
        animal.noise();
    }
}