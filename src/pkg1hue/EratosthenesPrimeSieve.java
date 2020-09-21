package pkg1hue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author afischerleitner17
 */
public class EratosthenesPrimeSieve implements PrimeSieve {
    int maxP;
    
    public EratosthenesPrimeSieve(int maxP){
        this.maxP = maxP;
    }
    
    @Override
    public boolean isPrime(int p) {
        for(int i = 2; i<p;i++){
            int rest = p%i;
            if(rest== 0){
                return false;
            }
        }
        return true;    
    }

    @Override
    public void printPrimes() {
         for(int i = 1;i<= this.maxP; i++){
             if(isPrime(i)==true){
                 System.out.println("i");
             }
         }
        
    }
    
}
