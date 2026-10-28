class Node<T> {
    T data;
    Node<T> next;
    
    Node(T d) {
        data = d;
        next = null;
    }
}

class MyList<T> {
    Node<T> head;

    public void insert(T d) {
        Node<T> n = new Node<T>(d);
        if (head == null) {
            head = n;
        } else {
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
        }
    }

    public void display() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Prac9 {
    public static void main(String[] args) {
        MyList<Integer> list1 = new MyList<Integer>();
        list1.insert(5);
        list1.insert(10);
        list1.display();

        MyList<String> list2 = new MyList<String>();
        list2.insert("Hello");
        list2.insert("World");
        list2.display();
    }
}
