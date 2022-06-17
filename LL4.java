public class LL4 {
    private Node head;
    private Node tail;
    private int size;
    public LL4(){
        this.size=0;
    }
    public void insertf(int value){
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
            insertf(value);
            return;
        }
        Node node = new Node(value);
        tail.next=node;
        tail=node;
        size++;
    }

    public void insertat(int value, int index){
        if(index==0){
            insertf(value);
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

    //delete  first
    public int deletef(){
        if(head==null){
            tail=null; 
        }
       int value=head.value;
       head=head.next;
       size--;
       return value;
    }


    //delete last 
    public int deletelast(){
        if(size==1){
            return deletef();
        }
    
        int value=tail.value;
        Node tamp=head;
        for(int i=2; i<size; i++){
            tamp=tamp.next;
        }
        
        tamp.next=null;
        tail=tamp;
        size--;
        return value;
        

    }

    //delete current index
    public int delete(int index){
        if(index==0){
            return deletef();
        }
        if(index==size){
            return deletelast();
        }
        Node tamp=head;
        for(int i=1 ; i<index; i++){
            tamp=tamp.next; //previous
        }

        int value = tamp.next.value;
        tamp.next=tamp.next.next;
        size--;
        return value;
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
        System.out.println("End");
    }
    
}
