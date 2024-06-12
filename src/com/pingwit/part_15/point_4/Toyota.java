package com.pingwit.part_15.point_4;

import java.io.IOException;

public class Toyota extends Car {
    @Override
    public boolean start() throws MyCustomException, IOException {
        return false;
    }

    @Override
    public boolean stop() throws RuntimeException {
        return false;
    }

}
