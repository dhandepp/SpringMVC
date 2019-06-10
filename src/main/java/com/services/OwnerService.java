package com.services;

import com.model.Owner;

import java.util.List;

public interface OwnerService {

    List<Owner> get();
    Owner retrieve(String flatNo);
    Owner update(String flatNo,Owner owner);
    Owner create(Owner owner);
    void delete(String flatNo);
}
