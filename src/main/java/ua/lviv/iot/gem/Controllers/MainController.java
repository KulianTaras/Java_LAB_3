package ua.lviv.iot.gem.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ua.lviv.iot.gem.models.NecklaceStone;
import ua.lviv.iot.gem.repositories.NecklaceStoneRepository;

@Controller
@RequestMapping(path = "/demo")
public class MainController {

    @Autowired
    private NecklaceStoneRepository necklaceStoneRepository;

    @GetMapping(path = "/add")
    public @ResponseBody String addNewNecklaceStone(@RequestParam String name,
                                                    @RequestParam double price) {

        NecklaceStone stone = new NecklaceStone();
        stone.setName(name);
        stone.setPrice(price);
        necklaceStoneRepository.save(stone);
        return "Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<NecklaceStone> getAllNecklaceStone() {

        return necklaceStoneRepository.findAll();
    }

}
