package ie.atu.ooplab4.service;

import ie.atu.ooplab4.model.Calorie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CalorieService {
    private final List<Calorie> calories = new ArrayList<>();
    private long nextId = 1;

    public Calorie createCalorie(Calorie calorie) {
        calorie.setId(nextId++);
        calories.add(calorie);
        return calorie;
    }
    public List<Calorie> getCalories() {
        return calories;
    }
}
