package objects;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class Shirt {
	
	//****************************
    //  Variables
  	//****************************
	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key key;
	
	@Persistent
	private String size;
	@Persistent
	private String color;
    
	//****************************
    //  Constructors
  	//****************************
	
	public Shirt(){}
	
	public Shirt(String size, String color){
		this.size = size;
		this.color = color;
	}
	
	//****************************
	//  General methods
	//****************************

	@Override
	public String toString() {
		return "Shirt [key=" + key + ", size=" + size + ", color=" + color
				+ "]";
	}

	
	//****************************
	//  Getters and Setters
	//****************************
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}

	public Key getKey() {
		return key;
	}
	public void setKey(Key key) {
		this.key = key;
	}

	
}