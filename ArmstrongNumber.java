public class ArmstrongNumber {
    static int len(int n){
        String s=Integer.toString(n);
        return s.length();
    }
    static int arm(int n, int len){
        if(n==0)
            return 0;
        int c= n%10;
        return (int)Math.pow(c,len)+ arm(n/10,len);
    }

    static void arm(int n,int x, int total,int len){
        if(n==0){
            if (x==total)
            System.out.println(" it is armstrong number");
            else
                System.out.println(" it is not an armstrong number");
            return;
        }
        int c= n%10;
        total +=Math.pow(c,len);
        arm(n/10,x,total,len);
    }
    public static void main(String[] args) {
        int n=1634;
        arm(n,n,0,len(n));
        if(n==arm(n,len(n)))
            System.out.print(" it is armstrong number");
        else
            System.out.print(" it is not an armstrong number");
    }
 }
