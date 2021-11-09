package Model.exceciseInDay;

import java.util.ArrayList;
import java.util.List;

import Model.excercise.Exercise;

public class ExercisesInDay {
    private String day ;
    private List<Exercise> exercises ;


    public ExercisesInDay(String day, List<Exercise> exercises) {
        this.day = day;
        this.exercises = exercises;
    }

    public List<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(List<Exercise> exercises) {
        this.exercises = exercises;
    }


    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "ExercisesInDay{" +
                "day='" + day + '\'' +
                ", exercises=" + exercises +
                '}';
    }
}
