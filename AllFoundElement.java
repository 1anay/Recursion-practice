import java.util.ArrayList;
public class AllFoundElement {

    static boolean SearchElement(ArrayList<Integer> z,int e,int i){
        if(i==z.size())
            return false;

        if(z.get(i)==e)
            return true;
      return SearchElement(z,e,i+1);
    }
    static void print(ArrayList<Integer> a,int i){
        if(i==a.size())
            return;
        System.out.println(a.get(i));
        print(a,i+1);
    }

    static void ReplaceElement(int [] n,ArrayList<Integer> a,int i){
        if(i==n.length){
            print(a,0);
            return;
        }

     if(!(SearchElement(a,n[i],0))){
         a.add(n[i]);
     }
     ReplaceElement(n,a,i+1);
    }
    public static void main(String[] args) {
        int[] n={1,2,3,1,5};
        ArrayList<Integer> a= new ArrayList<Integer>();
        ReplaceElement(n,a,0);

    }
 }
