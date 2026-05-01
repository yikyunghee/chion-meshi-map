package com.example.chionmeshimap;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/spots")
@CrossOrigin(origins = "*")
public class SpotController {

    private final SpotRepository spotRepository;

    public SpotController(SpotRepository spotRepository) {
        this.spotRepository = spotRepository;
    }

    @GetMapping
    public List<Spot> getAll() {
        return spotRepository.findAll();
    }

    @PostMapping
    public Spot create(@RequestBody Spot spot) {
        return spotRepository.save(spot);
    }
}