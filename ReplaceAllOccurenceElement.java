public class ReplaceAllOccurenceElement {

    static void print(int[] a,int i){
        if(i==a.length)
            return;
        System.out.print(a[i]+ " ");
        print(a,i+1);
    }

    static void ReplaceElement(int [] n,int e,int a,int i){
        if(i==n.length){
            print(n,0);
            return;
        }

        if(n[i]==e){
            n[i]=a;
        }
        ReplaceElement(n,e,a,i+1);
    }
    public static void main(String[] args) {
        int[] n={9,6,1,5,1};
        int newElement= 9;
        int element=1;
        ReplaceElement(n,element,newElement,0);

    }
 }
