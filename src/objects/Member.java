package objects;



import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@PersistenceCapable
@JsonIgnoreProperties(ignoreUnknown = true)
public class Member {
	
    //****************************
    //  Variables
  	//****************************
	
	// basic vars
	@Persistent
	private  String name;
	@Persistent
	private  String gender;
	@Persistent
	private  boolean shirt;
	@Persistent
	private  String shirtSize;
	@Persistent
	private  String shirtColor;
	@Persistent
	private  boolean pastCommISTO;
	@Persistent
	private  boolean socialTicket;
	
	// Trampolining Competitor vars
	@Persistent
	private  boolean trampolineCompetitor;
	@Persistent
	private  boolean trampolineSyncCompetitor;
	@Persistent
	private  String trampolineSyncPartner;
	@Persistent
	private  String trampolineLevel;
	@Persistent
	private  String trampolineSyncLevel;
	@Persistent
	private  String trampolineTeam;
	
	// Tumbling Competitor vars
	@Persistent
	private  boolean tumblingCompetitor;
	@Persistent
	private  String tumblingLevel;
		
	// Dmt Competitor vars
	@Persistent
	private  boolean dmtCompetitor;
	@Persistent
	private  String dmtLevel;
	
	// Trampoline judging vars
	@Persistent
	private  boolean trampolineFormJudge;
	@Persistent
	private  boolean trampolineTariffJudge;
	@Persistent
	private  boolean trampolineSyncJudge;
	@Persistent
	private  boolean trampolineSuperiorJudge;
	@Persistent
	private  String trampolineJudgeLevel;
	
	// Tumbling judging vars
	@Persistent
	private  boolean tumblingJudge;
	@Persistent
	private  String tumblingJudgeLevel;
	@Persistent
	private  boolean tumblingSuperiorJudge;
	
	// Dmt judging
	@Persistent
	private  boolean dmtJudge;
	@Persistent
	private  String dmtJudgeLevel;
	@Persistent
	private  boolean dmtSuperiorJudge;
	
	// Helping vars
	@Persistent
	private  boolean marshling;
	@Persistent
	private  boolean scorekeeper;

    //****************************
    //  Constructors
  	//****************************
	
	public Member(){}


	//****************************
    //  General methods
  	//****************************
	@Override
	public String toString() {
		return "Member [getName()=" + getName() + ", isPastCommISTO()="
				+ isPastCommISTO() + ", isSocialTicket()=" + isSocialTicket()
				+ ", isTrampolineCompetitor()=" + isTrampolineCompetitor()
				+ ", isTrampolineSyncCompetitor()="
				+ isTrampolineSyncCompetitor() + ", getTrampolineLevel()="
				+ getTrampolineLevel() + ", isTumblingCompetitor()="
				+ isTumblingCompetitor() + ", getTumblingLevel()="
				+ getTumblingLevel() + ", isDmtCompetitor()="
				+ isDmtCompetitor() + ", getDmtLevel()=" + getDmtLevel()
				+ ", isTrampolineFormJudge()=" + isTrampolineFormJudge()
				+ ", isTrampolineTariffJudge()=" + isTrampolineTariffJudge()
				+ ", isTrampolineSyncJudge()=" + isTrampolineSyncJudge()
				+ ", isTrampolineSuperiorJudge()="
				+ isTrampolineSuperiorJudge() + ", getTrampolineJudgeLevel()="
				+ getTrampolineJudgeLevel() + ", isTumblingJudge()="
				+ isTumblingJudge() + ", getTumblingJudgeLevel()="
				+ getTumblingJudgeLevel() + ", isTumblingSuperiorJudge()="
				+ isTumblingSuperiorJudge() + ", isDmtJudge()=" + isDmtJudge()
				+ ", getDmtJudgeLevel()=" + getDmtJudgeLevel()
				+ ", isDmtSuperiorJudge()=" + isDmtSuperiorJudge()
				+ ", isMarshling()=" + isMarshling() + ", isScorekeeper()="
				+ isScorekeeper() + ", isShirt()=" + isShirt()
				+ ", getShirtSize()=" + getShirtSize() + ", getShirtColor()="
				+ getShirtColor() + ", getGender()=" + getGender()
				+ ", getTrampolineSyncPartner()=" + getTrampolineSyncPartner()
				+ ", getTrampolineSyncLevel()=" + getTrampolineSyncLevel()
				+ ", getTrampolineTeam()=" + getTrampolineTeam() + "]";
	}
	//****************************
	//  Getters and Setters
	//****************************
	
