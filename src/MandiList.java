import java.util.Arrays;

public class MandiList<T> {
    private int capacity = 3;
    private T[] array;
    private int size = 0;

    public MandiList(int capacity) {
        this.capacity = capacity;
        this.array = (T[]) new Object[capacity];
    }

    public MandiList(){
        this.array = (T[]) new Object[capacity];
    }

    public void add(T element){
        if (size >= capacity){
            copyArrayNewSize();
        }
        this.array[size] = element;
        size++;
    }

    public void print(){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
    private void copyArrayNewSize() {
        capacity = capacity * 2;
        T[] localArray  = (T[]) new Object[capacity];
        for(int i=0; i<array.length/2; i++){
            localArray[i] = array[i];
        }
        size = array.length/2;
        this.array = localArray;
//        this.array = Arrays.copyOf(this.array, capacity*2);
    }
}
