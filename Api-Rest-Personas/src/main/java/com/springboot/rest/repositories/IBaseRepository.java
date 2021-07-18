package com.springboot.rest.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.springboot.rest.entities.Base;

@NoRepositoryBean
public interface IBaseRepository<E extends Base,ID extends Serializable> extends JpaRepository<E, ID> {

}
