package fr.bsdev.structures;

import java.util.Arrays;
import java.util.Objects;

public class Tuple {
	
	private Object[] data =null;
	private int len = 0;
	
	public Tuple(Object ...is ) {
		this.len = is.length;
		data = new Object[len];
		int i=0;
		for(Object o:is)
			data[i++]=o;
			
	}
	
	public int getLen() {
		return len;
	}
	
	public Object get(int pt) {
		if(pt<0 || pt>this.len)
			return null;
		return this.data[pt];
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.deepHashCode(data);
		result = prime * result + Objects.hash(len);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tuple other = (Tuple) obj;
		return Arrays.deepEquals(data, other.data) && len == other.len;
	}
	@Override
	public String toString() {
		return "Tuple [\n       data=" + Arrays.toString(data) + ",\n       len=" + len + "\n]";
	}
	
	
	
}
