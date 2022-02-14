package ru.geekbrains.spring_lesson4;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//@Component
public class ProductRepository {
    private int count = 0;

    private List<Product> products = new ArrayList<>();


    public Product saveProduct(Product product) {
      //  product.setId(count++);
        products.add(product);
        return Product.builder()
                .id(product.getId())
                .title(product.getTitle())
                .cost(product.getCost())
                .build();
    }


    public Optional<Product> getProductById(Integer id) {
        if(id < products.size()) {
            return Optional.of(products.get(id));
        } else {
            return Optional.empty();
        }
    }

    public List<Product> getAllProducts() {
        return new ArrayList<>(products);
    }

//    public Product editProduct(Product product) {
//       return products.set(product.getId(), product);
//    }

    public void deleteById(Integer id) {
        if(id < products.size()) {
            products.remove(id.intValue());
        }
    }

}


