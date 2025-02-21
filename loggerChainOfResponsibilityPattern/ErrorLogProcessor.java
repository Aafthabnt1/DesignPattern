package loggerChainOfResponsibilityPattern;

public class ErrorLogProcessor extends LoggerProcessor{
    public ErrorLogProcessor(LoggerProcessor nextLoggerProcessor) {
        super(nextLoggerProcessor);
    }
    public void log(int loglevel,String message){
        if(loglevel==error){
            System.out.println("ERROR: "+message);
        }else{
            super.log(loglevel,message);
        }
    }
}
