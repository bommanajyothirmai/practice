public class primeNumbers {
    public static void main(String[] args){
        int i = 50;
        while (i <= 150){
            int count = 0;
            int j = 1;

            while(j<=i){
                if (i%j == 0){
                    count++;
                }
                j++;
            }
            if(count == 2){
                System.out.println(i);
            }
            i++;
        }
    }
}
