/*
 *  Ratchapoom Huabiam
 *  ID: 6402041620256
 */

public class MidtermThread implements Runnable {
    // Properties
	private double score[]; // Store Student's score
	private String sect; // Section of student's
	private double average; // Average score of this section
	 
	// Constructor
	public MidtermThread() {
		super();
	}
	// Overloading  Constructor
	public MidtermThread(String sect,double[] score) {
		this.sect = sect;
		this.score = score;
	}
	// Setter
	public void setSect(String sect) {
		this.sect = sect;
	}
	public void setScore(double score[]) {
		this.score = score;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	
	// Getter
	public String getSect() {
		return this.sect;
	}
	public double[] getScore() {
		return this.score;
	}
	public double getAverage() {
		return this.average;
	}
	@Override
	public void run() { // Compute Average score of a given section.
		int NUM = this.score.length;
		double SUM = 0.0;		
		for(int i=0; i<NUM; i++) {
			SUM +=  this.score[i];
		}
		
		this.average = SUM/NUM;
	}

}
