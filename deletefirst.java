public class deletefirst {
    public static void main(String[] args) {
        LL4 list = new LL4();
        list.insertf(4);
        list.insertf(3);
        list.insertf(2);
        list.insertf(1);
        list.insertlast(5);
        list.insertat(0, 2);
        list.display();
        //System.out.println(list.deletef());
        //System.out.println(list.deletelast());
        System.out.println(list.delete(3));
        list.display();
    }
    }
    

