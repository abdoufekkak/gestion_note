package BEANS;

public class Cc implements ModeEvaluation {

	@Override
	public Double calculerNote(Double coeff, double note) {
	
		return coeff*note;
	}

}
