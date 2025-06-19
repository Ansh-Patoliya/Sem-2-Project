public class Demo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello, World!");
        for (int i = 0; i < 10; i++) {
            System.out.println("Current number: " + i);
            Thread.sleep(1000); // Sleep for 1 second
        }

        int i = 0;
        while(true){
            System.out.println("Dharmil"+i);
            if(i== 5) break;
            i++;
        }
    }
}
