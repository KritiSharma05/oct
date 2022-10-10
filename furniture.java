import java.util.*;
class furnitureitem
{
    int fcode;
    String ftype;
    String fgrade;
    String fcolor;
    String fusage;
    int fprice;

    public furnitureitem()
    {
        Scanner obj=new Scanner(System.in);
        Random r=new Random();
        fcode=r.nextInt(90000000);
        ftype=obj.nextLine();
        fgrade=obj.nextLine();
        fcolor=obj.nextLine();
        fusage ="";
        fprice=0;
        System.out.println("the furniture code is :" + fcode);
        System.out.println("the furniture type is :" + ftype);
        System.out.println("the furniture grade is :" + fgrade);
        System.out.println("the furniture color is :" + fcolor);

    }

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
class furniture
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        Random r =new Random();
        furnitureitem f=new furnitureitem();
        System.out.println("Enter the usage of furniture");
        String u=obj.nextLine();
        int p=r.nextInt(9000000);
        System.out.println("Price of the furniture is: "+ p);
        System.out.println(f.caltotal(u,p));

    }
}
