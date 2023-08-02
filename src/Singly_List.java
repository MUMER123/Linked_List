import java.sql.Array;
import java.util.Arrays;

public class Singly_List {
    private Node head;
    public Singly_List(){

    }
    public Singly_List(int data){
        this.head = new Node(data);
    }
    public int getHead(){
        return head.getData();
    }
    public boolean isEmpty(){
        return this.head==null;
    }
    public void addNode(int data) {
        Node p = this.head;
        if (head == null) {
            this.head = new Node(data);
        } else {
            while(p.getNext()!=null){
                p = p.getNext();
            }
            p.setNext(new Node(data));
        }
    }
    void deleteNode(int val){
        if(this.head==null){
            return;
        }
        Node p  = this.head;
        while(p.getNext().getData()!=val){
            p = p.getNext();
        }
        p.setNext(p.getNext().getNext());
    }
    public void traversal(){
        Node p = this.head;
        while(p!=null){
            System.out.println(p.getData());
            p = p.getNext();
        }
    }
    public int length(){
        Node p = this.head;
        int count = 0;
        while(p!=null){
            p = p.getNext();
            count++;
        }
        return count;
    }
    public void addNodeAtIndex(int index,int data){
        Node p = this.head;
        for(int i=1;i<index;i++){
            p = p.getNext();
        }
        Node ptr = new Node(data);
        ptr.setNext(p.getNext());
        p.setNext(ptr);
    }
    public void deleteNodeAtIndex(int index){
        Node p = this.head;
        for(int i=1;i<index;i++){
            p = p.getNext();
        }
        p.setNext(p.getNext().getNext());
    }
    public void search(int data){
        Node p = this.head;
        while(p!=null){
            if(p.getData()==data){
                System.out.println("Found");
                return;
            }
            p = p.getNext();
        }
        if(p==null){
            System.out.println("Not Found");
        }
    }
    public void insertAtBeg(int data){
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
    }
    public void deleteFromBeg(){
        this.head = head.getNext();
    }
    public void reverse(){
        Singly_List l1 = new Singly_List();
        while(head!=null){
            l1.insertAtBeg(this.head.getData());
            deleteFromBeg();
        }
        this.head = l1.head;
    }
    public void sort(){
        int[] arr = new int[length()];
        for(int i=0;i<arr.length;i++){
            arr[i] = head.getData();
            deleteFromBeg();
        }

        Arrays.sort(arr);
        for(int i=arr.length-1;i>=0;i--){
            insertAtBeg(arr[i]);
        }
        traversal();
    }

}
