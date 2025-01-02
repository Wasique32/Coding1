
//package Day4;

public class DateD {
    int Day ;
    int Month ;
    int Year;
    public DateD()
    {

    }
    public DateD(int Day,int Month,int Year)
    {
        this.Day=Day;
        this.Month=Month;
        this.Year=Year;
    }
    public void Display()
    {
        System.out.println("Date="+Day+"-"+Month+"-"+Year);
    }
}
