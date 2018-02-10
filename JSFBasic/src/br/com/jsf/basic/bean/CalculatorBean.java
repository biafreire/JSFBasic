package br.com.jsf.basic.bean;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class CalculatorBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private enum OPERATOR{
		SUM, DIF, DIV, MUL;
	}
	
	private Integer firstValue;
	private Integer secondValue;
	private String result;
	
	public String backToIndex(){
		return "index";
	}
	
	public void calculate(String operator){
		
		OPERATOR calc = OPERATOR.valueOf(operator);
		
		switch (calc){
			case SUM:
				result = String.valueOf(firstValue + secondValue);
				break;
			case DIF:
				result = String.valueOf(firstValue - secondValue);
				break;
			case DIV:
				result = String.valueOf(firstValue / secondValue);
				break;
			case MUL:
				result = String.valueOf(firstValue * secondValue);
				break;
			default:
				System.out.print("Operator not exist!!!");
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Operator not exist!!!"));
		}
		
	}
	
	public Integer getFirstValue() {
		return firstValue;
	}
	public void setFirstValue(Integer firstValue) {
		this.firstValue = firstValue;
	}
	public Integer getSecondValue() {
		return secondValue;
	}
	public void setSecondValue(Integer secondValue) {
		this.secondValue = secondValue;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}

}
