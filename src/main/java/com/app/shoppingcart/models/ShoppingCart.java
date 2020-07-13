package com.app.shoppingcart.models;

import com.app.client.models.Client;
import com.app.product.models.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ShoppingCart implements Cloneable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    private Client client;
    @ManyToMany
    @Fetch(FetchMode.JOIN)
    private List<Product> productsList;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
