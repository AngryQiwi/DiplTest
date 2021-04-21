package com.oblom.DiplomTest;

import com.oblom.DiplomTest.Models.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
