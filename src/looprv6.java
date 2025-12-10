public class looprv6 {
    public static void main(String[] args) {
        int n=4;
        //for (int i = 1; i <= n; i++)
            for (int i = n; i >= 1; i--)//reverse
        {
            for (int j = 1; j <= i; j++)
            {


                if (i == n || i==j || j == 1)
                {
                    System.out.print(" * ");
                }
                else
                {

                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
