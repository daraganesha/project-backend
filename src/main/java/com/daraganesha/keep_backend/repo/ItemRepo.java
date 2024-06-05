package com.daraganesha.keep_backend.repo;

import com.daraganesha.keep_backend.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ItemRepo extends JpaRepository<Item, Long> {
    void deleteItemById(Long id);
    Optional<Item> findItemById(Long id);
}
