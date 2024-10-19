package controller;

import model.Product;

import java.util.ArrayList;

public class ProductManager implements IManager<Product> {
    ArrayList<Product> listProduct = new ArrayList<>();

    @Override
    public void add(Product product) {
        listProduct.add(product);
    }

    @Override
    public void remove(int id) {
        int index = findIndexByID(id);
        listProduct.remove(index);
    }

    @Override
    public int findIndexByID(int id) {
        for (int i = 0; i < listProduct.size(); i++) {
            if(listProduct.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void update(int id, Product product) {
        int index = findIndexByID(id);
        listProduct.set(index, product);
    }

    @Override
    public void findByName(String name) {
        for(Product product : listProduct) {
            if(product.getName().equals(name)) {
                System.out.println(product);
            }
        }
    }

    @Override
    public ArrayList<Product> findAll() {
        return listProduct;
    }

}