	public  String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public  boolean isPastCommISTO() {
		return pastCommISTO;
	}
	public void setPastCommISTO(boolean pastCommISTO) {
		this.pastCommISTO = pastCommISTO;
	}
	public  boolean isSocialTicket() {
		return socialTicket;
	}
	public void setSocialTicket(boolean socialTicket) {
		this.socialTicket = socialTicket;
	}
	public  boolean isTrampolineCompetitor() {
		return trampolineCompetitor;
	}
	public void setTrampolineCompetitor(boolean trampolineCompetitor) {
		this.trampolineCompetitor = trampolineCompetitor;
	}
	public  boolean isTrampolineSyncCompetitor() {
		return trampolineSyncCompetitor;
	}
	public void setTrampolineSyncCompetitor(boolean trampolineSyncCompetitor) {
		this.trampolineSyncCompetitor = trampolineSyncCompetitor;
	}
	public  String getTrampolineLevel() {
		return trampolineLevel;
	}
	public void setTrampolineLevel(String trampolineLevel) {
		this.trampolineLevel = trampolineLevel;
	}
	public  boolean isTumblingCompetitor() {
		return tumblingCompetitor;
	}
	public void setTumblingCompetitor(boolean tumblingCompetitor) {
		this.tumblingCompetitor = tumblingCompetitor;
	}
	public  String getTumblingLevel() {
		return tumblingLevel;
	}
	public void setTumblingLevel(String tumblingLevel) {
		this.tumblingLevel = tumblingLevel;
	}
	public  boolean isDmtCompetitor() {
		return dmtCompetitor;
	}
	public void setDmtCompetitor(boolean dmtCompetitor) {
		this.dmtCompetitor = dmtCompetitor;
	}
	public  String getDmtLevel() {
		return dmtLevel;
	}
	public void setDmtLevel(String dmtLevel) {
		this.dmtLevel = dmtLevel;
	}
	public  boolean isTrampolineFormJudge() {
		return trampolineFormJudge;
	}
	public void setTrampolineFormJudge(boolean trampolineFormJudge) {
		this.trampolineFormJudge = trampolineFormJudge;
	}
	public  boolean isTrampolineTariffJudge() {
		return trampolineTariffJudge;
	}
	public void setTrampolineTariffJudge(boolean trampolineTariffJudge) {
		this.trampolineTariffJudge = trampolineTariffJudge;
	}
	public  boolean isTrampolineSyncJudge() {
		return trampolineSyncJudge;
	}
	public void setTrampolineSyncJudge(boolean trampolineSyncJudge) {
		this.trampolineSyncJudge = trampolineSyncJudge;
	}
	public  boolean isTrampolineSuperiorJudge() {
		return trampolineSuperiorJudge;
	}
	public void setTrampolineSuperiorJudge(boolean trampolineSuperiorJudge) {
		this.trampolineSuperiorJudge = trampolineSuperiorJudge;
	}
	public  String getTrampolineJudgeLevel() {
		return trampolineJudgeLevel;
	}
	public void setTrampolineJudgeLevel(String trampolineJudgeLevel) {
		this.trampolineJudgeLevel = trampolineJudgeLevel;
	}
	public  boolean isTumblingJudge() {
		return tumblingJudge;
	}
	public void setTumblingJudge(boolean tumblingJudge) {
		this.tumblingJudge = tumblingJudge;
	}
	public  String getTumblingJudgeLevel() {
		return tumblingJudgeLevel;
	}
	public void setTumblingJudgeLevel(String tumblingJudgeLevel) {
		this.tumblingJudgeLevel = tumblingJudgeLevel;
	}
	public  boolean isTumblingSuperiorJudge() {
		return tumblingSuperiorJudge;
	}
	public void setTumblingSuperiorJudge(boolean tumblingSuperiorJudge) {
		this.tumblingSuperiorJudge = tumblingSuperiorJudge;
	}
	public  boolean isDmtJudge() {
		return dmtJudge;
	}
	public void setDmtJudge(boolean dmtJudge) {
		this.dmtJudge = dmtJudge;
	}
	public  String getDmtJudgeLevel() {
		return dmtJudgeLevel;
	}
	public void setDmtJudgeLevel(String dmtJudgeLevel) {
		this.dmtJudgeLevel = dmtJudgeLevel;
	}
	public  boolean isDmtSuperiorJudge() {
		return dmtSuperiorJudge;
	}
	public void setDmtSuperiorJudge(boolean dmtSuperiorJudge) {
		this.dmtSuperiorJudge = dmtSuperiorJudge;
	}
	public  boolean isMarshling() {
		return marshling;
	}
	public void setMarshling(boolean marshling) {
		this.marshling = marshling;
	}
	public  boolean isScorekeeper() {
		return scorekeeper;
	}
	public void setScorekeeper(boolean scorekeeper) {
		this.scorekeeper = scorekeeper;
	}

	public  boolean isShirt() {
		return shirt;
	}


	public void setShirt(boolean shirt) {
		this.shirt = shirt;
	}


	public  String getShirtSize() {
		return shirtSize;
	}


	public void setShirtSize(String shirtSize) {
		this.shirtSize = shirtSize;
	}


	public  String getShirtColor() {
		return shirtColor;
	}


	public void setShirtColor(String shirtColor) {
		this.shirtColor = shirtColor;
	}


	public  String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public  String getTrampolineSyncPartner() {
		return trampolineSyncPartner;
	}


	public void setTrampolineSyncPartner(String trampolineSyncPartner) {
		this.trampolineSyncPartner = trampolineSyncPartner;
	}


	public   String getTrampolineSyncLevel() {
		return trampolineSyncLevel;
	}


	public void setTrampolineSyncLevel(String trampolineSyncLevel) {
		this.trampolineSyncLevel = trampolineSyncLevel;
	}


	public  String getTrampolineTeam() {
		return trampolineTeam;
	}


	public void  setTrampolineTeam(String trampolineTeam) {
		this.trampolineTeam = trampolineTeam;
	}
	
	





}
