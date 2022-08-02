import java.util.*;
public class queue{
    public  int front = -1;
    public  int rear = -1;
    static   int number;

    public  int [] queue=new int[20];
    //ENQUEUE TO A QUEUE
    public void enqueue()
    {
        if(rear==19){
            System.out.println("Queue is empty");
        }
        else{
            rear++;
            queue[rear]=number;
            if(front ==-1){
                front=0;
            }

        }
    }

public  int dequeue()  {
        if(front==-1){
            System.out.println("Queue is empty");
        }
        else{
            if(front == rear)
                front=rear=-1;   
        }
        front++;
        return queue[front-1];
}

public  void display()
{
    if(front==-1)   {
        System.out.println("Queue is empty");
    }
    else{
        for(int i=front ;i<=rear ;i++)
        {
            System.out.println(queue[i]);
        }
    }

}



        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            queue obj1 =new queue();
        
        System.out.println("Enter Quit for exit");
         String  c=sc.nextLine();
         while(c !="Quit"){
         System.out.println("press 1 for enqueue");
         System.out.println("press 2 for dequeue");
         System.out.println("press 3 for display");
            int  choic =sc.nextInt();
         switch(choic){
            case 1:
            System.out.println("enter number for enqueue");
            number =sc.nextInt();
                obj1.enqueue();
                System.out.println("enqueued successfully");
                 break;
             case 2:
             obj1.dequeue();
             System.out.println("dequeued successfully");
             break;
             case 3:
             obj1.display();
             break;
         }
        }
        }
}