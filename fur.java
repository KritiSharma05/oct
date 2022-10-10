import java.util.*;
class furitem
{
    int fcode;
    String ftype;
    String fgrade;
    String fcolor;
    String fusage;

    public int caltotal(String usage,int price)
    {
        fusage=usage;
        if(usage.equals("outdoor"))
        {
            System.out.println("the total amount to be paided after discount is : ");
            price=(price*95)/100;
        }
        else
        {
            System.out.println("no discount is there , total amout is : ");
            price=price;
        }
        return(price);
    }
}
class fur
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        Random r =new Random();
        furitem f=new furitem();
        int fcode=r.nextInt(90000000);
        System.out.println("The furniture code is  : " + fcode);
        System.out.println("Enter the type of furniture you want  : ");
        String ftype=obj.nextLine();
        System.out.println("Enter the grade of furniture you want  : ");
        String fgrade=obj.nextLine();
        System.out.println("Enter the color of furniture you want  : ");
        String fcolor=obj.nextLine();
        System.out.println("Enter the usage of furniture");
        String u=obj.nextLine();
        int p=r.nextInt(9000000);
        System.out.println("Price of the furniture is: "+ p);
        System.out.println(f.caltotal(u,p));

    }
}
