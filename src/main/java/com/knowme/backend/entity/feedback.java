package com.knowme.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="feedback")
public class feedback {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="feedback_id")
	private Integer feedback_id;
	@Column(name="career_feedback")
	private String carrer_feedback;
	@Column(name="website_feedback")
	private String website_feedback;
	
	public Integer getFeedback_id() {
		return feedback_id;
	}
	public void setFeedback_id(Integer feedback_id) {
		this.feedback_id = feedback_id;
	}
	public String getCarrer_feedback() {
		return carrer_feedback;
	}
	public void setCarrer_feedback(String carrer_feedback) {
		this.carrer_feedback = carrer_feedback;
	}
	public String getWebsite_feedback() {
		return website_feedback;
	}
	public void setWebsite_feedback(String website_feedback) {
		this.website_feedback = website_feedback;
	}

}
