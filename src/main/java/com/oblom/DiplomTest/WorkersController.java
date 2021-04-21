package com.oblom.DiplomTest;

import com.oblom.DiplomTest.Models.Worker;
import com.oblom.DiplomTest.WorkerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
public class WorkersController {
    private WorkerRepository workerRepository;

    public WorkersController(WorkerRepository workerRepository) {
        this.workerRepository = workerRepository;
    }

    @GetMapping("/index")
    public Collection<Worker> workers() {
        return workerRepository.findAll().stream().filter(this::isWork).collect(Collectors.toList());
    }

    private boolean isWork(Worker worker) {
        return !worker.getF_name().equals("Boka") && !worker.getF_name().equals("Zhoka");
    }
}
