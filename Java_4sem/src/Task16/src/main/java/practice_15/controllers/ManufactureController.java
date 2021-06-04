package practice_15.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import practice_15.modules.Manufacture;
import practice_15.services.ManufactureService;

import java.util.List;

@Controller
public class ManufactureController {
    private final ManufactureService manufactureService;

    @Autowired
    public ManufactureController(ManufactureService manufactureService) {
        this.manufactureService = manufactureService;
    }

    @GetMapping(value = "/manufactures")
    public @ResponseBody
    List<Manufacture> getManufactureData() {
        return manufactureService.getManufactures();
    }
}
