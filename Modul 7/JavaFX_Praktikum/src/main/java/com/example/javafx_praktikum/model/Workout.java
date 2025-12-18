package com.example.javafx_praktikum.model;

public class Workout {

    private int id;
    private String name;
    private String targetMuscle;
    private int repetition;
    private String difficultyLevel;

    public Workout(int id, String name, String targetMuscle, int repetition, String difficultyLevel) {
        this.id = id;
        this.name = name;
        this.targetMuscle = targetMuscle;
        this.repetition = repetition;
        this.difficultyLevel = difficultyLevel;
    }

    public Workout(String name, String targetMuscle, int repetition, String difficultyLevel) {
        this(0, name, targetMuscle, repetition, difficultyLevel);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTargetMuscle() {
        return targetMuscle;
    }

    public void setTargetMuscle(String targetMuscle) {
        this.targetMuscle = targetMuscle;
    }

    public int getRepetition() {
        return repetition;
    }

    public void setRepetition(int repetition) {
        this.repetition = repetition;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(String difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }
}
