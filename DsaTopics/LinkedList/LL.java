package DsaTopics.LinkedList;

public class LL {
    Node head;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node insertFirst(Node newNode){
        if(head==null){
            head=newNode;
        }

        else {
            newNode.next = head;
            head = newNode;
        }
        return head;
    }
    public Node insertFirst(int val){
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
        }

        else {
            newNode.next = head;
            head = newNode;
        }
        return head;
    }

    public Node insertLast(Node newNode){

        if(head==null){
            head=newNode;
        }
        else{
            while (head.next!=null){
                head=head.next;
            }
            head.next=newNode;
        }
        return head;
    }

    public Node insertLast(int val){
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
        }
        else{
            var copy=head;
            while (copy.next!=null){
                copy=copy.next;
            }
            copy.next=newNode;
        }
        return head;
    }



}
