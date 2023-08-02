

public class Main {
    public static void main(String[] args) {
        Singly_List list = new Singly_List(5);
        list.addNode(10);
        list.addNode(1);
        list.addNode(22);
        //list.traversal();
        //System.out.println("Length of the list is: "+list.length());
        //list.deleteNode(15);
        //list.traversal();
        //list.addNodeAtIndex(2,25);
        //list.traversal();
        //list.deleteNodeAtIndex(2);
        //list.traversal();
        //list.search(10);
        //list.search(100);
//        list.reverse();
//        list.traversal();
        list.sort();
    }
}