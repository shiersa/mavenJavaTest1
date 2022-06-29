package package2;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Entity1 {
    private static final Logger logger = LoggerFactory.getLogger(Entity1.class);

    public static void main(String[] args) {
        System.out.println(logger.getClass().getName());
        logger.info("Entity1");
    }




}
