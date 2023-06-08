public class CountZero {
        static int count(String s,int index){
            if(index==s.length())
                return 0;
            int count =0;
            if(s.charAt(index)=='0'){
                count =count +1;
            }
            return count + count(s,index+1);
        }
        static void count(String s,int index,int count){
            if(index==s.length()) {
                System.out.println(count);
                return ;
            }
            if(s.charAt(index)=='0')
                count++;
            count(s,index+1,count);
        }
        public static void main(String[] args) {
            String s="001002357102";
            count(s,0,0);
            System.out.println(count(s,0));
        }
    }
