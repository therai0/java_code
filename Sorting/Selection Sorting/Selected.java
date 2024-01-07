public class Selected {


public static void main(String argu[])
{
    int arr[] = {20,4,24,7};

    for(int i = 0; i < arr.length; i++)
    {
        int small= i;
        for(int l = i+1; l < arr.length; l++)
        {
            if(arr[l] < arr[small])
            {
                small = l;
            }
        }

        int temp = arr[small];
        arr[small]= arr[i];
        arr[i] = temp;
    }

    for(int c: arr)
    {
        System.out.print(c + " ");
    }
}
    
}
