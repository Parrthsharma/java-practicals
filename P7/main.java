/* generic class */
class MyBox<T> {
    T item;
    
    public void put(T x) {
        item = x;
    }
    
    public T get() {
        return item;
    }
}

public class Prac7 {
    
    /* generic method */
    public static <E> void printArray(E[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /* wildcard example */
    public static void showNumber(MyBox<? extends Number> b) {
        System.out.println("Number is " + b.get());
    }

    public static void main(String[] args) {
        Integer[] arr1 = {10, 20, 30};
        String[] arr2 = {"apple", "banana"};
        
        printArray(arr1);
        printArray(arr2);
        
        MyBox<Integer> b1 = new MyBox<Integer>();
        b1.put(100);
        showNumber(b1);
    }
}
