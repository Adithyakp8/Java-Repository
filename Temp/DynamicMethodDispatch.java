package Temp;

public class DynamicMethodDispatch {
    public static void main(String args[]) {
        Animal obj = new Cat();
        obj.speak();
        ((Cat) obj).catWalk();
    }
}

class Animal {
    public void speak() {
        System.out.println("Speaking!!!");
    }
}

class Cat extends Animal {
    @Override
    public void speak() {
        System.out.println("Meowing!!!");
    }

    public void catWalk() {
        System.out.println("Cat is catwalking!!");
    }
}
