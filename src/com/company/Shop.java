package com.company;
import java.util.*;
public class Shop {

    private String shopName;
    private ArrayList<Customer> customersList = new ArrayList<>();

    Shop(String shopName) {
        this.shopName = shopName;
    }

    void addCustomerToShopList(Customer customer) {
        customersList.add(customer);
    }

    List<Customer> getListByName() {
        List<Customer> list = new ArrayList<>(customersList);
        Collections.sort(list, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });
        return list;
    }

    List<Customer> getListByName2() {
        List<Customer> list = new ArrayList<>(customersList);
        Collections.sort(list, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getName2().compareToIgnoreCase(o2.getName2());
            }
        });
        return list;
    }

    List<Customer> getListByDiapasonCreaditCard(int diapazonStart, int diapazonEnd) {
        List<Customer> list = new ArrayList<>();
        for (Customer c : customersList) {
            if (c.getCreditCardId() >= diapazonStart && c.getCreditCardId() <=diapazonEnd) {
                list.add(c);
            }
        }

        return list;
    }



}