package ZohoGraduationSchool;

import java.math.BigInteger;

public class BigIntType {
    public static void main(String[] args) {
        int n=64;
        BigInteger riceBag= BigInteger.valueOf(1);
        BigInteger totalRiceBag=BigInteger.valueOf(1);
        System.out.println("Rice Bag 1: "+riceBag);
        for(int i=2;i<=64;i++){
            riceBag=riceBag.multiply(BigInteger.valueOf(2));
            totalRiceBag=totalRiceBag.add(riceBag);
            System.out.println("Rice Bag "+ i +" :"+riceBag);
        }
        System.out.println(totalRiceBag);
    }
}
