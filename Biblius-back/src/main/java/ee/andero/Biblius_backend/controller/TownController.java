package ee.andero.Biblius_backend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class TownController {
    @GetMapping("towns")
    public List<String> getTowns() {
        return new ArrayList<>(Arrays.asList("Tallinn", "Tartu", "Kuressaare"));

    }
}
