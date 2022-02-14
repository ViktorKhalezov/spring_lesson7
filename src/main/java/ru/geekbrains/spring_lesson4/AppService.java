package ru.geekbrains.spring_lesson4;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.NoSuchElementException;



@Service
@RequiredArgsConstructor
@Transactional
public class AppService {

    @Autowired
    private ProductDao productDao;

    @Autowired
    private ManufacturerDao manufacturerDao;


    @Transactional
    public Product saveProduct(Product product) {
//        if(product.getId() != null) {
//            Optional<Product> productFromDbOptional = productDao.findById(product.getId());
//            if(productFromDbOptional.isPresent()) {
//                Product productFromDb = productFromDbOptional.get();
//                productFromDb.setTitle(product.getTitle());
//                productFromDb.setCost(product.getCost());
//                productFromDb.setDate(product.getDate());
//               // productFromDb.setManufacturer(product.getManufacturer());
//                checkManufacturer(productFromDb, product.getManufacturer());
//                return productDao.save(productFromDb);
//            }
//        }
//        checkManufacturer(product, product.getManufacturer());
        return productDao.save(product);
    }

    @Transactional(readOnly = true)
    public Product getProductById(Long id) {
        return productDao.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Transactional(readOnly = true)
    public List<Product> getAllProducts() {
        return productDao.findAll();
    }

    @Transactional
    public Product editProduct(Product product) {
       return productDao.save(product);
    }

    @Transactional
    public void deleteById(Long id) {
        productDao.deleteById(id);
    }

//    public List<Product> findAllSortedByCost(SpringDataWebProperties.Sort sort, String cost) {
//       return productDao.findAllSortedByCost(sort, cost);
//    }

//        private void checkManufacturer(Product product, Manufacturer manufacturer) {
//            ArrayList<Manufacturer> manufacturersFromDb = (ArrayList<Manufacturer>) manufacturerDao.findAll();
//            for(Manufacturer manufacturerFromDb : manufacturersFromDb) {
//                if(manufacturer.getName().equals(manufacturerFromDb.getName())) {
//                    product.setManufacturer(manufacturerFromDb);
//                return;
//            }
//            }
//            product.setManufacturer(manufacturer);
//        }

}
