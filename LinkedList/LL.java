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
        Node newNode = new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node currNode=head;
        while (currNode.next!=null)
        {
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }

    //printlist
    public void printList()
    {
        if(head==null)
        {
            System.out.println("LinkedList is empty");
        }
        Node currNode=head;
        while (currNode !=null)
        {
            System.out.print(currNode.data + " -> ");
            currNode=currNode.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("list");
        list.printList();

        list.addFirst("this");
        list.printList();
    }
}
