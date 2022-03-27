package com.company;

class Customer {
    {
        idGenerator++;
    }

    private static int idGenerator = 0;
    private int id = idGenerator;
    private String name;
    private String name2;
    private String name3;
    private String address;
    private int creditCardId;
    private int bankNumberCard;

    Customer(String name, String name2, String name3, String address, int creditCardId, int bankNumberCard) {
        this.name = name;
        this.name2 = name2;
        this.name3 = name3;
        this.address = address;
        this.creditCardId = creditCardId;
        this.bankNumberCard = bankNumberCard;
    }

    public static int getIdGenerator() {
        return idGenerator;
    }

    public static void setIdGenerator(int idGenerator) {
        Customer.idGenerator = idGenerator;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getName3() {
        return name3;
    }

    public void setName3(String name3) {
        this.name3 = name3;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCreditCardId() {
        return creditCardId;
    }

    public void setCreditCardId(int creditCardId) {
        this.creditCardId = creditCardId;
    }

    public int getBankNumberCard() {
        return bankNumberCard;
    }

    public void setBankNumberCard(int bankNumberCard) {
        this.bankNumberCard = bankNumberCard;
    }

    public String toString() {
        return String.format("ID: %d\t name: %s\t name2: %s\t name3 %s \t from: %s\t credit card %d\t bank number %d",
                id, name, name2, name3, address, creditCardId, bankNumberCard);
    }

}