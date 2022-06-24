class binarysearch
{
    public static void main(String args[])
    {
        int arr[]={2,3,5,6,7};
        int t=7;
       System.out.println(search(arr,t));

    }
    static int search(int arr[],int t)
    {
         int start=0,end=arr.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]<t)
            {
               start=mid+1;
            }
            else if(arr[mid]>t)
            {
                    end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}