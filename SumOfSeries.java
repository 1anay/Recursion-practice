public class SumOfSeries {
    static void  sum(int n,double total){
    if(n==0) {
        System.out.println(total);
        return;
    }
        total += (n / Math.pow(n, n)) ;
        sum(n - 1, total);
    }

    static double sum(int n) {
    if(n==0)
        return 0;
    return (n / Math.pow(n, n)) + sum(n - 1);
    }

    public static void main(String[] args) {
            sum(3,0);
            System.out.println(sum(3));
    }
 }
