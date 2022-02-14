package ru.geekbrains.spring_lesson4;


import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;


public interface ProductDao extends JpaRepository<Product, Long> {

    List<Product> findAll();
    Optional<Product> findById(Long id);
    Product save(Product product);
    void deleteById(Long id);
//    List<Product> findAllSortedByCost(Sort sort, String cost);

}
