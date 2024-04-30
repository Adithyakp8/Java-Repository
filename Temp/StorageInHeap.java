package Temp;

class Memory implements Cloneable {
    int i;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + i;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Memory other = (Memory) obj;
        if (i != other.i)
            return false;
        return true;
    }

}

public class StorageInHeap {
    public static void main(String[] args) throws CloneNotSupportedException {

        Memory obj1 = new Memory();
        obj1.i = 8;

        // Shallow Copy by default
        // Memory obj2 = obj1;
        // System.out.println("Hashcode of obj1:" + obj1.hashCode());
        // System.out.println("Hashcode of obj2:" + obj2.hashCode());

        // deep copy
        // Memory obj2 = new Memory();
        // obj2.i = obj1.i;
        // System.out.println("Hashcode of obj1:" + obj1.hashCode());
        // System.out.println("Hashcode of obj2:" + obj2.hashCode());

        // // clonable
        // Memory obj2 = (Memory) obj1.clone();
        // System.out.println("Hashcode of obj1:" + obj1.hashCode());
        // System.out.println("Hashcode of obj2:" + obj2.hashCode());

        Memory obj2 = new Memory();
        obj2.i = 8;
        System.out.println("Hashcode of obj1:" + obj1.hashCode());
        System.out.println("Hashcode of obj2:" + obj2.hashCode());
        System.out.println(obj1.equals(obj2));

    }
}
