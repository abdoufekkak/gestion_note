package BEANS;

public class Projet implements ModeEvaluation {

	@Override
	public Double calculerNote(Double coeff, double note) {
		// TODO Auto-generated method stub
		return coeff*note;
	}

}
