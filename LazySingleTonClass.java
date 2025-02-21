public class LazySingleTonClass  {

    private static LazySingleTonClass l;

    public LazySingleTonClass() {
    }
    public  static LazySingleTonClass getObject(){
        if(l==null){
            l = new LazySingleTonClass();
        }
        return l;
    }

}
