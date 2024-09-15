package com.pingwit.part_25.point_1;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        AppleUser appleUser = new AppleUser(777, "Egorka");

        Map<Integer, AppleUser> storage = new HashMap<>();
        AppleUser add = add(appleUser, storage);

        AppleUser netflixUser = new AppleUser(775, "Netflix");
        Optional.ofNullable(netflixUser)
                .filter(user -> user.id() != null)
                .ifPresent(user -> storage.put(user.id(), user));

        System.out.println(add);
        System.out.println(storage);

        Optional<Integer> sum = sum("", 50);
        if (sum.isEmpty()) {
            System.out.println("Plohoe chislo");
        } else {
            System.out.println(sum.get());
    }
}
    private static AppleUser add(AppleUser appleUser, Map<Integer, AppleUser> storage) {
        if (appleUser != null && appleUser.id() != null) {
            return storage.put(appleUser.id(), appleUser);
        }

        return null;
    }
    private static Optional<Integer> sum(String input, Integer add) {
        return Optional.ofNullable(input)
                .filter(x -> !x.isEmpty())
                .map(Integer::valueOf)
                .map(number -> number + add);
    }
}
record AppleUser(Integer id, String name) {
}