

public class BankAcc {
   private int accno;
   private  double balance;

  private  static float int_rate;
  static  {
    int_rate=7.25f;
}
public  BankAcc()
{
    accno=1012;
    balance=100000;
}
public BankAcc(int accno,double balance)
{
    this.accno=accno;
    this.balance=balance;
}
public void Display()
{
    System.out.println("Account number="+accno);
    System.out.println("Balance ="+balance);
}
public double  CalbalanceWithInt()
{
    return balance +(balance*int_rate/100);

}
 static float Updaterate(float nrate){

    return int_rate =nrate;

}
public static void main (String []args)
{
    BankAcc b1;
    b1=new BankAcc(12221,1000);
    System.out.println(b1.CalbalanceWithInt());
    BankAcc.Updaterate(7.12f);

}
    
}
