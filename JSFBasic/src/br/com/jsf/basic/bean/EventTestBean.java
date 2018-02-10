package br.com.jsf.basic.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ComponentSystemEvent;
import javax.faces.event.ValueChangeEvent;

@ManagedBean
@RequestScoped
public class EventTestBean {

	private String firstName;
	private Long zipCode;
	
	@PostConstruct
	public void post(){
		System.out.println("PostConstruct");
	}
	
	@PreDestroy
	public void preDestroy(){
		System.out.println("PreDestroy");
		System.out.println("##########");
	}
	
	public EventTestBean(){
		System.out.println("Constructor");
	}
	
	public void valueChangeListener(ValueChangeEvent e){
		System.out.println("ValurChangeEvent [new value]: "+ e.getNewValue());
		System.out.println("ValurChangeEvent [old value]: "+ e.getOldValue());
	}
	
	public void preRenderViewTest(ComponentSystemEvent event){
		System.out.println("PreRenderView: Entrou ...");
	}

	// ---- Getters && Setters -----------
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Long getZipCode() {
		return zipCode;
	}

	public void setZipCode(Long zipCode) {
		this.zipCode = zipCode;
	}
	
	
}
