package ru.alex.controlWeightbackend.controlWeightbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.alex.controlWeightbackend.controlWeightbackend.model.Mark;

/**
 * Created by aleks on 18.01.2019.
 */
public interface MarkRepository extends JpaRepository<Mark, Long> {
}
