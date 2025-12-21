package com.hamitmizrak.tutorials_core3.oop_2_extend;

public interface IDatabaseConnection<T> {

    // CRUD(Create-Read-Update-Delete)
     void create(T t);

     void read(int id);

     void update(int id, T t);

     void delete(int id);
}
