package com.revature.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.revature.model.TempModel;

@Repository
public class TempModelRepository implements CrudRepostitory<TempModel>{

    @Override
    public List<TempModel> findAll() {
        List<TempModel> tempModels = new ArrayList<>();
        TempModel temp = new TempModel(1, 2, "This will hold data like description or something");

        tempModels.add(temp);
        return tempModels;
    }
    
}
