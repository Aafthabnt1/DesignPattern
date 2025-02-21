package hashMapInternalWorking;

public class HashMap1<K,V> {
    private static final int INITIAL_SIZE=1<<4;//16
    private static final int MAXIMUM_CAPICITY=1<<30;//30
    entry[] hashTable;
    public HashMap1(){
        hashTable =new entry[INITIAL_SIZE];
    }
    
    public HashMap1(int capicity){
        hashTable=new entry[findCrrtLength(capicity)];
    }

    final int findCrrtLength(int cap) {
        int n=cap-1;
        n|=n>>>1;
        n|=n>>>2;
        n|=n>>>4;
        n|=n>>>8;
        n|=n>>>16;
        return (n<0)?1:(n>=MAXIMUM_CAPICITY)?MAXIMUM_CAPICITY:n+1;


    }

    public void put(K key,V value){
        var hashCode=key.hashCode()%hashTable.length;
        entry node=hashTable[hashCode];
        if(node==null){
            entry newNode=new entry(key,value);
            hashTable[hashCode]=newNode;
        }else{
            entry previousNode=node;
            while(previousNode!=null){
                if(node.key==key){
                    node.value=value;
                    return;
                }
                previousNode=previousNode.next;
            }
            previousNode.next=new entry(key,value);
        }
    }
    public V get(K key){
        var hasCode=key.hashCode()%hashTable.length;
        entry node=hashTable[hasCode];
        if(node!=null){
            while(node!=null){
                if(node.key.equals(key)){
                    return (V)node.value;
                }
                node=node.next;
            }
        }
        return null;
    }

    class entry<K,V>{
        public K key;
        public V value;
        public entry next;

        entry(K key,V value){
            this.key=key;
            this.value=value;
        }

    }

}
