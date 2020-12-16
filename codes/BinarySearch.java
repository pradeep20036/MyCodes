package codes;

public class BinarySearch {
    public static void main(String[] args) {

        int arr[]={0,0,0,0,0,1};
        System.out.println(first(arr,0,arr.length-1));
    }

    static int first(int arr[],int left,int right)
    {
        if(left<=right)
        {
            int mid=(left+right)/2;
            if(arr[mid]==1 )
            {
                if(mid>0  && arr[mid-1]==1)
                    return first(arr,left,mid-1);
                else
                    return mid;
            }
            else
                return first(arr,mid+1,right);
        }
        else
            return -1;
    }
}
