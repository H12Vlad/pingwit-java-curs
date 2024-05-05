package com.pingwit.part_10.point_2;

public class Chair extends Furniture{

    private boolean rare;

    public Chair(String color, String material, boolean rare) {
        super(color, material);
        this.rare = rare;
        System.out.println("Hello from Chair");
    }

    @Override
    protected String getProducer() {
        return "IKEA";
    }

    @Override
    protected boolean isRare() {
        return rare;
    }

    @Override
    protected String model() {
        String model = super.model();
        return model + "2024";
    }
}
