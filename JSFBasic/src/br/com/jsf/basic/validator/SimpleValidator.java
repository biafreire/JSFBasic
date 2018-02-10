package br.com.jsf.basic.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

public class SimpleValidator implements Validator{

	@Override
	public void validate(FacesContext arg0, UIComponent arg1, Object arg2) throws ValidatorException {
		//System.out.println("SUCESSO: Validator Test ID");
		//arg0.addMessage(null, new FacesMessage("SUCESSO: Validator ID"));
		System.out.println("Erro: Validator Test ID");
		throw new ValidatorException(new FacesMessage("ERRO: Teste Erro validacao"));
	}

}
