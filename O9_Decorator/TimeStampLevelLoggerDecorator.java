package O9_Decorator;

public class TimeStampLevelLoggerDecorator extends LoggerDecorator{
    private Logger logger = null;
    public TimeStampLevelLoggerDecorator(Logger logger){
        this.logger = logger;
    }
    @Override
    public void log(String message) {
        logger.log("[ "+java.time.LocalDateTime.now()+" ]"+message);
    }



}
