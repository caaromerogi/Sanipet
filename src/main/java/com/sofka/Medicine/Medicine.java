package com.sofka.Medicine;

public class Medicine {
    private String name;
    private Enum presentation;
    private Enum usage;
    private Enum quantity;
    private int stock;

    public Medicine(String name, Enum presentation, Enum usage, Enum quantity, int stock) {
        this.name = name;
        this.presentation = presentation;
        this.usage = usage;
        this.quantity = quantity;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "name='" + name + '\'' +
                ", presentation=" + presentation +
                ", usage=" + usage +
                ", quantity=" + quantity +
                ", stock=" + stock +
                '}';
    }
}
