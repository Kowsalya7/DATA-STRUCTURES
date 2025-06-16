import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
    }
}
class List
{
    Node head,tail;
    public void append(int data)
    {
        Node n = new Node(data);
        if(head==null)
        {
            head = n;
            tail=n;
        }
        else
        {
            tail.next = n;
            tail = n;
        }
        
    }
    public void display()
    {
        Node temp = head;
        if(head==null)
            System.out.println("No transactions found");
        else
        {
            while(temp!=null)
            {
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }
    public void sum()
    {
        Node temp = head;
        int s =0;
        if(head==null)
            System.out.println("No Scores found");
        else
        {
            while(temp!=null)
            {
                s+=temp.data;
                temp = temp.next;
            }
            System.out.println(s);
        }
    }
}
public class foodCourt
{
	public static void main(String[] args) {
	    List l = new List();
		Scanner sc = new Scanner(System.in);
		int x = 0;
		do{
		System.out.println("1.Visit the food court");
        System.out.println("2.View my transactions");
        System.out.println("3.Show my points");
        System.out.println("Enter your choice");
        x = sc.nextInt();
        switch(x)
        {
            case 1:
                System.out.println("Pay bill amount");
                int a = sc.nextInt();
                l.append(a);
                break;
            case 2:
                System.out.println("Card transactions");
                l.display();
                break;
            case 3:
                System.out.println("Gained points:");
                l.sum();
                break;
            default:
                System.out.println("Please visit again");
                
        }
        }while(x!=4);
	}
}
