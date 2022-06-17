public class doublyLL {
    private Node head;
    private Node tail;
    private int size;

    public doublyLL(){
        this.size=0;
    }
    public void insertf(int value){
        Node node=new Node(value);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head=node;
        size++;
    }

    public void insertl(int value){
       Node node = new Node(value);
        Node last=head;
         node.next=null;
         if(head==null){
             node.prev=null;
             head=node;
         }
         while(last.next!=null){
             last=last.next;
         }
         last.next=node;
         node.prev=last;

    }

    private class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value){
            this.value=value;
        }
        public Node(int value, Node next){
            this.value=value;
            this.next=next;
        }
        public Node(int value, Node next, Node prev){
            this.value=value;
            this.next=next;
            this.prev=prev;
        }
    }
    
    // public void display(){
    //     Node temp=head;
    //     Node last=null;
    //     while(temp!=null){
    //         System.out.print(temp.value +"->");
    //         last=temp;
    //         temp = temp.next;
    //     }
    //     System.out.println("End");

    //     System.out.println("Print in rev");
    //     while(last!=null){
    //         System.out.print(last.value+ "->");
    //         last=last.prev;
    //     }
    //     System.out.println("start");
    // }

    public void display(){
        Node tamp=head;
        while(tamp!=null){
            System.out.print(tamp.value +"->");
            tamp=tamp.next;
        }
        System.out.println("End");

    }

    
}
