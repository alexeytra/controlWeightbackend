package ru.alex.controlWeightbackend.controlWeightbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.alex.controlWeightbackend.controlWeightbackend.model.Client;
import ru.alex.controlWeightbackend.controlWeightbackend.repository.ClientRepository;

import java.util.List;

/**
 * Created by aleks on 18.01.2019.
 */
@RestController
@RequestMapping("/api")
public class ClientController {
    @Autowired
    ClientRepository clientRepository;

    @GetMapping("/client")
    public List<Client> getAllClient(){
        return clientRepository.findAll();
    }
}
