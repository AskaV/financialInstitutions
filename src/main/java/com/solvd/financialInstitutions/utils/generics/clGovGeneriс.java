package com.solvd.financialInstitutions.utils.generics;

import com.solvd.financialInstitutions.clients.ClientsBase;
import java.util.ArrayList;
import java.util.List;

public class clGovGeneriс<T extends ClientsBase> {
    private T t;
    public List<T> clients = new ArrayList<>();

    public List<T>getClients(){
        return clients;
    }

    public void set(T t) {
        this.t = t;
    }
    public T get() {
        return t;
    }


}
