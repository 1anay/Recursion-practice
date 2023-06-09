public class palindromeString {
    static boolean palin(String s,int index,int length){
        if(index==length)
            return true;
        if(!(index>length)) {
            if (s.charAt(index) == s.charAt(length - 1)) {
                length = length - 1;
                index = index + 1;
                return palin(s, index, length);
            } else
                return false;
        }
        else
            return true;
    }
    static void palin(String s,int index,int length,boolean flag){
        if(index==length){
            System.out.println(flag);
            return;
        }
        int a=0,b=0;
        if(!(index>length)) {
            if (s.charAt(index) == s.charAt(length - 1)) {
               a= index+1;
                b=length-1;
            } else
                flag = false;
        }
        else
            flag= true;
        palin(s, a, b,flag);

    }
    public static void main(String[] args) {
        String s="radar";
        int l=s.length();
        palin(s,0,l,true);
        System.out.println(palin(s,0,l));

    }
 }
