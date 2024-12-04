package O9_Decorator;

public class Client {
    public static void main(String[] args) {
        Logger logger = new ScreenLogger();

        logger = new TimeStampLevelLoggerDecorator(logger);
        logger.log("A Random Message!!");
        logger = new InfoLevelLoggerDecorator(logger);
        logger.log("A Random Message!!!");
    }
}
