package br.com.jsf.basic.common;

import javax.faces.context.ExceptionHandler;
import javax.faces.context.ExceptionHandlerFactory;

/**
 * Class create only to test declaration
 * 
 * @author Fabiana Araujo
 *
 */

@Deprecated
public class CustomExceptionHandlerFactoryTest extends ExceptionHandlerFactory{
	
	private ExceptionHandlerFactory parent;

	public CustomExceptionHandlerFactoryTest(ExceptionHandlerFactory parent) {
		this.parent = parent;
	}
	
	@Override
	public ExceptionHandler getExceptionHandler() {
		ExceptionHandler handler = new CustomExceptionHandlerTest(parent.getExceptionHandler());
		return handler;
	}

}
