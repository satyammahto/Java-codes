package practice;

import java.util.Arrays;
public class CreateArrayList<T> {

    private Object[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    public CreateArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if(isFull())
        {
            resize();
        }
        data[size++] = num;
    }

    public T remove()
    {
        if (isEmpty()) {
            System.out.println("List is Empty. PLease add a value First");
        }
        else{
            @SuppressWarnings("unchecked")
            T removed = (T)data[--size];
            return removed;
        }
        return null;
    }

    public T get(int index){
        return (T)data[index];
    }

    public void set(int index, T value){
        data[index] = value;
    }

    public int size(){
        return size;
    }

    public void clear(){
        for(int i=0; i<data.length; i++){
            size--;
        }
    }

    private void resize(){
        data = Arrays.copyOf(data , data.length*2);
    }

    private boolean isFull(){
        return size == data.length;
    }

    private boolean isEmpty(){
        return size == -1;
    }
    @Override
    public String toString() {
        data = Arrays.copyOf(data , data.length*2);
        return "ArrayList = " +
                Arrays.toString(data);
    }

    static void main() {
        CreateArrayList<Integer> list = new CreateArrayList<>();

        list.add(5);
        list.add(6);
        list.add(8);
        list.add(9);
        System.out.println(list);
    }
}
