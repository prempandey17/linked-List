 import java.util.Scanner;
public class Singly_LinkedList 
{
   

    

    static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    static Node head=null;

    static void insertion()
    {
        int data,choice,m,pos;
        Scanner sc=new Scanner(System.in);
      do{
        System.out.println("Enter data: ");
        data=sc.nextInt();
        Node new_node=new Node(data);
        if(head==null)
        {
             head=new_node;
        }
       
          else
          {

            System.out.println("press 1 to insert at begning, 2 to insert at end , 3 to add at specific postion : ");
            m=sc.nextInt();
            switch(m)
          {
             case 1:
                 new_node.next=head;
                 head=new_node;
                 break;
             case 2:
                 Node temp=head;
                 while(temp.next!=null)
                 {
                    temp=temp.next; 
                   
                 }
                 temp.next=new_node;
                  break;
             case 3:
                 System.out.println("Enter position values at you want to insertdata : ");
                 pos=sc.nextInt();
                 Node temp1=head;
                 for(int i=1;i<pos;i++)
                 {
                    new_node.next=temp1.next;
                    temp1.next=new_node;
                 }
                 break;
             }
        }
    
            System.out.println("If you want to enter more data press 0");
           choice=sc.nextInt();
    
        }while(choice==0); 
    


    }

    static void traverse()
    {
        Node temp=head;
        if(head==null)
        {
            System.out.print("Empty");

        }
        else{
           
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    
    static void delete()
    {
        int choice;
        Scanner sc1=new Scanner(System.in);
      if(head==null)
      {
        System.out.println("Empty list: : ");
      }
      else
      {
        do{
          System.out.println("data deleted enter 1 for 1st data, 2 for last data, 3 for specifc data :");
          int m1=sc1.nextInt();
        
          switch(m1)
          {
              case 1:
                head=head.next;
                break;
              case 2:
                Node temp1=null;
                Node temp=head;
                while(temp.next!=null)
                {
                    temp1=temp;
                    temp=temp.next;
                }
                temp1.next=null;
                break;
              case 3:
                System.out.println("Enter position values of element thot you what to deleted : ");
                int pos=sc1.nextInt();
                Node temp2=head;
                Node temp3=null;
                {
                    for(int i=0;i<pos-1;i++)
                    {
                        temp3=temp2;
                        temp2=temp2.next;
                    }
                    temp3.next=temp2.next;
                    break;
                }

            }
          System.out.println("press 0 if you want to delete more data: ");
          choice=sc1.nextInt();
        } while(choice==0);
    }
    }
    
    
    public static void main(String[] args)
    {   int choice;
        Scanner s=new Scanner(System.in);
       do{ 
        System.out.println("Press 1 for inserting data: ");
        System.out.println("Press 2 for Deleting data: ");
        System.out.println("Press 3 for Display data: ");
        int a=s.nextInt();
       switch(a)
       {
         case 1:
           insertion();
           break;
         case 2:
           delete();
           break;
         case 3:
           traverse();
             break;
       }

       System.out.println("To conitue Opertion Press 0");
       choice=s.nextInt();
    }while(choice==0);
    }


    
    
}
  


          

