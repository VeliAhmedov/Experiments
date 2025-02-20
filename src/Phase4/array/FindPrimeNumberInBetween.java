package Phase4.array;

public class FindPrimeNumberInBetween {
    static public boolean prime(int n){
        boolean isPrime = true;
        if (n<=1){
            isPrime = false;
        }
        for (int i = 2; i < Math.abs(n); i++){
            //other than itself, beginning from 2, if you can't divide to any number then prime
            //considering all can be divided to 1 and itself
            if (n % i == 0){
                isPrime = false;
            }
        }
        return isPrime;
    }
    static public void findPrimeNumberInBetween(int num1, int num2){
        for (int i = num1; i <= num2; i++){
           if (prime(i)){
               System.out.print(i + " ");
           }
        }
    }
}
