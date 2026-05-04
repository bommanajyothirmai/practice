public class CompoundInterest {
    public static void main(String[] args){
        //coumpoundInterest formula = CI =  p * (1 + R/100)^t -p
        double principal = 50000;
        double rate = 2;
        double time = 2;
        double amount = principal * Math.pow((1+rate/100),time);
        double compoundInterest = amount - principal;
        System.out.println(compoundInterest);
    }
}
