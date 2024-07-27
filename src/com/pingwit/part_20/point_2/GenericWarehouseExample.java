package com.pingwit.part_20.point_2;

public class GenericWarehouseExample {
    public static void main(String[] args) {
        B[] bs = new B[10];
        C[] cs = new C[10];
        D[] ds = new D[10];

        GenericWarehouse<A, D> warehouse = new GenericWarehouse<>(ds);

        A[] data = warehouse.getData();
        warehouse.setData(cs);
        data = warehouse.getData();
    }
}

class GenericWarehouse<T, E> {
    private T[] data;
    private E[] users;

    public GenericWarehouse(T[] data) {
        this.data = data;
    }

    public T[] getData() {
        return data;
    }

    public void setData(T[] data) {
        this.data = data;
    }
}

interface A {

}

class B implements A {
}

class C implements A {

}

class D extends B {
}