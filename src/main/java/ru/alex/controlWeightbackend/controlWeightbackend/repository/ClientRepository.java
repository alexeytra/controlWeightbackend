package ru.alex.controlWeightbackend.controlWeightbackend.repository;

/**
 * Created by aleks on 18.01.2019.
 */

import org.springframework.data.jpa.repository.JpaRepository;
import ru.alex.controlWeightbackend.controlWeightbackend.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
