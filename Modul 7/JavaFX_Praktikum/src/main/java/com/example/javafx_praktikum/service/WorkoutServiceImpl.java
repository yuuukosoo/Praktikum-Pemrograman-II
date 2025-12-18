package com.example.javafx_praktikum.service;

import com.example.javafx_praktikum.model.Workout;
import com.example.javafx_praktikum.repository.WorkoutRepository;
import javafx.collections.ObservableList;

public class WorkoutServiceImpl implements WorkoutService {

    private final WorkoutRepository workoutRepository;

    public WorkoutServiceImpl(WorkoutRepository workoutRepository) {
        this.workoutRepository = workoutRepository;
    }

    @Override
    public ObservableList<Workout> findAll() {
        return workoutRepository.findAll();
    }

    @Override
    public void addWorkout(String name,
                           String targetMuscle,
                           int repetition,
                           String difficultyLevel) {

        Workout workout = new Workout(name, targetMuscle, repetition, difficultyLevel);
        workoutRepository.add(workout);
    }

    @Override
    public void updateWorkout(Workout workout,
                              String name,
                              String targetMuscle,
                              int repetition,
                              String difficultyLevel) {

        workout.setName(name);
        workout.setTargetMuscle(targetMuscle);
        workout.setRepetition(repetition);
        workout.setDifficultyLevel(difficultyLevel);

        workoutRepository.update(workout);
    }

    @Override
    public void deleteWorkout(Workout workout) {
        workoutRepository.delete(workout);
    }
}
