package Temp;

public enum Counter { // thread safe
    INSTANCE;

    public int i;

    public void increment() {
        i++;
    }
}
