public class Demo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello, World!");
        for (int i = 0; i < 10; i++) {
            System.out.println("Current number: " + i);
            Thread.sleep(1000); // Sleep for 1 second
        }
        System.out.println(factorial(6, 1));
    }

    public static int factorial (int n,int ans) {
        if(n==1) return ans;
        return factorial(n-1, ans*n);
    }
}
