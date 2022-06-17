import java.util.List;

public class reversedlinkedlist {
    static class linkedlist{
        private Node head;
        private Node tail;
        private int size;

      public linkedlist(){
            this.size=0;
        }

        //insertfirst
        public void insertf(int val){
            Node node=new Node(val);
            node.next=head;
            head=node;
            if(tail==null){
                tail=head;
            }
            size++;
     }

     //insertlast
     public void insertl(int val){
         Node node = new Node(val);
         if(tail==null){
            insertf(val);
            return;
         }
         tail.next=node;
         tail=node;
         size++;
     }
 


        //node class 
        class Node{
            private int val;
            private Node next;

            public Node(int val){
                this.val=val;
            }

            public Node(int val, Node next){
                this.val=val;
                this.next=next;
            }
        }

        //printitng 
        public void display(){
               Node temp=head;
               while(temp!=null){
                   System.out.print(temp.val+ " ");
                   temp=temp.next;
               }
            System.out.print(" END");
        }

        //to reverse the lisst 
        public void reverse(){
            Node prev=null;
            Node current=head;
            Node next=null;
            while(current!=null){
                next=current.next;
                current.next=prev;
                prev=current;
                current=next;
            }

            head=prev;
            
        }
    }

    public static void main(String[] args) {
        linkedlist list=new linkedlist();
        list.insertl(1);
        list.insertl(2);
        list.insertl(3);
        list.insertl(4);
        list.insertl(5);
        
        

        list.display();
        list.reverse();
        list.display();
        

        //to reverse a linked list

    }
}
