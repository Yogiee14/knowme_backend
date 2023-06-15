package com.knowme.backend.service;

import java.util.List;

import com.knowme.backend.dto.feedbackDTO;

public interface backendService {
	 void savefeedback(feedbackDTO feedbackDTO);
	 List<feedbackDTO> viewfeedbacks();
	 String pythonservice();
	
}
