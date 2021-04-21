package com.oblom.DiplomTest;

import com.oblom.DiplomTest.Models.Worker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;
@Component
public class WorkerCmdRun implements CommandLineRunner {
    private final WorkerRepository workerRepository;

    public WorkerCmdRun(WorkerRepository workerRepository) {
        this.workerRepository = workerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Stream.of(new Object[]{"Zhoka", "Soso", 1234567L}, new Object[]{"Boka", "Soso", 7654321L},
                new Object[]{"Lolita>", "Kalyaskaya", 8800555L}, new Object[]{"Pedophile", "Nabokov", 1337228L},
                new Object[]{"Gogy", "Bogy", 1000000L}).forEach(params -> workerRepository.save(new Worker(params[0].toString(), params[1].toString(), ((long) params[2]))));
        workerRepository.findAll().forEach(System.out::println);
    }
}
