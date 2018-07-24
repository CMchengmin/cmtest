package ykse.util;

import org.apache.log4j.*;
import org.testng.Reporter;

import java.io.File;

public class Log {
	public static Logger logger;
	public static String log4jdir;
    private static String filePath = "src/main/resources/log4j.properties";

    static {
        logger = Logger.getLogger("test_log");
        log4jdir = System.getenv( "log4jdir" );
        if(log4jdir==null)
        	log4jdir = "testlog";
        System.setProperty("log4jdir", log4jdir); 
        PropertyConfigurator.configure(new File(filePath).getAbsolutePath());
       
    }
    
    /**
     * 记录Info级别日志。
     *
     * @param message the message object.
     */
	public static void logInfo(Object message) {
        logger.info("[INFO] " + message);
       
    }

    /**
     * 记录测试步骤信息。
     *
     * @param message the message object.
     */
    public static void logStep(Object message) {
        logger.info("[STEP] " + message);
        Reporter.log("[STEP] " + message);
    }

    /**
     * 记录测试流日志。
     *
     * @param message the message object.
     */
    public static void logFlow(Object message) {
        logger.info("[FLOW] " + message);
        Reporter.log("[FLOW] " + message);
    }

    /**
     * 记录Error级别日志。
     *
     * @param message the message object.
     */
    public static void logError(Object message) {
        logger.error("[ERROR]   " + message);
        Reporter.log("[ERROR]   " + message);
    }

    /**
     * 记录Warn级别日志。
     *
     * @param message the message object.
     */
    public static void logWarn(Object message) {
        logger.warn("[WARN] " + message);
        Reporter.log("[WARN] " + message);
    }
}
