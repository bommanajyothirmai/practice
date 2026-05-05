public class TwoNotFive {
    public static void main(String[] args){
        int a = 8;
        if ( a % 2 == 0 && a % 5 != 0){
            System.out.println(a + " Number divisible by 2 but not divisible by 5");
        } else {
            System.out.println(a + "Number either divisible by 2 only");
        }
    }
}
