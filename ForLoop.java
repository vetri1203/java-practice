public class ForLoop {
    public static void main(String[] args){
        int[] nums = {0,1,2,3,4,5,6};

        int arrLength = nums.length;

        for(int index = 0;index < arrLength;index++)
        {
            System.out.println(nums[index]);
        }
        System.out.println("lenght of the array is "+arrLength);
    }
}
