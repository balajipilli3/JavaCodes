package array.basics;

public class multiarr {
    public static void main(String args[]){
        int arr[][]={
                {2,5,6},
                {7,3,1},
                {9,4,0}
        };
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();

        }
    }
}
