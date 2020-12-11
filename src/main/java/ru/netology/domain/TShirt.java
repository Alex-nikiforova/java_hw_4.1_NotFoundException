package ru.netology.domain;

import java.util.Objects;

public class TShirt extends Product {
    private String color;
    private int size;

    public TShirt() {
        super();
    }

    public TShirt(int id, String name, int price, String color, int size) {
        super(id, name, price);
        this.color = color;
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TShirt tShirt = (TShirt) o;
        return size == tShirt.size && Objects.equals(color, tShirt.color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color, size);
    }

    @Override
    public String toString() {
        return "TShirt{" +
                "color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}