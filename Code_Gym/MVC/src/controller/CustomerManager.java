package controller;

import model.Customer;

import java.util.ArrayList;

public class CustomerManager implements IManager<Customer> {
    ArrayList<Customer> listCustomer = new ArrayList<>();

    @Override
    public void add(Customer customer) {
        listCustomer.add(customer);
    }

    @Override
    public void remove(int id) {
        int index = findIndexByID(id);
        listCustomer.remove(index);
    }

    @Override
    public int findIndexByID(int id) {
        for (int i = 0; i < listCustomer.size(); i++) {
            if (listCustomer.get(i).getId() == id) {
                return i;
            }
        }
        return 0;
    }

    @Override
    public void update(int id, Customer customer) {
        int index = findIndexByID(id);
        listCustomer.set(index, customer);
    }

    @Override
    public void findByName(String name) {
        for(Customer customer : listCustomer) {
            if(customer.getName().equals(name)) {
                System.out.println(customer);
            }
        }
    }

    @Override
    public ArrayList<Customer> findAll() {
        return null;
    }
}
