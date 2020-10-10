package com.apidescnormas.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.apidescnormas.domain.model.DescNormaEntity;

@Repository
public interface DescNormaRepository extends CrudRepository<DescNormaEntity,String>{

}
