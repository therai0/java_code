public class Two {

    public static void sortArr(int arr[])
    {
        for(int i = 0; i < arr.length-1; i++)
        {
            for(int l = 0; l < arr.length-1-i; l++)
            {
                if(arr[l] > arr[l+1])
                {
                    int temp = arr[l];
                    arr[l] =arr[l+1];
                    arr[l+1] = temp;
                }
            }
        }
       for(int i = 0; i < arr.length; i++)
       {
        System.out.print(arr[i] + " ");
       }
    }

    public static void main(String argu[])
    {
        int arra[]= {123,45,6,76,8};
        sortArr(arra);
    }
    
}
