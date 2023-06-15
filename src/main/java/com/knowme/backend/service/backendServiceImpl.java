package com.knowme.backend.service;

import java.util.ArrayList;
import java.util.List;

import org.python.util.PythonInterpreter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.knowme.backend.dto.feedbackDTO;
import com.knowme.backend.entity.feedback;
import com.knowme.backend.repository.messagerepository;

import jakarta.transaction.Transactional;


@Transactional
@Service(value="backendService")
public class backendServiceImpl implements backendService {
	
	@Autowired
	private messagerepository messagerepo;
	
	@Override
	public void savefeedback(feedbackDTO feedbackDTO) {
		feedback newfeedback = new feedback();
		newfeedback.setCarrer_feedback(feedbackDTO.getCarrer_feedback());
		newfeedback.setWebsite_feedback(feedbackDTO.getWebsite_feedback());
		messagerepo.save(newfeedback);
	}
	
	public List<feedbackDTO> viewfeedbacks(){
		Iterable<feedback> feedbacks = messagerepo.findAll();
		List<feedbackDTO> feedbacklist = new ArrayList<>();
		for(feedback f:feedbacks) {
			feedbackDTO feedbackdto = new feedbackDTO();
			feedbackdto.setCarrer_feedback(f.getCarrer_feedback());
			feedbackdto.setWebsite_feedback(f.getWebsite_feedback());
			feedbacklist.add(feedbackdto);
		}
		
		return feedbacklist;
	}
	@Override
	public String pythonservice() {
		
		PythonInterpreter interpreter = new PythonInterpreter();
		interpreter.execfile("game test.py"); 
		return "hello";
		
	}
}
