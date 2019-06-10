package com.services;

import com.model.Owner;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OwnerServiceImpl implements OwnerService {
    List<Owner> owners = new ArrayList<Owner>();

    public List<Owner> get() {
        return owners;
    }

    public Owner retrieve(String flatNo) {
        return owners.stream()
                .filter(owner -> owner.getFlatNo().equals(flatNo))
                .reduce((a, b) -> {
                    throw new IllegalStateException("Multiple elements: " + a + ", " + b);
                })
                .get();
    }

    public Owner update(String flatNo, Owner owner) {
        return null;
    }

    public Owner create(Owner owner) {
        owners.add(owner);
        return owner;
    }

    public void delete(String flatNo) {

    }
}
