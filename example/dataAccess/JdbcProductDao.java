package org.example.dataAccess;

import org.example.entities.Product;

public class JdbcProductDao implements ProductDao {
    public void add(Product product){
        //sadece ve sadece db erişim kodları yazılır... SQL
        System.out.println("JDBC ile veritabanına eklendi.");
    }
}

