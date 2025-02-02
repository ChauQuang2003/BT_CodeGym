package controller;

import java.util.ArrayList;

public interface IManager<E> {
    void add(E e);
    void remove(int id);
    int findIndexByID(int id);
    void update(int id, E e);
    void findByName(String name);
    ArrayList<E> findAll();
}
