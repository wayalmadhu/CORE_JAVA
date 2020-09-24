//Question:25
class evenOdd{
    public static void main(String args[]) {
        int eve=0,odd=0;
        int arr[] =new int[]{10,33,30,47,50};
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]%2==0)
            {
                eve = eve + arr[i];
            }
            else
            {
                odd = odd + arr[i];
            }
        }
        System.out.println("Sum of Even no ="+eve +" Sum of odd no ="+odd);
    }
}