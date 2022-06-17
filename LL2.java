public class LL2 {
    private Node head;
    private Node tail;
    private int size;
    public LL2(){
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
        Node node=new Node(value);
        tail.next=node;
        tail=node;
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
            System.out.print(temp.value + "->" );
            temp=temp.next;
        }
        System.out.print("END");
        
    }
    
}
