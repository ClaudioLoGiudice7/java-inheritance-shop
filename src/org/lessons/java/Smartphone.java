package org.lessons.java;

class Smartphone extends Prodotto {
    private String imei;
    private int memory;

    public Smartphone(String name, String description, double price, double iva, String imei, int memory) {
        super(name, description, price, iva);
        this.imei = imei;
        this.memory = memory;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "code=" + getCode() +
                ", name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", price=" + getPrice() +
                ", iva=" + getIva() +
                ", imei='" + imei + '\'' +
                ", memory=" + memory +
                '}';
    }
}
