package DsaTopics.towerOfHanoi;

public class TowerOfHanoi {
    public int towerOfHanoi(int n,String start,String helper,String destination){
        int s=1;
        if(n==0||n==1){
            return s;
        }
        s+=towerOfHanoi(n-1,start,destination,helper);
        s+=towerOfHanoi(n-1,helper,start,destination);
        return s;
    }
}
