package br.com.jsf.basic.bean;

import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

@RequestScoped
@ManagedBean (name = "converterValidationBean")
public class ConverterValidationBean {


	private Date dateTimeConverter;
	private Number numberConverter;
	private String converterIdentifier;
	private String bindingConverter;
	private String beanValidator;
	
	public ConverterValidationBean(){
		System.out.println("Construtor");
		dateTimeConverter = new Date();
		numberConverter = 12345678;
	}
	
	public void beanValidator(FacesContext context, UIComponent comp, Object value){
		System.out.println("SUCESSO: Validacao por metodo bean");
		context.addMessage("form:beanValidatorTest", new FacesMessage("Teste validacao por metodo do bean."));
	}
	
	public Date getDateTimeConverter() {
		System.out.println("dateTimeConverter");
		return dateTimeConverter;
	}
	public void setDateTimeConverter(Date dateTimeConverter) {
		this.dateTimeConverter = dateTimeConverter;
	}
	public Number getNumberConverter() {
		System.out.println("numberConverter");
		return numberConverter;
	}
	public void setNumberConverter(Number numberConverter) {
		this.numberConverter = numberConverter;
	}
	public String getConverterIdentifier() {
		System.out.println("converterIdentifier");
		return converterIdentifier;
	}
	public void setConverterIdentifier(String converterIdentifier) {
		this.converterIdentifier = converterIdentifier;
	}
	public String getBindingConverter() {
		System.out.println("bindingConverter");
		return bindingConverter;
	}
	public void setBindingConverter(String bindingConverter) {
		this.bindingConverter = bindingConverter;
	}
	public String getBeanValidator() {
		System.out.println("beanValidator");
		return beanValidator;
	}
	public void setBeanValidator(String beanValidator) {
		this.beanValidator = beanValidator;
	}	
}
