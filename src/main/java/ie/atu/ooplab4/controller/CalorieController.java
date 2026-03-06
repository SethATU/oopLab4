package ie.atu.ooplab4.controller;

import ie.atu.ooplab4.model.Calorie;
import ie.atu.ooplab4.service.CalorieService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calorie")
public class CalorieController {
    private CalorieService calorieService;

    public CalorieController(CalorieService calorieService) {
        this.calorieService = calorieService;
    }

    @PostMapping
    public ResponseEntity<Calorie> createCalorie(@Valid @RequestBody Calorie calorie) {
        Calorie newCalorie = calorieService.createCalorie(calorie);
        return ResponseEntity.status(HttpStatus.CREATED).body(newCalorie);
    }

    @GetMapping
    public ResponseEntity<List<Calorie>> getCalories() {
        return ResponseEntity.ok(calorieService.getCalories());
    }
}
