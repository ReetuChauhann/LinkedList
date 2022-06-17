public class duplill {
    private Node head;
    private int size;
    public duplill(){
        this.size=0;
    }
    public void insertf(int value){
        Node node=new Node(value);
        node.next = head;
        head=node;
    }



    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }
        public Node(int value, Node next){
            this.value=value;
            this.next=next;
        }
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            for(int i=0; i<size; i++){
                if(temp.value==temp.next.value){
                    i++;
                }else{
                    temp.next=temp.next.next;
                }
            }
            System.out.print(temp.value);
            temp=temp.next;
        }
        System.out.println("END");
    }
    
    
}
