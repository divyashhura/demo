public class Armstrong {
    public static void main(String args[])
    {
        int n=253;
        int temp = n;

        int i,j=0;
        while(n>0)
        {
            i=n%10;
            j=j+(i*i*i);
            n=n/10;
        }
        if(temp == j)
        {
            System.out.println("number is armstrong");
        }
        else{
            System.out.println("number is not armstrong");

        }

    }
}
