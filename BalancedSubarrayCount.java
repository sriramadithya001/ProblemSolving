import java.util.Scanner;

public class BalancedSubarrayCount {
    public static int gcd(int x,int y) {
	int res = 1;
	for(int i=1;i<=Math.min(x,y);i++) {
	    if(x%i==0 && y%i==0) res = i;
	}
	return res;
    }

    public static void solve() {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();int[] arr = new int[n];int balanced = 0;
	for(int i=0;i<n;i++) arr[i] = sc.nextInt();
	for(int i=0;i<n;i++) {
	    for(int j=i;j<n;j++) {
		int sum = 0, lcm = 1;
		for(int k=i;k<=j;k++) {
		    sum += arr[k];
		    lcm = (lcm*arr[k])/gcd(lcm,arr[k]);
		}
		if(sum%2 == lcm%2) balanced++;
	    }
	}
	System.out.println(balanced);
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	while(t-->0) solve();
    }
}