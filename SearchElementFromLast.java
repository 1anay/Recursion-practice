public class SearchElementFromLast {

    static int lastIndex(int [] n,int e,int l){
        if(l==n.length-1)
            return 0;

        if (n[l] == e)
            if(!(lastIndex(n,e,l+1)>0))
                return l + lastIndex(n,e,l+1);

        return lastIndex(n,e,l+1);
    }

    static void lastIndex(int [] n,int e,int i,int l){
        if(l==0){
            System.out.println(i +" "+ l);
            return;
        }
            if (n[l] == e) {
                if (!(i > 0))
                    i = l;
            }
        lastIndex(n,e,i,l-1);
    }
    public static void main(String[] args) {
        int[] n={1,2,4,1,1,5};
        int element=1;
        int len=n.length;
        lastIndex(n,element,0,len-1);
        System.out.println(lastIndex(n,element,0));
    }
 }
