package Problems;

public class PrimeNumber {

    public void prime(){
        int i;
        int j;
        String primenumber="";
        for(i=1;i<=1000;i++) {
            int flag=0;
            for (j = i; j >=1; j--) {
                if (i % j == 0) {
                    flag = flag+1;

                }
            }
            if (flag == 2) {
                primenumber=primenumber+i+" ";
            }
        }
        System.out.println(primenumber);

    }

    public static void main(String[] args){
        PrimeNumber primeNumber=new PrimeNumber();
        primeNumber.prime();
    }
}
