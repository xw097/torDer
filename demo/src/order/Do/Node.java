package order.Do;

public class Node {

    //前一个站点
    private Node prev;

    private Node next;

    private String name;

    public Node(String name) {
        this.name = name;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Node{" +
                "prev=" + prev +
                ", next=" + next +
                ", name='" + name + '\'' +
                '}';
    }
}
