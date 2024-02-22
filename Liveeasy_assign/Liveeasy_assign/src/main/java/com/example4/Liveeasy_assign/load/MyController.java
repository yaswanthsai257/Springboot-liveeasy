package com.example4.Liveeasy_assign.load;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private loadservice service;

    @GetMapping("/load")
    public List<Load> load() {
        return this.service.load();
    }

    @GetMapping("/load/{loadid}")
    public Load Loadid(@PathVariable int loadid) {
        return this.service.Loadid(loadid);
    }

    @PostMapping("/load")
    public String addload(@RequestBody Load l) {
        if (this.service.addload(l) != null) {
            return "Load details added successfully";
        } else {
            return "Failed to add load details";
        }
    }

    @PutMapping("/load/{loadid}")
    public Load update(@PathVariable int loadid, @RequestBody Load l) {
        return this.service.update(loadid, l);
    }

    @DeleteMapping("/load/{loadid}")
    public String deleteLoad(@PathVariable int loadid) {
        boolean deleted = this.service.deleteLoad(loadid);
        if (deleted) {
            return "Load with ID " + loadid + " deleted successfully";
        } else {
            return "Load with ID " + loadid + " not found";
        }
    }
}
