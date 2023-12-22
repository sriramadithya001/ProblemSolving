import java.util.Scanner;

public class FindClosest {

    public static void sort(long[] arr) {
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i] > arr[j]) {
                    long temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static long getClosest(long[] arr) {
         long l = arr[0] , r = arr[arr.length-1],mn = r,mnDis = 0;
         for(int i=0;i<arr.length;i++) mnDis += (r - arr[i]);
         while(l < r) {
             long m = l + (r-l)/2;
             long dis = 0;
             for(int i=0;i<arr.length;i++) dis += Math.abs(m - arr[i]);
             if(dis <= mnDis) {
                 mn = m;
                 mnDis = dis;
                 r = m-1;
             }
             else {
                 l = m+1;
             }
         }
         return mn;
     }
     
     public static void foo(long[] arr) {
         for(long i=1;i<=18;i++) {
             System.out.print(i + " : ");
             long dis = 0;
             for(int j=0;j<arr.length;j++) dis += Math.abs(i - arr[j]);
             System.out.println(dis);
         }
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();long[] arr = new long[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        sort(arr);
        long ans = getClosest(arr);
        foo(arr);
        System.out.println(ans);
    }
}