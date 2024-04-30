package RecordClass;

public class Test2 {
    public static void main(String[] args) {
        Student stud1 = new Student(1, "Adithya"); // DTO -> Data Transfer Object
        Student stud2 = new Student(1, "Adithya");

        System.out.println(stud1.equals(stud2));
    }

    static record Student(int id, String name) {

    }
}
