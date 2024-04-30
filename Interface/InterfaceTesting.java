package Interface;

public class InterfaceTesting {
    public static void main(String[] args) {
        InterfaceTest test = new InterfaceTest() {

            @Override
            public int add(int a, int b) {
                return a + b;
            }

        };
        System.out.println(test.add(5, 6));
    }
}