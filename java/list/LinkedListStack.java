package list;
import list.Stack;

public class LinkedListStack<E> implements Stack<E> {


    private LinkedList<E> list;

    public LinkedListStack(){
        list = new LinkedList<>();
    }
    @Override
    public int getSize() {
        return list.getSize();
    }

    @Override
    public void push(E e) {
        list.addFirst(e);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public E pop() {
        return list.removeFirst();
    }

    @Override
    public E peek() {
        return list.getFirst();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Front:");
        res.append(list + "->");
        res.append("NULL");

        return res.toString();
    }
}
