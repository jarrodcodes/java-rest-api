package com.jarrodcodes.rollcallapi.RollCallApiController;

import com.jarrodcodes.rollcallapi.rollcallapimodel.*;
import com.jarrodcodes.rollcallapi.rollcallapirepository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class RollCallApiController {

	    @Autowired
	    RollCallApiRepository rollCallRepository;

	    @GetMapping("/student")
	    public List<RollCallApiModel> getAllStudents() {
	        return rollCallRepository.findAll();
	    }
}
