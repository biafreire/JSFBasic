package br.com.jsf.basic.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator ("validatorAnnotation")
public class ValidatorAnnotation implements Validator{

	@Override
	public void validate(FacesContext arg0, UIComponent arg1, Object arg2) throws ValidatorException {
//		System.out.println("SUCESSO: Validator Test Annotation");
		//arg0.addMessage(null, new FacesMessage("SUCESSO: Validator Annotation"));
		System.out.println("ERRO: Validator Test Annotation");
		throw new ValidatorException(new FacesMessage("ERRO: Teste Erro validacao"));
	}

}
