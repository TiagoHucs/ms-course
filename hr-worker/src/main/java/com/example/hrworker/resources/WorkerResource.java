package com.example.hrworker.resources;

import com.example.hrworker.entities.Worker;
import com.example.hrworker.repositories.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {

    @Autowired
    private WorkerRepository workerRepository;

    @GetMapping
    public ResponseEntity<List<Worker>> findALl(){
        List<Worker> list = workerRepository.findAll();
        return ResponseEntity.ok(list);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/list")
    public ResponseEntity<List<Worker>> find(){
        List<Worker> list = workerRepository.findAll();
        return ResponseEntity.ok(list);
    }
}
