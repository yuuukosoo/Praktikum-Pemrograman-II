package com.example.javafx_praktikum.repository;

import com.example.javafx_praktikum.model.Workout;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class InMemoryWorkoutRepository implements WorkoutRepository {

    private final ObservableList<Workout> workouts = FXCollections.observableArrayList();
    private int nextId = 1;

    @Override
    public ObservableList<Workout> findAll() {
        return workouts;
    }

    @Override
    public void add(Workout workout) {
        workout.setId(nextId++);
        workouts.add(workout);
    }

    @Override
    public void update(Workout workout) {

        for (int i = 0; i < workouts.size(); i++) {
            if (workouts.get(i).getId() == workout.getId()) {
                workouts.set(i, workout);
                return;
            }
        }
    }

    @Override
    public void delete(Workout workout) {
        workouts.remove(workout);
    }
}
