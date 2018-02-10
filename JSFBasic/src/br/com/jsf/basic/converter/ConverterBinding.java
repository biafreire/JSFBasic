package br.com.jsf.basic.converter;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

@FacesConverter ("converterBinding")
public class ConverterBinding implements Converter{

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String value) {
		System.out.println("Teste converter as object");
		
		if (value == null || value == "") {
			throw new ConverterException("Erro: de conversão [AsObject]. Valor vazio");
		}
		
		arg0.addMessage(null, new FacesMessage("SUCESSO: Teste Converter as Object"));
		return "Teste Converter as Object";
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object value) {
		System.out.println("Teste converter as String");
		
		if (value == null || value == "") {
			throw new ConverterException("Erro: de conversão [AsString]. Valor vazio");
		}
		
		arg0.addMessage(null, new FacesMessage("SUCESSO: Teste Converter as String"));
		return "Teste Converter as String";
	}

}
