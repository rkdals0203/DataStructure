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

        if (head == null) {
            node.next = head;	// 새 노드의 다음 노드로 head 노드를 연결
            head = node; //head 노드가 됨
        } else{
            tail.next = node; //마지막노드의 다음 노드가 새 노드를 가리키게함
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


