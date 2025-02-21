package DsaTopics.towerOfHanoi;

public class RecurssionReverseOrder {

    public String reverseOrder(String a, int n, StringBuilder s){

        if(n==-1){
            return s.toString();
        }
        s.append(a.charAt(n));
        reverseOrder(a,n-1,s);
        return s.toString();
    }
}
