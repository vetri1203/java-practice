public class StrindArray {
    public static void main(String[] args) {
        String str = "vetrivel is a good boy";
        String[] a1 = str.split(" ");
        System.out.println(a1);
        for (int i = 0; i < a1.length; i++) {
            System.out.println(a1[i]);







        }int len = str.length();

        char[] arr = new char[len];

        for(int i=0;i<len;i++)
        {
        arr[i] = str.charAt(i);

        // System.out.print(arr[i] + " ");
        }

        int temp ,j;
        for( temp=0,j=len-1;temp<j;)
        {
        char k = arr[temp];
        arr[temp] = arr[j];
        arr[j] = k;
        temp++;
        j--;
        }

        // System.out.print(arr);

        String s = new String(arr);
        System.out.println(s);

    }
}
