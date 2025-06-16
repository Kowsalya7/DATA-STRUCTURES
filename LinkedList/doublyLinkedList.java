import java.util.*;
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data=data;
    }
}
class List
{
    Node head , tail;
    public void insert(int data)
    {
        Node n = new Node(data);
        if(head==null)
        {
            head = n;
            tail = n;
        }
        else
        {
            tail.next = n;
            n.prev = tail;
            tail = n;
        }
    }
    public void reverse()
    {
         Node temp = tail;
        if(head==null)
            System.out.println("Empty List");
        else
        {
            while(temp!=null)
            {
                System.out.println(temp.data);
                temp = temp.prev;
            }
        }
    }
    public void search(int data)
    {
        Node n = new Node(data);
        Node temp = head;
        int c =0;
        while(temp!=null)
        {
            if(data==temp.data)
            {
                System.out.println("The Element found in position "+(c+1));
                break;
            }
            else
            {
                temp = temp.next;
                c++;
            }
            
        }
        //System.out.println("Element not found");
    }
    public void maxnum()
    {
        int a =0;
        Node temp = head;
        while(temp!=null)
        {
            if(temp.data>a)
                a = temp.data;
            temp = temp.next;
        }
        System.out.println("The maximum element is "+a);
    }
    public void display()
    {
        Node temp = head;
        if(head==null)
            System.out.println("Empty List");
        else
        {
            while(temp!=null)
            {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
}
public class doublyLinkedList
{
	public static void main(String[] args) {
	    List l = new List();
		Scanner sc = new Scanner(System.in);
		int x = 0;
		do{
		System.out.println("1.Insert element");
        System.out.println("2.Reverse List");
        System.out.println("3.Search an element");
        System.out.println("4.Find maximum of list");
        System.out.println("5.Display the List");
        System.out.println("Enter your choice");
        x = sc.nextInt();
        switch(x)
        {
            case 1:
                int a = sc.nextInt();
                l.insert(a);
                break;
            case 2:
                l.reverse();
                //l.display();
                break;
            case 3:
                System.out.println("Enter an element to search");
                int y = sc.nextInt();
                l.search(y);
                break;
            case 4:
                l.maxnum();
                break;
            case 5:
                l.display();
                break;
            default:
                System.out.println("Please visit again");
                
        }
        }while(x!=6);
		
	}
}
