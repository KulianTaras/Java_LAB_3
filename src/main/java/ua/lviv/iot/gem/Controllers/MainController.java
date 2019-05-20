package ua.lviv.iot.gem.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.gem.exceptions.NecklaceStoneNotFoundException;
import ua.lviv.iot.gem.models.NecklaceStone;
import ua.lviv.iot.gem.repositories.NecklaceStoneRepository;

import java.util.List;

@Controller
public class MainController {

    private NecklaceStoneRepository repository;

    MainController(NecklaceStoneRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/stones")
    public List<NecklaceStone> all() {
        return (List<NecklaceStone>) repository.findAll();
    }

    @GetMapping("/stones/{id}")
    public NecklaceStone one(@PathVariable Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new NecklaceStoneNotFoundException(id));
    }

    @PostMapping("/stones")
    public NecklaceStone newNecklaceStone(@RequestBody NecklaceStone newStone) {
        return repository.save(newStone);
    }

    @PutMapping("/stones/{id}")
    public NecklaceStone replaceNecklaceStone(@RequestBody NecklaceStone newStone, @PathVariable Integer id) {

        return repository.findById(id)
                .map(stone -> {
                    stone.setName(newStone.getName());
                    stone.setPrice(newStone.getPrice());
                    stone.setCaratsWeight(newStone.getCaratsWeight());
                    stone.setCountry(newStone.getCountry());
                    stone.setTransparency(newStone.getTransparency());
                    return repository.save(stone);
                })
                .orElseGet(() -> {
                    newStone.setId(id);
                    return repository.save(newStone);
                });
    }

    @DeleteMapping("/stones/{id}")
    public void deleteNecklaceStone(@PathVariable Integer id) {
        repository.deleteById(id);
    }

}
