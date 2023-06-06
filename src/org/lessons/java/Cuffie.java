package org.lessons.java;

class Cuffie extends Prodotto {
    private String colour;
    private boolean wireless;

    public Cuffie(String name, String description, double price, double iva, String colour, boolean wireless) {
        super(name, description, price, iva);
        this.colour = colour;
        this.wireless = wireless;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    @Override
    public String toString() {
        return "Cuffie{" +
                "code=" + getCode() +
                ", name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", price=" + getPrice() +
                ", iva=" + getIva() +
                ", colour='" + colour + '\'' +
                ", wireless=" + wireless +
                '}';
    }
}
