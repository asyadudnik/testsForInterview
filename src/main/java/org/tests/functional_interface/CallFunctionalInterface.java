package org.tests.functional_interface;

import static java.lang.System.*;

public class CallFunctionalInterface {
    private CallFunctionalInterface() {
    }

    public static final FInterface result = (x, y) -> x ^ y;

    public static void call(int x, int y) {
        out.println(result.multiply(x, y));

    }
}
