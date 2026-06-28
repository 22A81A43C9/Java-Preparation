import java.util.*;
public class Ex
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("EnterArray size: ");
            int n=sc.nextInt();
            int[] arr=new int[n];
            System.out.println("Enter Array Elements: ");
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            System.out.println(Arrays.toString(arr));
            System.out.println("helloworld");
            System.out.println(arr[n+1]);


        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index Out Of bound Exception");
        }
    }
}