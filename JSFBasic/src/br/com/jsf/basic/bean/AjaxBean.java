package br.com.jsf.basic.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class AjaxBean implements Serializable{

	private static final long serialVersionUID = 1L;

	
	private String message;

	
	public void listener(){
		message = "Fisrt Name Test";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	


}
