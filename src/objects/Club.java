package objects;

import java.util.ArrayList;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.appengine.api.datastore.Key;

/** The object model for the data we are sending through endpoints */
@PersistenceCapable
@JsonIgnoreProperties(ignoreUnknown = true)
public class Club {

	//****************************
    //  Variables
  	//****************************
	
	@Persistent
    String name;
	
	@Persistent
    ArrayList<Committee> committee;
	
	@Persistent
	ArrayList<Member> members;
    
    //****************************
    //  Constructors
  	//****************************

    public Club() {}
    
    public Club(String name) {
    	super();
    	this.name = name;
    	this.committee = new ArrayList<Committee>();
    	this.members = new ArrayList<Member>();
    }
    
	//****************************
	//  General methods
	//****************************
    
	@Override
	public String toString() {
		return "Club [name=" + name + ", key="  + ", committee=" + committee
				+ ", members=" + members + "]";
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

	public ArrayList<Committee> getCommittee() {
		return committee;
	}

	public void setCommittee(ArrayList<Committee> committee) {
		this.committee = committee;
	}

	public ArrayList<Member> getMembers() {
		return members;
	}

	public void setMembers(ArrayList<Member> members) {
		this.members = members;
	}


}
