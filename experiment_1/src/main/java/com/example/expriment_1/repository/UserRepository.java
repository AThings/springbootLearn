package com.example.expriment_1.repository;

import com.example.expriment_1.entity.*;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class UserRepository {
    @PersistenceContext
    private EntityManager em;

    public void addUserAddress(){
        Users user = new Users("fengjialue");
        em.persist(user);
        Address address_1 = new Address(754);
        address_1.setUser(user);
        em.persist(address_1);

        Address address_2 = new Address(753);
        address_2.setUser(user);
        em.persist(address_2);
    }
}
