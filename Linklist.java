public class Linklist{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    // public static Node head;   //since the head is static so it will always be same for even new linklist object ,it will take the same old head created in 1st linklist since its static
    // public static Node tail;
    public  Node head;
    public  Node tail;
    public static int size;
    //add at first start
    public void AddFirst(int data){
        Node newnode=new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next=head;    //link is created
        head=newnode;
    }
    //add at last 
    public void AddLast(int data){
        Node newnode=new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;
    }
    //print()
    public void print( ){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public void AddinMiddle(int index,int data){
        Node newnode=new Node(data);
        if(index==0){
            AddFirst(data);
            return;
        }
        size++;
        Node temp=head;
        // for(int i=0;i<index-1;i++){
        //     temp=temp.next;
        // }
        //or by while loop
        int i=0;
        while(i<index-1){
            temp=temp.next;
            i++;
        }
         newnode.next=temp.next;
            temp.next=newnode;
    }
    public int RemoveFirst(){
        if(size==0){
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int value=head.data;
            head=tail=null;
            size=0;
            return value;
        }
        int value=head.data;
        head=head.next;
        size--;
        return value;

    }
    public int Removelast(){
        if(size==0){
            return Integer.MIN_VALUE;
        }
        else if(size==1){                
            int val=tail.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node temp=head;
        //prev=i-2
        for(int i=0;i<size-2;i++){
            temp=temp.next;
        }
        int val=tail.data;
        temp.next=null;
        tail=temp;
        size--;
        return val;
    }
    public int iterativeSearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int recursiveSearch(int key){
        return helper(head,key);
    }
    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public void removefromnth(int n){
        //calculate size
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        if(n==sz){
            head=head.next;
        }
        Node prev=head;
        int i=1;
        int itofind=sz-n;
        while(i<sz-n){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }
    public Node findmiddle( Node head){
        Node slow=head;
        Node fast=head;
               while(fast!=null&&fast.next!=null){
            fast=fast.next.next;  //+2
            slow=slow.next;   //+1
        
        }
        return slow;  //slow is my mid node
    }
    public boolean palindrome(){
        if(head==null||head.next==null){
            return true;
        }
        //1.find mid
        Node mid=findmiddle(head);
        //2.reverse the 2nd half ll
        Node prev=null;
        Node curr= mid;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;  //right half head
        Node left=head;   //left half head
        //3.check both the halfs
        while(right!=null){
            if(right.data!=left.data){
                return false;
            }
            right=right.next;
            left=left.next;
        }
        return true;
    }
    public static void main(String[]args){
        Linklist ll=new Linklist();   //we are creating object bcoz functions inside class are not static
        // ll.head=new Node(1);
        // ll.head.next=new Node(2);
        ll.AddFirst(10);
        ll.AddFirst(20);
        ll.AddLast(30);
        ll.AddLast(40);
        ll.print();
        ll.AddinMiddle(1,50);
        ll.print();
        System.out.println(size);
        System.out.println(ll.iterativeSearch(30));
        ll.reverse();
        ll.print();
        ll.removefromnth(2);
        ll.print();
        Linklist l2=new Linklist();
        l2.AddLast(1);
        l2.AddLast(2);
        l2.AddLast(1);
        System.out.println(l2.palindrome());


    }
}