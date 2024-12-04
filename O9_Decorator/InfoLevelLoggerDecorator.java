package O9_Decorator;

public class InfoLevelLoggerDecorator extends LoggerDecorator{
    private Logger logger = null;
    public InfoLevelLoggerDecorator(Logger logger){
        this.logger = logger;
    }
    @Override
    public void log(String message) {
        logger.log("[ INFO ]: "+message);
    }
}
