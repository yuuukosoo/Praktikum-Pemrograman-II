package com.example.javafx_praktikum.repository;

import com.example.javafx_praktikum.model.Workout;
import javafx.collections.ObservableList;

public interface WorkoutRepository {
    ObservableList<Workout> findAll();
    void add(Workout workout);
    void update(Workout workout);
    void delete(Workout workout);
}
