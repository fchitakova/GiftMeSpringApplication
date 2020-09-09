package com.springcourse.giftme.repository;

import com.springcourse.giftme.model.Gift;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public class GiftRepository implements CrudRepository<Gift,Integer> {
    
    @Override
    public <S extends Gift> S save(S s) {
        return null;
    }
    
    @Override
    public <S extends Gift> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }
    
    @Override
    public Optional<Gift> findById(Integer integer) {
        return Optional.empty();
    }
    
    @Override
    public boolean existsById(Integer integer) {
        return false;
    }
    
    @Override
    public Iterable<Gift> findAll() {
        return null;
    }
    
    @Override
    public Iterable<Gift> findAllById(Iterable<Integer> iterable) {
        return null;
    }
    
    @Override
    public long count() {
        return 0;
    }
    
    @Override
    public void deleteById(Integer integer) {
    
    }
    
    @Override
    public void delete(Gift gift) {
    
    }
    
    @Override
    public void deleteAll(Iterable<? extends Gift> iterable) {
    
    }
    
    @Override
    public void deleteAll() {
    
    }
}
