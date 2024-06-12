package com.pingwit.part_15.point_4;

import java.io.IOException;

public class Car {
    boolean start() throws MyCustomException, IOException {
        return false;
    }

    boolean stop() throws RuntimeException {
        return false;
    }
}