package com.persistent.semicolon.UseCase_Service2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.persistent.semicolon.UseCase_Service2.model.UseCase;

@Repository
public interface UseCaseRepository extends JpaRepository<UseCase, Long> 
{
  
}
