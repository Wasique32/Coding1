

public class Array {

public static void main (String[]args)
{
    Box [] rec=new Box[3];
    for(int i=0;i<rec.length;i++)
    {
        rec[0]=new Box(1,2,3);
        rec[1]=new Box();
        rec[2]=new Box(2,3,4);

    }
    for(int i=0;i<rec.length;i++)
    {
        rec[i].Display();
        rec[i].CalVol();
    }
}
}

    

