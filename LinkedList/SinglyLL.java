package LinkedList;

public class SinglyLL {
  private Node head;
  private Node tail;
  private int size;
  public SinglyLL(){
    this.size = 0;
  }
  //insert element at first of linkedlist
  public void insertFirst(int val){
    Node node = new Node(val);
    node.next = head;
    head=node;
    if(tail==null){
        tail= head;
    }
    size = size+1;
  }
   //insert element at Last of linkedlist
  public void insertLast(int val){
    if(tail==null){
        insertFirst(val);
        return;
    }
    Node node = new Node(val);
    tail.next=node;
    size++;
  }
   //insert element at given index of linkedlist
    public void insert(int val,int index){
        if(index ==0){
            insertFirst(val);
            return;
        }
        if(index==size){
          insertLast(val);
          return;
        }
        Node temp = head;
        for(int i=1;i<index;i++){
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;
    }
    //insert using recursion 
     public void insertRec(int val,int index){
        head = insertRec(val,index,head);
    }
    private Node insertRec(int val, int index , Node node){
     if (index == 0){
        Node temp = new Node(val,node);
        size ++;
        return temp;
     }
     node.next = insertRec(val , index--,node.next);
     return node;
    }
    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
          node=node.next;  
        }
        return node;
    }
     //delete element at first of linkedlist
    public int deleteFirst(){
        int val=head.value;
        head =head.next;
        if(head==null){
            tail=null;
        }
       

        size--;
        return val;
    }
    //delete last node
    public int deleteLast(){
        if(size<1){
          return deleteFirst();
        }
        Node secondLast=get(size-2);
        int val = tail.value;
        tail=secondLast;
        tail.next=null;
         return val;
    }
    //delete perticular index
    public int delete(int index){
       if(index==0){
        return deleteFirst();
       }
       if(index==size-2){
        return deleteLast();
       }
        Node prev = get(index-1);
        int val =prev.next.value;
        prev.next = prev.next.next;
        return val;
    }
    //find value at perticular index
    public   Node find(int value){
        Node node = head;
        while(node!=null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;      
    }
    //display  the entire linkedlist
  public void display(){
    Node temp = head;
    while(temp!=null){
        System.out.print(temp.value + " -> ");
        temp = temp.next;
    }
    System.out.println("End");
  }
   private class Node{
    private int value;
    private Node next;

    private  Node(int value){
        this.value = value;
    }

     private  Node(int value , Node next){
        this.value = value;
        this.next = next;
    }
   }
}
