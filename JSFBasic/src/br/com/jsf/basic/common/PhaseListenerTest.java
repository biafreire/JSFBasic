package br.com.jsf.basic.common;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

/**
 * Test to see when all phase is called
 *  
 * @author Fabiana Araujo
 *
 */
public class PhaseListenerTest implements PhaseListener{

	private static final long serialVersionUID = 1L;

	@Override
	public void afterPhase(PhaseEvent arg0) {
		System.out.println("afterPhase: " + arg0.getPhaseId());
	}

	@Override
	public void beforePhase(PhaseEvent arg0) {
		System.out.println("beforePhase: " + arg0.getPhaseId());
	}

	@Override
	public PhaseId getPhaseId() {
		System.out.println("getPhaseId");
		return PhaseId.ANY_PHASE;
	}

}
