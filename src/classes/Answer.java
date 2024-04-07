package classes;

import java.io.Serializable;

public class Answer implements Comparable<Answer>, Serializable, Cloneable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private boolean isCorrect;
	private String text;
	
	public Answer(boolean isCorrect, String text) {
		this.isCorrect = isCorrect;
		this.text = text;
	}
	
	public Answer(Answer other) {
		this.isCorrect = other.isCorrect;
		this.text = other.text;
	}
	
	public int getCharAmount() {
		return text.length();
	}
	
	public String toString() {
		return "Answer text: " + text;
	}

	public boolean isCorrect() {
		return isCorrect;
	}

	public String getText() {
		return text;
	}
	
	@Override
	public Answer clone() throws CloneNotSupportedException {
		return (Answer)super.clone();
	}

	public boolean equals(Object o) {
		if(!(o instanceof Answer))
			return false;
		Answer a = (Answer)o;
		return (a.isCorrect == this.isCorrect && a.text.equals(this.text));	
	}

	@Override
	public int compareTo(Answer a) {
		if(a.getCharAmount() < this.getCharAmount())
			return -1;
		else if(a.getCharAmount() > this.getCharAmount())
			return 1;
		return 0;
	}
}
