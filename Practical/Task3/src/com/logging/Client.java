package com.logging;

public class Client {
    public static void main(String[] args) {
        // Step 1: Create handlers and configure the chain
        LogHandler infoHandler = new InfoHandler();
        LogHandler debugHandler = new DebugHandler();
        LogHandler errorHandler = new ErrorHandler();

        infoHandler.setNextHandler(debugHandler);
        debugHandler.setNextHandler(errorHandler);

        // Step 2: Create a Logger
        Logger logger = new Logger();

        // Step 3: Create commands for different severity levels
        logger.addCommand(new LogCommand(infoHandler, LogLevel.INFO));
        logger.addCommand(new LogCommand(infoHandler, LogLevel.DEBUG));
        logger.addCommand(new LogCommand(infoHandler, LogLevel.ERROR));

        // Step 4: Process commands
        logger.processCommands();
    }
}
