public class CountSearchElement {

    static int lastIndex(int [] n,int e,int i){
        if(i==n.length-1)
            return 0;

        if(n[i]==e)
            return 1 + lastIndex(n,e,i+1);
        return lastIndex(n,e,i+1);
    }

    static void lastIndex(int [] n,int e,int count,int i){
        if(i==n.length-1){
            System.out.println(count);
            return;
        }
        if(n[i]==e)
            count+=1;
        lastIndex(n,e,count,i+1);
    }
    public static void main(String[] args) {
        int[] n={1,2,4,1,1,5};
        int element=1;
        lastIndex(n,element,0,0);
        System.out.println(lastIndex(n,element,0));
    }
 }
