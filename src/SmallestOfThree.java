public class SmallestOfThree {
    public static void main(String[] args){
        int a = 5;
        int b = 10;
        int c = 15;
        if(a<=b&&a<=c){
            System.out.println("Smallest is: " + a);
        } else if(b<=a&&b<=c){
            System.out.println("Smallest is: " + b);
        } else {
            System.out.println("Smallest is: " + c);
        }
    }
}
