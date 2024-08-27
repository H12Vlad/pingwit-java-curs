package com.pingwit.part_24.point_4;

public class LambdaConstructorReferenceExample {
    public static void main(String[] args) {
        NetflixUserSupplier netflixUserSupplier = NetflixUser::new;

        NetflixUser egorka = netflixUserSupplier.supply("Egorka", 25);
        System.out.println(egorka);
    }
}
