package basic.list;

import java.util.LinkedList;

/*Creating Stack class using LinkedList class
 * */
public class Queue {

    LinkedList<Integer> list;

    public Queue() {
        this.list = new LinkedList<Integer>();
    }

    void push(Integer num){
        list.add(num);
    }

    void pop(){
        list.removeFirst();
    }

    @Override
    public String toString() {
        return list.toString();
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.push(20);
        queue.push(30);
        queue.push(40);
        queue.push(50);
        queue.push(60);
        queue.push(70);

        System.out.println(queue);

        queue.pop();
        System.out.println(queue);
    }
}
