package com.p128.d10_genericity;

public interface Data <E>{
    void add(E s);
    void delete(int id);
    void update(E e);
    E queryById(int id);

}
