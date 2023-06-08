public class PowerOfNumber {
        static int pow(int base,int x) {
            if (x == 0)
                return 1;
            return base * pow(base,x-1);
        }

        static void pow(int base,int x ,int result){
            if(x==0) {
                System.out.println(result);
                return;
            }
            pow(base,x-1,result*base);
        }

        public static void main(String[] args) {
            pow(5,3,1);
            System.out.println(pow(5,3));
        }
    }
