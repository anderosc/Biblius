package ee.andero.veebipood_backend.controller;

import ee.andero.veebipood_backend.entity.Picture;
import ee.andero.veebipood_backend.repository.PicturesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin(origins = "https://averagepage-d3ced.web.app")  //Allow API request only from this site
public class PictureController {
    @Autowired
    private PicturesRepository picturesRepository;

    @GetMapping("pictures")
    public List<Picture> getPictures() {
        return picturesRepository.findAll(); //Behind the scene: SELECT * FROM pictures

    }

    @PostMapping("pictures")
    public List<Picture> SavePictures(@RequestBody Picture picture) {
        picturesRepository.save(picture); //Behind the scene: INSERT values INTO pictures
        return picturesRepository.findAll(); //Behind the scene: SELECT * FROM pictures

    }
}
