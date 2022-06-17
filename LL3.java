public class LL3 {
    private Node head;
    private Node tail;
    private int size;
    public LL3(){
        this.size=0;
    }
    public void insertfirst(int value){
        Node node = new Node(value);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size++;
    }

    public void insertlast(int value){
        if(tail==null){
            insertfirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next=node;
        tail=node;
        size++;
    }

    public void insert(int value, int index){
        if(index==0){
             insertfirst(value);
             return;
        }
        if(index==size){
            insertlast(value);
            return;
        }
        Node tamp=head;
        for(int i=1; i<index; i++){
             tamp=tamp.next;
        }
        Node node = new Node(value, tamp.next);
        tamp.next=node;
        size++;
    }



    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }

        public Node(int value, Node next){
            this.next=next;
            this.value=value;
        }
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value + "->");
            temp=temp.next;
        }
        System.out.println();
    }
    
}
