package com.example.javafx_praktikum;

import com.example.javafx_praktikum.controller.MainController;
import com.example.javafx_praktikum.repository.InMemoryWorkoutRepository;
import com.example.javafx_praktikum.repository.WorkoutRepository;
import com.example.javafx_praktikum.service.WorkoutService;
import com.example.javafx_praktikum.service.WorkoutServiceImpl;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("main-view.fxml"));


        fxmlLoader.setControllerFactory(type -> {
            if (type == MainController.class) {
                WorkoutRepository repo = new InMemoryWorkoutRepository();
                WorkoutService service = new WorkoutServiceImpl(repo);
                return new MainController(service);
            }
            try {
                return type.getDeclaredConstructor().newInstance();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Gym Workout Manager");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
