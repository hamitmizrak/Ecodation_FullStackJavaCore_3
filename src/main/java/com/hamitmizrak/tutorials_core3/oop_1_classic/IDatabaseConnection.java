package com.hamitmizrak.tutorials_core3.oop_1_classic;

public interface IDatabaseConnection<T> {

    // CRUD(Create-Read-Update-Delete)
    public void create(T t);

    public void read(int id);

    public void update(int id, T t);

    public void delete(int id);
}
