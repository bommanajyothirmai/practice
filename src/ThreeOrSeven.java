public class ThreeOrSeven {
    public static void main(String[] args){
        int a = 9;
        if ( a % 3 == 0 || a % 7 == 0){
            System.out.println("Number is Divisible by 3 or 7");
        } else {
            System.out.println("Number is Not Divisible By Both 3 and 7");
        }
    }
}
