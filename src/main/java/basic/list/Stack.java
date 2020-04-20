package basic.list;

import java.util.LinkedList;

/*Creating Stack class using LinkedList class
* */
public class Stack {

    LinkedList<Integer> list;

    public Stack() {
        this.list = new LinkedList<Integer>();
    }

    void push(Integer num){
        list.add(num);
    }

    void pop (){
        list.removeLast();
    }

    @Override
    public String toString() {
        return list.toString();
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);

        System.out.println(stack);

        stack.pop();
        System.out.println(stack);
    }
}
