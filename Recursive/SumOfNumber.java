public class SumOfNumber {
     static int mul(int num){
        if(num>0)
        {
            return num + mul(num-1);
        }
        else{
            return num;
        }
        
    }
    public static void main(String[] args){
        int num = 20;
        int sum = mul(num);
        System.out.println(sum);

    }
}
