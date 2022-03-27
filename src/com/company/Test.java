package com.company;

import java.util.*;

import static java.util.Collections.*;

public class Test {
    public static void main(String[] args) {
        Shop megamarket = new Shop("Megamarket");
        megamarket.addCustomerToShopList(new Customer("Иван", "Иванов", "Иванович", "Беларусь", 11_22_33_44, 12345));
        megamarket.addCustomerToShopList(new Customer("Петр", "Петров", "Петрович", "Россия", 22_33_44_55, 23456));
        megamarket.addCustomerToShopList(new Customer("Богдан", "Пушкин", "Сергеевич", "Болгария", 33_44_55_66, 34567));
        megamarket.addCustomerToShopList(new Customer("Елена", "Голубева", "Викторовна", "Украина", 44_55_66_77, 45678));
        megamarket.addCustomerToShopList(new Customer("Наташа", "Дроздова", "Алексеевна", "Россия", 66_77_88_99, 67890));


        System.out.println("\nsort by name:");
        List<Customer> listSortByName = megamarket.getListByName();
        for (Customer c : listSortByName) {
            System.out.println(c);
        }

        System.out.println("\nsort by name2:");
        List<Customer> listSortByName2 = megamarket.getListByName2();
        for (Customer c : listSortByName2) {
            System.out.println(c);
        }

        System.out.println("\nprint customers by diapazon credit card:");
        List<Customer> listSortByDiapazonCreditCard = megamarket.getListByDiapasonCreaditCard(22_33_44_55, 66_77_88_99);
        for (Customer c : listSortByDiapazonCreditCard) {
            System.out.println(c);
        }


    }
}