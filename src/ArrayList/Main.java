package ArrayList;

public class Main {

    public static void main(String[] args){

        DynamicArray dynamicArray = new DynamicArray();
        System.out.println(dynamicArray.capacity);

        dynamicArray.add("Hi");
        dynamicArray.add("Bye");
        dynamicArray.add("Die");

        dynamicArray.insert(0,"X");

        System.out.println(dynamicArray);
        System.out.println(dynamicArray.isEmpty());
        System.out.println(dynamicArray.size);

    }
}
