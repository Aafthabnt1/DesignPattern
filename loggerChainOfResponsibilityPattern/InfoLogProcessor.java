package loggerChainOfResponsibilityPattern;

public class InfoLogProcessor extends LoggerProcessor{
    public InfoLogProcessor(LoggerProcessor nextLoggerProcessor) {
        super(nextLoggerProcessor);
    }
    public void log(int loglevel,String message){
        if(loglevel==info){
            System.out.print("INFO: "+message);
        }else{
            super.log(loglevel,message);
        }
    }
}
