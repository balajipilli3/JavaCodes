package exe.exception;



public class exe2 {
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5};
        try{
            System.out.println(arr[6]);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
