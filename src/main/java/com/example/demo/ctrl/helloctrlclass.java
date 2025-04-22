package com.example.demo.ctrl;


import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloctrlclass {

	  @GetMapping("/namegetall")
	    public Map<String, Object> getResponse() {
	        Map<String, Object> response = new HashMap<>();
	        response.put("success", true);
	        response.put("name", "meghadeep");
	        return response;
	    }
}
