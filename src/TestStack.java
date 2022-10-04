import java.util.*;

class SinglyLinkedList<T> {

    class Node<T>{

        T data;

        Node<T> next;

        Node(T d, Node<T> n){

            data = d; next = n;

        }

        public String toString() {

            return data.toString();

        }

    }

    public Node<T> head, tail;



    public SinglyLinkedList() {

        this.head = this.tail = null;

    }



    public void insertNode(T nodeData) {

        Node<T> node = new Node<>(nodeData, null);

        if (head == null) {   //만약 기존 연결리스트에 다른 노드가 있다면 top의 포인터를 새 노드로 지정하고 내가 그 노드를 지정해야함
            head = node;
        } else{
            tail.next = node;
    }
        tail = node;
    }


    public SinglyLinkedList<T> reverse() {

        Stack<T> stack = new Stack<>();

        SinglyLinkedList<T> result = new SinglyLinkedList<T>();

        for(Node<T> p = head; p!= null; p = p.next)

            stack.push(p.data);

        while(!stack.isEmpty()) result.insertNode(stack.pop());

        return result;

    }

    public String toString() {

        String s = "";

        for(Node<T> p = head; p!= null; p=p.next)

            s+=p+" ";

        return s;

    }

}

public class TestStack{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt(); //노드의 개수를 정수로 받음

        SinglyLinkedList<String> list = new SinglyLinkedList<>();

        for(int i = 0; i < n; i++) list.insertNode(input.next());

        System.out.println("Original: "+list);

        System.out.println("Reverse: "+list.reverse());

        input.close();

    }

}


