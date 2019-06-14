package com.dao;

import com.model.Owner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class OwnerDAO {
    @Autowired
    JdbcTemplate template;

    public int save(Owner owner){
        String sql="insert into owner(name,flat) values('"+owner.getName()+"','"+owner.getFlatNo()+"')";
        return template.update(sql);
    }
}
