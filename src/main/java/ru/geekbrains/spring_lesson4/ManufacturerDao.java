package ru.geekbrains.spring_lesson4;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ManufacturerDao extends JpaRepository<Manufacturer, Long> {
    List<Manufacturer> findAll();
    Optional<Manufacturer> findById(Long id);
    Manufacturer save(Manufacturer manufacturer);

}
