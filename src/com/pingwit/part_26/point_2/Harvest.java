package com.pingwit.part_26.point_2;
import java.math.BigDecimal;
public record Harvest(long id,
                      String field,
                      String plant,
                      BigDecimal weight) {
}
