public class Linklist2{
    public static class Node{// static so that we dont have to create it as object or intstence of class linklist
            int data;
        Node next;
        public  Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static Node head2;
    public boolean iscycle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){   //floyed cycle finding algo
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
    //this is used only when the cycle is not connected back to head
    public static void removecycle(){
        Node slow=head;
        Node fast =head;
        boolean cycle=false;
        //detect cycle
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            return;
        }
        //find meeting point
        slow=head;
        Node prev=null;
        while(slow!=fast){
            slow=slow.next;
            prev=fast;
            fast=fast.next;
        }
        prev.next=null;
    }
    public void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }

    }
    public Node mergesort(Node head){
        //finding mid
        Node slow=head;
        Node fast=head.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;
        if(head==null||head.next==null){
            return head;
        }
        Node Righthead=mid.next;
        mid.next=null;
       Node newleft= mergesort(head);       //lefthalf
        Node newright=mergesort(Righthead);  //right half
        return merge(newleft,newright);
    }
    public Node merge(Node newleft,Node newright){
        Node mergelinklist=new Node(-1);
        Node temp=mergelinklist; 
        while(newleft!=null&&newright!=null){
            if(newleft.data<newright.data){
                temp.next=newleft;
                newleft=newleft.next;
                temp=temp.next;
            }
            else{
                temp.next=newright;
                newright=newright.next;
                 temp=temp.next;
            }
        }
        while(newleft!=null){
            temp.next=newleft;
            newleft=newleft.next;
             temp=temp.next;
        }
        while(newright!=null){
            temp.next=newright;
            newright=newright.next;
             temp=temp.next;
        }
        return mergelinklist.next;
    }
    public Node Zigzag(Node head){
         Node slow=head;
        Node fast=head.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;
        //reversing 2nd half
        Node curr=mid.next;  //head of 2nd half
        mid.next=null;
        Node pre=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;

        }
        Node temp=head;
        Node left=head;
        Node right=pre;
        Node nextL;Node nextR;
        //alternate merging
        while(left!=null&&right!=null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;
            left=nextL;
            right=nextR;
        }
        return temp;
    }
    public static void main(String[]args){
        Linklist2 ll=new Linklist2();
        head=new Node(1);    //wud work even without creating the object bcoz head is static
        
       Node temp=new Node(2);
       head.next=temp;
        head.next.next=new Node(3);
        head.next.next.next=temp;
        //1->2->3->1  cycle
        System.out.println(ll.iscycle());
        removecycle();
        System.out.println(ll.iscycle());
        Linklist2 l1=new Linklist2();
         head2=new Node(5); 
         head2.next=new Node(9);
         head2.next.next=new Node(11);
         head2.next.next.next= new Node(3);
         head2.next.next.next.next=new Node(8);  
        head2= l1.mergesort(head2);    
         l1.print(head2);
        head2= l1.Zigzag(head2);
         l1.print(head2);
    }
}