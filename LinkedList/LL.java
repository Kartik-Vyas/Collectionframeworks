package linkedlist;

class LL {
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data= data;
        }
    }
Node head;
    //add-first
    public void addFirst(String data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    
    //add-last
    public void addLast(String data)
    {
        
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        
    }
}
