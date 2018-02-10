package br.com.jsf.basic.bean;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

/**
 * Class to test bean instanciate by annotation.
 * It's not necessary a faces-config declaration.
 * 
 * @author Fabiana Araujo
 */

@ManagedBean
public class HelloBean {

	private String mensagem = "Init message!!!";

	@PostConstruct
	public void init(){
		System.out.println("HelloBean: Executed!");
	}
	
	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	
}
