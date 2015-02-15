package objects;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class Committee {
	
	//****************************
    //  Variables
  	//****************************
	
	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	
	@Persistent
	private String name;
	
	@Persistent
	private String position;
	
	@Persistent
	private String email;

	//****************************
    //  Constructors
  	//****************************
	
	public Committee() {}
	
	/**
	 * 
	 * @param name
	 * @param position
	 * @param email
	 */
    public Committee(String name, String position, String email) {
		super();
		this.name = name;
		this.position = position;
		this.email = email;
	}	
	
    //****************************
    //  General methods
  	//****************************

	@Override
	public String toString() {
		return "Committee [key=" + key + ", name=" + name + ", position="
				+ position + ", email=" + email + "]";
	}
    
	//****************************
	//  Getters and Setters
	//****************************
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Key getKey() {
		return key;
	}
	public void setKey(Key key) {
		this.key = key;
	}

}
