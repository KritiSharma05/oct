import java.util.*;
class savingaccount
{
    long ano;
    String aname;
    float abalance;
    String astatus;
    public savingaccount(long n,String name,float b,String s)
    {
        ano=n;
        aname=name;
        abalance=b;
        astatus=s;
        System.out.println("The name of the account holder is: "+aname);
        System.out.println("The  account balance is: "+b);
        System.out.println("The  status of account  is: "+s);
    }
    public long size(long n )
    {
        long count=0,m=n,ac=0,i=0;
        while(n>0)
        {
            i=n%10;
            count=count+1;
            n=n/10;
        }
        if(count==12)
        {
            ac=m;
        }
        else
        {
            System.out.println("Account number should be of 12 digits : ");
            ac=m;
        }
        return(ac);
    }
    public long checkb(long bal)
    {
        return(bal);
    }
    public long credit(long bal,long more)
    {
        bal=bal+more;
        return(bal);
    }
    public long debit(long bal,long remove)
    {
        bal=bal-remove;
        return(bal);
    }
}
class savingaccountimp
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        Random r =new Random();
        //long start = 100000000000l;
        System.out.println("********** Welcome to online banking ************");
        System.out.println("Enter the name of the account holder");
        String na =obj.nextLine();
        long bal=r.nextLong(9000000);
        long acn=r.nextLong(900000000000l);
        savingaccount sa=new savingaccount(acn,na,bal,"Account Active");
        System.out.println("Account number is  : " +sa.size(acn));
        System.out.println("Enter amount to be deposited to your bank account :");
        long mo=obj.nextLong();
        long add=sa.credit(bal,mo);
        System.out.println("The account balance is : " + add);
        System.out.println("Enter amount to be withdrawed to your bank account :");
        long su=obj.nextLong();
        long sub=sa.debit(add,su);
        System.out.println("The account balance is : " +  sub);
        System.out.println("The account balance  after transactions is :" + sa.checkb(sub));
    }
}
