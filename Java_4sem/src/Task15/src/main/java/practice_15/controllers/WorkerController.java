package practice_15.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import practice_15.modules.Manufacture;
import practice_15.modules.Worker;
import practice_15.services.WorkerService;

import java.util.List;

@Controller
public class WorkerController {
    private final WorkerService workerService;

    @Autowired
    public WorkerController(WorkerService workerService) {
        this.workerService = workerService;
    }

    @GetMapping(value = "/worker/{workerId}/manufacture")
    public @ResponseBody
    Manufacture getWorkerManufacture(@PathVariable("workerId") Long workerId){
        return workerService.getManufactureByUser(workerId);
    }
    @GetMapping(value = "/workers")
    public @ResponseBody
    List<Worker> getWorkersData() {
        return workerService.getWorkers();
    }
}
