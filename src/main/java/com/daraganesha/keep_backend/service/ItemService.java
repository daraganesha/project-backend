package com.daraganesha.keep_backend.service;

import com.daraganesha.keep_backend.exception.ItemNotFoundException;
import com.daraganesha.keep_backend.model.Item;
import com.daraganesha.keep_backend.repo.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    private final ItemRepo itemRepo;

    @Autowired
    public ItemService(ItemRepo itemRepo) {
        this.itemRepo = itemRepo;
    }

    public Item addItem(Item item) {
        return itemRepo.save(item);
    }

    public List<Item> findAllItems() {
        return itemRepo.findAll();
    }

    public Item updateItem(Item item) {
        return itemRepo.save(item);
    }

    public void deleteItem(Long id) {
        itemRepo.deleteItemById(id);
    }

    public Item findItemById(Long id) {
        return itemRepo.findItemById(id).orElseThrow(() -> new ItemNotFoundException("Item with id: " + id + " is not found."));
    }
}
