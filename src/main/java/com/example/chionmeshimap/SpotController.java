package com.example.chionmeshimap;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/api/spots")
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.OPTIONS})
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

    @PutMapping("/{id}")
    public Spot update(@PathVariable Long id, @RequestBody Spot spot) {
        spot.setId(id);
        return spotRepository.save(spot);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        spotRepository.deleteById(id);
    }

}