public class methodds
{
public static void main(String[] args)
{
    int n1 = 10;
    int n2 = 5;
    int n3 = min(n1,n2);
    System.out.println("Largest is "+ n3);
}       
public static int min(int x,int y)
{
    int largest;
    if(x<y)
        largest = y;
    else
        largest = x;
    return largest;
}
}