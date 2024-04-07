package classes;

import java.io.PrintWriter;
import java.io.Serializable;

public abstract class  Question implements Serializable, Cloneable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected static int serialNumber = 1;
	protected String text;
	protected int id;
	
	public Question(String text) {
		this.text = text;
	}
	
	public int getId() {
		return id;
	}

	public int getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(int serialNumber) {
		Question.serialNumber = serialNumber;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	@Override
	public Question clone() throws CloneNotSupportedException {
		return (Question)super.clone();
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Question))
			return false;
		Question q = (Question) obj;
		return (q.getText().equals(this.getText()) && q.getSerialNumber() == this.getSerialNumber());
	}
	
	public void save(PrintWriter pw) {
		pw.println(text);
		if(this instanceof AmericanQuestion) {
			AmericanQuestion aq = (AmericanQuestion)this;
			aq.saveQuestionOptions(pw);
		}
	}
	
	public String toString() {
		return "Question text: " + text;
	}
}
