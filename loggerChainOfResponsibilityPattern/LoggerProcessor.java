package loggerChainOfResponsibilityPattern;

public abstract class LoggerProcessor {
    public static int info=1;
    public static int debug=2;
    public static int error=3;

    LoggerProcessor nextLoggerProcessor;

    public LoggerProcessor(LoggerProcessor nextLoggerProcessor) {
        this.nextLoggerProcessor = nextLoggerProcessor;
    }

    public void log(int logLevel,String message){
        if(nextLoggerProcessor!=null){
            nextLoggerProcessor.log(logLevel,message);
        }
    }
}
