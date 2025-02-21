package loggerChainOfResponsibilityPattern;

public class DebugLogProcessor extends LoggerProcessor{
    public DebugLogProcessor(LoggerProcessor nextLoggerProcessor) {
        super(nextLoggerProcessor);
    }
    public void log(int loglevel,String message){
        if(loglevel==debug){
            System.out.print("DEBUG: "+message);
        }else{
            super.log(loglevel,message);
        }
    }
}
