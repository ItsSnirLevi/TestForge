package classes;

import java.io.PrintWriter;
import java.io.Serializable;

public class OpenQuestion extends Question implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Answer answer;
	
	public OpenQuestion(String queText, Answer answer) {
		super(queText);
		this.id = serialNumber++;
		this.answer = answer;
	}

	public void saveAnswer(PrintWriter pw) {
		pw.println(answer.getText());
	}
	
	public int getId() {
		return id;
	}

	public Answer getAnswer() {
		return answer;
	}

	public boolean setAnswer(Answer answer) throws CloneNotSupportedException {
		this.answer = answer.clone();
		return true;
	}

	@Override
	public OpenQuestion clone() throws CloneNotSupportedException {
		OpenQuestion tmp = (OpenQuestion)super.clone();
		tmp.answer = this.answer.clone();
		return tmp;
	}
	
	public String toString() {
		return super.toString() + "\nID: " + id + "\n"+ answer.toString() + "\n";
	}
	
	public boolean equals(Object o) {
		if(!super.equals(o))
			return false;
		if(!(o instanceof OpenQuestion))
			return false;
		OpenQuestion oq = (OpenQuestion) o;
		if(!(oq.answer.equals(this.answer)))
			return false;
		return true;
	}
}
