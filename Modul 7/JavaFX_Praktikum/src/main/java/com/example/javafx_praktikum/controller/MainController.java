package com.example.javafx_praktikum.controller;

import com.example.javafx_praktikum.model.Workout;
import com.example.javafx_praktikum.service.WorkoutService;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class MainController {

    @FXML
    private TableView<Workout> workoutTable;

    @FXML
    private TableColumn<Workout, Integer> colId;

    @FXML
    private TableColumn<Workout, String> colName;

    @FXML
    private TableColumn<Workout, String> colTargetMuscle;

    @FXML
    private TableColumn<Workout, Integer> colDuration;

    @FXML
    private TableColumn<Workout, String> colDifficulty;

    @FXML
    private ComboBox<String> exerciseComboBox;

    @FXML
    private ComboBox<String> targetMuscleComboBox;

    @FXML
    private TextField durationField;

    @FXML
    private ComboBox<String> difficultyComboBox;

    @FXML
    private Button addButton;

    @FXML
    private Button updateButton;

    @FXML
    private Button deleteButton;

    private final WorkoutService workoutService;


    public MainController(WorkoutService workoutService) {
        this.workoutService = workoutService;
    }

    @FXML
    public void initialize() {
        colId.setCellValueFactory(cellData ->
                new ReadOnlyObjectWrapper<>(cellData.getValue().getId()));
        colName.setCellValueFactory(cellData ->
                new SimpleStringProperty(cellData.getValue().getName()));
        colTargetMuscle.setCellValueFactory(cellData ->
                new SimpleStringProperty(cellData.getValue().getTargetMuscle()));
        colDuration.setCellValueFactory(cellData ->
                new ReadOnlyObjectWrapper<>(cellData.getValue().getRepetition()));
        colDifficulty.setCellValueFactory(cellData ->
                new SimpleStringProperty(cellData.getValue().getDifficultyLevel()));

        workoutTable.setItems(workoutService.findAll());

        exerciseComboBox.getItems().setAll(
                "Bench Press",
                "Squat",
                "Deadlift",
                "Pull Up",
                "Push Up",
                "Shoulder Press",
                "Plank",
                "Lunges"
        );

        targetMuscleComboBox.getItems().setAll(
                "Chest",
                "Back",
                "Legs",
                "Shoulders",
                "Arms",
                "Core",
                "Full Body"
        );

        difficultyComboBox.getItems().setAll(
                "Easy",
                "Medium",
                "Hard"
        );

        workoutTable.getSelectionModel().selectedItemProperty().addListener(
                (obs, oldSelection, newSelection) -> showSelectedWorkout(newSelection)
        );
    }

    private void showSelectedWorkout(Workout workout) {
        if (workout != null) {
            exerciseComboBox.setValue(workout.getName());
            targetMuscleComboBox.setValue(workout.getTargetMuscle());
            durationField.setText(String.valueOf(workout.getRepetition()));
            difficultyComboBox.setValue(workout.getDifficultyLevel());
        } else {
            clearForm();
        }
    }

    @FXML
    private void onAddClicked() {
        try {
            String name = exerciseComboBox.getValue();
            String target = targetMuscleComboBox.getValue();
            String difficulty = difficultyComboBox.getValue();

            if (name == null || target == null || difficulty == null) {
                showError("Please select exercise, target muscle, and difficulty.");
                return;
            }

            int duration = Integer.parseInt(durationField.getText());


            workoutService.addWorkout(name, target, duration, difficulty);
            clearForm();

        } catch (NumberFormatException e) {
            showError("Duration must be a number.");
        }
    }

    @FXML
    private void onUpdateClicked() {
        Workout selected = workoutTable.getSelectionModel().getSelectedItem();
        if (selected == null) {
            showError("Please select a workout to update.");
            return;
        }

        try {
            int duration = Integer.parseInt(durationField.getText());

            workoutService.updateWorkout(
                    selected,
                    exerciseComboBox.getValue(),
                    targetMuscleComboBox.getValue(),
                    duration,
                    difficultyComboBox.getValue()
            );

            workoutTable.refresh();
            clearForm();

        } catch (NumberFormatException e) {
            showError("Repetition must be a number.");
        }
    }

    @FXML
    private void onDeleteClicked() {
        Workout selected = workoutTable.getSelectionModel().getSelectedItem();
        if (selected == null) {
            showError("Please select a workout to delete.");
            return;
        }
        workoutService.deleteWorkout(selected);
        clearForm();
    }

    private void clearForm() {
        exerciseComboBox.getSelectionModel().clearSelection();
        targetMuscleComboBox.getSelectionModel().clearSelection();
        durationField.clear();
        difficultyComboBox.getSelectionModel().clearSelection();
        workoutTable.getSelectionModel().clearSelection();
    }

    private void showError(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Input Error");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
