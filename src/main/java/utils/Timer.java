package utils;

import java.time.Instant;
import java.util.concurrent.Callable;

public class Timer {

    public static void calculate(String name, Callable<Void> fn, int times) throws Exception {
        long executions = 0;

        for (int i = 0; i < times; i++) {
            var before = Instant.now().toEpochMilli();
            fn.call();
            var total = Instant.now().toEpochMilli() - before;
            executions += total;
        }

        long avg = executions / times;

        System.out.println(name + ": " + avg + "ms");
    }

}
