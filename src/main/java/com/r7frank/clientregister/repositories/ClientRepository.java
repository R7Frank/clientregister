package com.r7frank.clientregister.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.r7frank.clientregister.entities.Client;

public interface ClientRepository extends JpaRepositoryImplementation<Client, Long> {

}
