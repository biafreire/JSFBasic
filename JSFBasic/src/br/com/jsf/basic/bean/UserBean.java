package br.com.jsf.basic.bean;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;
import javax.faces.application.Application;
//import javax.el.ELContext;
//import javax.el.ExpressionFactory;
//import javax.el.ValueExpression;
//import javax.faces.application.Application;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedProperty;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import javax.faces.validator.ValidatorException;

/**
 * Class to test to instantiate UserBean and properties in faces-config file and use helloBean by evaluate Expression.
 * @author Fabiana Araujo
 */

public class UserBean {

	protected Date dob;
	protected String email;
	protected String firstName;
	protected String lastName;
	protected String serviceLevel = "medium";
	protected String sex;
	
	// Attr instantiate in faces-config
	@ManagedProperty (value="newUserBean")
	private UserBean newUserBean;
	
	// Attr was declared like a bean and instantiate in faces-cinfig
	private Map<String, String> mapTesteBeanProperty;
	
	// Attrs was declared in faces-config
	private String nickName;
	private String patName;
	private List<Integer> listaTeste;
	private Map<String, String> mapTeste;

	public UserBean() {
		FacesContext context = FacesContext.getCurrentInstance();
		Application application = context.getApplication();
		String msg = (String)application.evaluateExpressionGet(context, "#{helloBean.mensagem}", String.class);
		System.out.println(msg);
	}
	
	// ----------------------------------- Business
	
	/**
	 * Test: validate field by method
	 */
	public void validateEmail(FacesContext context, UIComponent toValidate,
			Object value) throws ValidatorException {
		String emailStr = (String) value;
		if (-1 == emailStr.indexOf("@")) {
			FacesMessage message = new FacesMessage("Invalid email address");
			throw new ValidatorException(message);
		}
	}

	public String addConfirmedUser() {
		boolean added = true; // actual application may fail to add user
		FacesMessage doneMessage = null;
		String outcome = null;
		if (added) {
			doneMessage = new FacesMessage("Sucessfully added new user");
			outcome = "done";
		} else {
			doneMessage = new FacesMessage("Failed to add new user");
			outcome = "register";
		}
		FacesContext.getCurrentInstance().addMessage(null, doneMessage);
		return outcome;
	}
	
	public String addConfirmedUserRedirect() {
		boolean added = true; // actual application may fail to add user
		FacesMessage doneMessage = null;
		String outcome = null;
		if (added) {
			doneMessage = new FacesMessage("Sucessfully added new user");
			outcome = "done?faces-redirect=true";
		} else {
			doneMessage = new FacesMessage("Failed to add new user");
			outcome = "register?faces-redirect=true";
		}
		FacesContext.getCurrentInstance().addMessage(null, doneMessage);
		return outcome;
	}
	
	public String register() {
		FacesContext context = FacesContext.getCurrentInstance();
		Application application = context.getApplication();
		ExpressionFactory expressionFactory = application.getExpressionFactory();
		ELContext elContext = context.getELContext();
		ValueExpression ve = expressionFactory.createValueExpression(elContext, "#{helloBean.mensagem}", String.class);
		String mensagem = (String)ve.getValue(elContext);
		System.out.println("Old Message: "+mensagem);
		ve.setValue(elContext, "Nova Mensagem");
		ValueExpression ve2 = expressionFactory.createValueExpression(elContext, "#{helloBean.mensagem}", String.class);
		System.out.println((String)ve2.getValue(elContext));
		
		return "confirm";
	}
	
	public void pullValuesFromFlash() {
		Flash flash = FacesContext.getCurrentInstance().getExternalContext().getFlash();
		setFirstName((String)flash.get("firstName"));
		setLastName((String)flash.get("lastName"));
		setDob((Date)flash.get("dob"));
		setEmail((String)flash.get("email"));
	}
	
	// -----------------------------------Getters && Setters
	
	public Date getDob() {
		return dob;
	}

	public String getEmail() {
		return email;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getServiceLevel() {
		return serviceLevel;
	}

	public String getSex() {
		return sex;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setServiceLevel(String serviceLevel) {
		this.serviceLevel = serviceLevel;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public UserBean getNewUserBean() {
		return newUserBean;
	}

	public void setNewUserBean(UserBean newUserBean) {
		this.newUserBean = newUserBean;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPatName() {
		return patName;
	}

	public void setPatName(String patName) {
		this.patName = patName;
	}
	
	public List<Integer> getListaTeste() {
		return listaTeste;
	}

	public void setListaTeste(List<Integer> listaTeste) {
		this.listaTeste = listaTeste;
	}
	
	public Map<String, String> getMapTeste() {
		return mapTeste;
	}

	public void setMapTeste(Map<String, String> mapTeste) {
		this.mapTeste = mapTeste;
	}
	
	public Map<String, String> getMapTesteBeanProperty() {
		return mapTesteBeanProperty;
	}

	public void setMapTesteBeanProperty(Map<String, String> mapTesteBeanProperty) {
		this.mapTesteBeanProperty = mapTesteBeanProperty;
	}

}
