//Question:23
class reverseArray{
    public static void main(String args[]) {
        int arr[] = new int[] {10,11,12,13,14}; 
        System.out.println("Array elements after reversing");
        for(int i = arr.length-1; i>=0; i--)
        {
            System.out.println(arr[i]+"");
        }
    }
}