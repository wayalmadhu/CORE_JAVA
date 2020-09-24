//Question22

class sort{
    public static void main(String args[]) {
        int arr[] = new int[] {3,5,6,8,2,9,12,21,14,16};
        int temp=0;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]<arr[j])
                {
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.println("Array elements after sorting");
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]+"");
        }
    }
}