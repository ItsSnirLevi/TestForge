package classes;

import java.io.Serializable;

@SuppressWarnings("unchecked")
public class Set<T> implements Serializable, Cloneable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	T[] values;
	int logSize;
	
	
	public Set() {
		values = (T[])new Object[1];
		logSize = 0;
	}
	
	public int size() {
		return logSize;
	}
	
	public boolean add(T t) {
		if(this.contains(t))
			return false;
		if(logSize == values.length)
			this.enlargeArray();
		values[logSize++] = t;
		return true;
	}
	
	public boolean set( int index, T t ) {
		if( index > values.length || index < 0)
			return false;
		values[index] = t;
		return true;
	}
	
	public T get( int i ) {
		return values[i];
	}
	
	public boolean contains(T t) {
		for (int i = 0; i < logSize; i++) {
			if(t.equals(values[i]))
				return true;
		}
		return false;
	}
	
	private void enlargeArray() {
		T[] tmp = (T[]) new Object[values.length * 2];
		for (int i = 0; i < values.length; i++) {
			tmp[i] = values[i];
		}
		values = tmp;
	}
	
	@Override
	public Set<T> clone() throws CloneNotSupportedException {
		Set<T> tmp = (Set<T>)super.clone();  
		for (int i = 0; i < this.size(); i++) {
			tmp.set(i, this.get(i));
		}
		return tmp;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer("Set:\n");
		for (int i = 0; i < logSize; i++) {
			sb.append(values[i].toString() + "\n");
		}
		return sb.toString();
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Set))
			return false;
		Set<T> s = (Set<T>)obj;
		if(s.size() != this.size())
			return false;
		for (int i = 0; i < logSize; i++) {
			if(!(s.get(i).equals(this.get(i))))
				return false;			
		}
		return true;
	}
}
