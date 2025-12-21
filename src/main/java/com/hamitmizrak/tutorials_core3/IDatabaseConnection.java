package com.hamitmizrak.tutorials_core3;

public interface IDatabaseConnection<T> {

    // CRUD(Create-Read-Update-Delete)
    public void create(T t);

    public void read(int id);

    public void update(int id, T t);

    public void delete(int id);
}
