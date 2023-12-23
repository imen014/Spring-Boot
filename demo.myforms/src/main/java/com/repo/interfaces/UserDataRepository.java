package com.repo.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.forms.demo.myforms.entities.MyUserEntity;


@Repository
public interface UserDataRepository extends JpaRepository<MyUserEntity, Integer>  {
	 <S extends MyUserEntity> S save(S entity);

}
