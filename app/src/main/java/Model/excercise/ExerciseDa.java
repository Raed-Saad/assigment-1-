package Model.excercise;

import java.util.ArrayList;
import java.util.List;

class ExerciseDa implements ExerciseDaI {

    ArrayList<Exercise> exerciseArrayList = new ArrayList<Exercise>() ;

    public ExerciseDa() {

        exerciseArrayList.add(new Exercise(10,"pushups"));
        exerciseArrayList.add(new Exercise(20,"squats"));
        exerciseArrayList.add(new Exercise(1,"minute glute bridge"));
        exerciseArrayList.add(new Exercise(3,"Repeats"));
        exerciseArrayList.add(new Exercise(10,"weighted dumbbell burpeer"));
        exerciseArrayList.add(new Exercise(10,"weighted squats"));
        exerciseArrayList.add(new Exercise(10,"lunges with overhead"));
        exerciseArrayList.add(new Exercise(3,"Repeats"));
        exerciseArrayList.add(new Exercise(1,"minute weighted glute bridge"));
        exerciseArrayList.add(new Exercise(1,"minute side bridge/each side"));
        exerciseArrayList.add(new Exercise(1,"minute supermans"));
        exerciseArrayList.add(new Exercise(1,"minuts plank"));
        exerciseArrayList.add(new Exercise(3,"Repeats"));
    }

    @Override
    public List<Exercise> getExercises() {
        return this.exerciseArrayList;
    }
}
