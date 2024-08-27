package com.pingwit.part_24.point_5;

public interface Operation {
    Integer process(Integer x, Integer y);

    default Operation andThen(Operation after, Integer input){
        return (x, y) -> after.process(process(x, y), input);
    }
}
