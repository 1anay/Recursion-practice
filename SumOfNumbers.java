public class SumOfNumbers {
    static int sum(int n){
        if(n==0)
            return 0;
        return n + sum(n-1);
    }

    static void sum(int n, int total){
        if(n==0){
            System.out.println(total);
            return;
        }
        total+=n;
        sum(n-1,total);
    }
    public static void main(String[] args) {
        sum(3,0);
        System.out.println(sum(3));
        }
    }
