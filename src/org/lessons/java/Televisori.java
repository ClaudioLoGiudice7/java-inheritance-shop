package org.lessons.java;

class Televisori extends Prodotto {
    private double dimensions;
    private boolean smart;

    public Televisori(String name, String description, double price, double iva, double dimensions, boolean smart) {
        super(name, description, price, iva);
        this.dimensions = dimensions;
        this.smart = smart;
    }

    public double getDimensions() {
        return dimensions;
    }

    public void setDimensions(double dimensions) {
        this.dimensions = dimensions;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    @Override
    public String toString() {
        return "Televisori{" +
                "code=" + getCode() +
                ", name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", price=" + getPrice() +
                ", iva=" + getIva() +
                ", dimensions=" + dimensions +
                ", smart=" + smart +
                '}';
    }
}
