public class Partition {
    public static void main(String[] args) {
        int arr[]={20,30,5,1,7,8,9,4};
        System.out.println(partition(arr,5));
        System.out.println(partition(arr,9));
    }
    public static int partition(int arr[],int pivot)
    {
        int i=0;
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]<pivot)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }

        }


        for(int k: arr)
        {
            System.out.print(k+" ");
        }

        System.out.println();

        return i;
    }
}
