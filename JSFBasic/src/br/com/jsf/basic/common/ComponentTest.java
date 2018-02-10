package br.com.jsf.basic.common;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponentBase;

/**
 * Class created just to see the declaration
 * 
 * @author Fabiana Araujo
 *
 */

@ManagedBean
@RequestScoped
public class ComponentTest extends UIComponentBase{

	@Override
	public String getFamily() {
		// TODO Auto-generated method stub
		return null;
	}

}
