public class PrimeNumber {
   static Boolean Isprime(int n,int i) {
     if(n==i)
         return true;
     if(n<2)
         return false;
     if(n%i==0)
         return false;
     i++;
     return Isprime(n,i);
   }

    static void Isprime(int n ,int i,boolean flag){
       if(n==i) {
           System.out.println(flag);
           return;
       }
       if(n<2)
           flag= false;

       if(n%i==0)
           flag= false;
       Isprime(n,i+1,flag);
   }
    public static void main(String[] args) {
        Isprime(4,2,true);
        System.out.println("isprime " +Isprime(3,2));
    }
 }
