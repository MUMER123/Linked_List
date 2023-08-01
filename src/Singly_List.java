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

}
