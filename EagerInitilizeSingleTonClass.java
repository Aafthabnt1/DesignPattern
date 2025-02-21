public class EagerInitilizeSingleTonClass {
    private static EagerInitilizeSingleTonClass s=new EagerInitilizeSingleTonClass();

    private EagerInitilizeSingleTonClass(){

    }
    private static EagerInitilizeSingleTonClass getInstance(){
        return s;
    }

}
