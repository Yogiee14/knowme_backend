package com.knowme.backend.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.knowme.backend.service.backendService;
import com.knowme.backend.dto.feedbackDTO;



@RestController
@CrossOrigin
@RequestMapping(value="/knowme/")
public class backendapi {
	
	@Autowired
	private backendService backendService;
	
	@PostMapping(value="gotfeedback")
	public ResponseEntity<String> gotfeedback(@RequestBody feedbackDTO feedbackDTO){
		backendService.savefeedback(feedbackDTO);
		return new ResponseEntity<>("Message Saved",HttpStatus.CREATED);
	}
	
	@GetMapping(value="getfeedbacks")
	public ResponseEntity<List<feedbackDTO>> viewfeedbacks(){
		List<feedbackDTO> feedbacklist = backendService.viewfeedbacks();
		return new ResponseEntity<List<feedbackDTO>>(feedbacklist,HttpStatus.OK); 
		
	}
		
	@GetMapping(value="python")
	public ResponseEntity<String> getpy(){
		String s = backendService.pythonservice();
		return new ResponseEntity<String>(s,HttpStatus.OK);
	
	}
}
