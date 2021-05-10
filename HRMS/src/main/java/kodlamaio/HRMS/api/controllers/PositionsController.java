package kodlamaio.HRMS.api.controllers;

import kodlamaio.HRMS.bussiness.abstracts.PositionService;
import kodlamaio.HRMS.entities.concretes.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/positions")
public class PositionsController {
    private PositionService positionService;

    @Autowired
    public PositionsController(PositionService positionService) {
        this.positionService = positionService;
    }

    @GetMapping("/getall")
    public List<Position> getAll(){
        return this.positionService.getAll();
    }



}
