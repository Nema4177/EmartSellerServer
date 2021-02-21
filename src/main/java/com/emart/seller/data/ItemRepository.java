package com.emart.seller.data;

import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Integer> {

    // custom query to search to blog post by title or content
    //List<Item> findByTitleContainingOrContentContaining(String text, String textAgain);
    
}