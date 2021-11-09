package Model.exceciseInDay;

import java.util.ArrayList;
import java.util.List;

import Model.excercise.Exercise;

public class ExercisesInDayDa implements ExercisesInDayI {

    ArrayList<ExercisesInDay> exercises = new ArrayList<ExercisesInDay>();

    public ExercisesInDayDa() {

        ArrayList<Exercise> monday = new ArrayList<Exercise>();
        monday.add(new Exercise(10, "pushups"));
        monday.add(new Exercise(20, "squats"));
        monday.add(new Exercise(1, "minute glute bridge"));
        monday.add(new Exercise(3, "Repeats"));

        ArrayList<Exercise> tuesday = new ArrayList<Exercise>();
        tuesday.add(new Exercise(10, "weighted dumbbell burpeer"));
        tuesday.add(new Exercise(10, "weighted squats"));
        tuesday.add(new Exercise(10, "lunges with overhead"));
        tuesday.add(new Exercise(3, "Repeats"));

        ArrayList<Exercise> wednesday = new ArrayList<Exercise>();
        wednesday.add(new Exercise(1, "minute weighted glute bridge"));
        wednesday.add(new Exercise(1, "minute side bridge/each side"));
        wednesday.add(new Exercise(1, "minute supermans"));
        wednesday.add(new Exercise(1, "minuts plank"));
        wednesday.add(new Exercise(3, "Repeats"));


        exercises.add(new ExercisesInDay("Monday", monday));
        exercises.add(new ExercisesInDay("Tuesday", tuesday));
        exercises.add(new ExercisesInDay("Wednesday", wednesday));
        exercises.add(new ExercisesInDay("Thursday", monday));
        exercises.add(new ExercisesInDay("Friday", tuesday));
        exercises.add(new ExercisesInDay("Saturday", wednesday));
        exercises.add(new ExercisesInDay("Sunday", wednesday));

    }
@Override
    public ArrayList<String> getdays() {
        ArrayList<String> days = new ArrayList<>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday") ;
        days.add("Saturday") ;
        days.add("Sunday") ;

return days ;
    }

    @Override
    public List<ExercisesInDay> getWeekSchedual() {
        return this.exercises;
    }
}
