package com.canalli.workshopmongo.dto;

import java.io.Serializable;
import java.util.Date;

public class CommentDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String text;
	private Date date;
	private AuthorDTO dto;
	
	public CommentDTO() {
		
	}
	
	public CommentDTO(String text, Date date, AuthorDTO dto) {
		super();
		this.text = text;
		this.date = date;
		this.dto = dto;
	}
	
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public AuthorDTO getDto() {
		return dto;
	}
	
	public void setDto(AuthorDTO dto) {
		this.dto = dto;
	}	
	
}
