package CP;

import java.util.Scanner;

public class Main {

    static int[] primes = new int[100001];
    static int[] fiboNums = new int[100000];

    static int ans = 0;

   public void genaratePrime(){

       primes[0] = 1;
       primes[1] = 1;

       for (int i = 3; i <= 100000 ; i+=2) {

           for (int j = i+i; j <= 100000 ; j+=i) {
               primes[j] = 1;
           }

       }

       for (int i = 4; i <= 100000 ; i+=2) {
           primes[i] = 1;
       }

   }

   public int fibo(int val){
       if(val == 0 || val == 1)return val;

       if(fiboNums[val] != -1)return fiboNums[val];

       fiboNums[val] = fibo(val-1)+fibo(val-2);

       if(primes[fiboNums[val]] == 0)ans++;

       return fiboNums[val];
   }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);


        main.genaratePrime();

        for (int i = 0; i < 100000; i++) {
            fiboNums[i] = -1;
        }

        int number =  sc.nextInt();

        main.fibo(number);

        System.out.println(ans);

    }
}
