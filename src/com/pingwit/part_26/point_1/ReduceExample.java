package com.pingwit.part_26.point_1;
import com.pingwit.part_25.point_3.entity.Phone;

import java.util.List;
import java.util.Optional;
public class ReduceExample {
    public static void main(String[] args) {
        List<Phone> phones = List.of(
                new Phone("Xs", "Apple", 200),
                new Phone("8", "Apple", 400),
                new Phone("S10", "Samsung", 250),
                new Phone("S10", "Samsung", 350),
                new Phone("3310", "Nokia", 1000)
        );

        Optional<Integer> optionalPrice = phones.stream()
                .map(Phone::price)
                .reduce(Integer::sum);

        if (optionalPrice.isPresent()) {
            System.out.println(optionalPrice.get());
        }

        Integer totalPrice = phones.stream()
                .map(Phone::price)
                .reduce(1000, Integer::sum);
        System.out.println(totalPrice);


        Integer filteredTotalPrice = phones.stream()
                .map(Phone::price)
//                .filter(price -> price > 300)
                .reduce(1000,
                        (sum, price) -> {
                            if (price > 300) {
                                return sum + price;
                            } else {
                                return sum;
                            }
                        }
                );
        System.out.println("filteredTotalPrice=" + filteredTotalPrice);

        Integer superReducerTotalPrice = phones.parallelStream()
                .reduce(0,
                        (sum, phone) -> {
                            System.out.println(String.format("Accumulator: %s, %s", sum, phone));
                            return sum + phone.price();
                        },
                        (p1, p2) -> {
                            System.out.println(String.format("Combiner: %s, %s", p1, p2));
                            return p1 + p2;
                        }
                );
        System.out.println("superReducerTotalPrice=" + superReducerTotalPrice);

        phones.parallelStream()
                .reduce(0,
                        (sum, phone) -> sum + phone.price(),
                        Integer::sum
                );
    }
}
