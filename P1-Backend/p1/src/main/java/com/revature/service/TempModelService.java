package com.revature.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.revature.model.TempModel;
import com.revature.repository.TempModelRepository;

@Service
public class TempModelService implements CrudService<TempModel> {

    TempModelRepository tempModelRepository;

    public TempModelService(TempModelRepository tempModelRepository) {
        this.tempModelRepository = tempModelRepository;
    }

    @Override
    public List<TempModel> list() {
        return tempModelRepository.findAll();
    }

    @Override
    public TempModel create(TempModel t) {
        return null;
    }

    @Override
    public Optional<TempModel> get(int id) {
        return Optional.empty();
    }

    @Override
    public void update(TempModel t, int id) {
        
    }

    @Override
    public void delete(int id) {
        
    }
    
}
