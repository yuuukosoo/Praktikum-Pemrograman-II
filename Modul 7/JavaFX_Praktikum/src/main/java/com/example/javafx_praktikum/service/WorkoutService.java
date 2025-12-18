package com.example.javafx_praktikum.service;

import com.example.javafx_praktikum.model.Workout;
import javafx.collections.ObservableList;

public interface WorkoutService {

    ObservableList<Workout> findAll();

    void addWorkout(String name,
                    String targetMuscle,
                    int repetition,
                    String difficultyLevel);

    void updateWorkout(Workout workout,
                       String name,
                       String targetMuscle,
                       int repetition,
                       String difficultyLevel);

    void deleteWorkout(Workout workout);
}
