class Stack {
    int[] a = new int[5];
    int top = -1;

    public void push(int x) {
        if (top == 4) {
            System.out.println("Stack Full");
        } else {
            top++;
            a[top] = x;
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack Empty");
        } else {
            System.out.println("Removed: " + a[top]);
            top--;
        }
    }
}

class Queue {
    int[] q = new int[5];
    int front = 0;
    int rear = 0;

    public void enqueue(int x) {
        if (rear == 5) {
            System.out.println("Queue Full");
        } else {
            q[rear] = x;
            rear++;
        }
    }

    public void dequeue() {
        if (front == rear) {
            System.out.println("Queue Empty");
        } else {
            System.out.println("Removed: " + q[front]);
            front++;
        }
    }
}

public class Prac8 {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.pop();

        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.dequeue();
    }
}
