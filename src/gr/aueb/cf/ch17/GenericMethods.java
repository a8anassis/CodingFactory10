package gr.aueb.cf.ch17;

public class GenericMethods {

    public static void main(String[] args) {
        String[] strArr = {"Hello", "World"};
        printArray(strArr);

        Integer[] intArr = {1, 2, 3, 4, 5};
        printArray(intArr);
    }

    public static <T> void printArray(T[] arr) {
        for (T el : arr) {
            System.out.println(el);
        }
    }




}
