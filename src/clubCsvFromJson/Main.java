package clubCsvFromJson;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.net.*;
import java.io.*;

import javax.jdo.annotations.Persistent;

import objects.Club;
import objects.Items;
import objects.Member;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
	
	private final static Logger LOGGER		= Logger.getLogger(Main.class.getName());
	private final static String URL			= "https://1-dot-bamboo-depth-694.appspot.com/_ah/api/api/v1/clubcollection";
	private final static String FILE_LOCATION	= "clubData.csv";

	private static String jsonData = "";
	private static ObjectMapper mapper = new ObjectMapper();
	private static Items clubs;
	private static Club club;
	
	private static String YES = "Yes";
	private static String NO = "No";
	
	public static void main(String []args) throws Exception{

		LOGGER.log(Level.INFO, "Staring...");
		mapper.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
		
		LOGGER.log(Level.INFO, "Grabbing json from " + URL);
		try {
			jsonData = getTextFromUrl(URL);			
		}catch (Exception e) {
			LOGGER.log(Level.SEVERE, "Failed to retireve content from " + URL);
			LOGGER.log(Level.SEVERE, e.getMessage());
			return;
		}
		LOGGER.log(Level.INFO, "Json retrieved");
		
		LOGGER.log(Level.INFO, "Converting Json to Java objects");
			
		try{
			clubs = mapper.readValue(jsonData, Items.class);
		}catch(Exception e){
			LOGGER.log(Level.SEVERE, "Failed to conver Json to Java objects");
			LOGGER.log(Level.SEVERE, e.getMessage());
			return;
		}
		
		LOGGER.log(Level.INFO, "Building to csv file");
		
		String csvHeader = "Club,"
				+ "Name,"
				+ "Gender,"
				+ "Guest,"
				+ "Shirt,"
				+ "Shirt Size,"
				+ "Shirt Color,"
				+ "Past CommISTO,"
				+ "Social Ticket,"
				+ "Trampoline Competitor,"
				+ "Trampoline Sync Competitor,"
				+ "Trampoline Sync Partner,"
				+ "Trampoline Level,"
				+ "Trampoline Sync Level,"
				+ "Trampoline Team,"
				+ "Tumbling Competitor,"
				+ "Tumbling Level,"
				+ "Dmt Competitor,"
				+ "Dmt Level,"
				+ "Trampoline Form Judge,"
				+ "Trampoline Tariff Judge,"
				+ "Trampoline Sync Judge,"
				+ "Trampoline Superior Judge,"
				+ "Trampoline Judge Level,"
				+ "Tumbling Judge,"
				+ "Tumbling JudgeLevel,"
				+ "Tumbling Superior Judge,"
				+ "Dmt Judge,"
				+ "Dmt Judge Level,"
				+ "Dmt Superior Judge,"
				+ "Scorekeeper,"
				+ "Marshalling,"
				+ "\n";
		
		try{
			FileWriter writer = new FileWriter(FILE_LOCATION);
			writer.append(csvHeader);
			System.out.println("Number of clubs: " + clubs.getItems().size());
			for(Club c: clubs.getItems()){
				if(c.getMembers() != null){
					System.out.println("Building info for " + c.getName());
				    for(Member m: c.getMembers()){
				    	// Club name
				    	writer.append(c.getName() + ",");
					    // Name
				    	writer.append(m.getName() + ",");
					    // Gender
					    writer.append(m.getGender() + ",");
					    // Guest
					    if(m.isGuest()){
					    	writer.append(YES + ",");
					    }else{
					    	writer.append(NO + ",");
					    }
					    // Shirt
					    if(m.isShirt()){
					    	writer.append(YES + ",");
					    }else{
					    	writer.append(NO + ",");
					    }
					    // Shirt Size
					    writer.append(m.getShirtSize() + ",");
					    // Shirt Color
					    writer.append(m.getShirtColor() + ",");
					    // Past commisto
					    if(m.isPastCommISTO()){
					    	writer.append(YES + ",");
					    }else{
					    	writer.append(NO + ",");
					    }
					    // Social
					    if(m.isSocialTicket()){
					    	writer.append(YES + ",");
					    }else{
					    	writer.append(NO + ",");
					    }
					    // Trampoline
					    if(m.isTrampolineCompetitor()){
					    	writer.append(YES + ",");
					    }else{
					    	writer.append(NO + ",");
					    }
					    // Trampoline sync
					    if(m.isTrampolineSyncCompetitor()){
					    	writer.append(YES + ",");
					    }else{
					    	writer.append(NO + ",");
					    }
					    // Trampoline sync partner
					    writer.append(m.getTrampolineSyncPartner() + ",");
					    // Trampoline Level
					    writer.append(m.getTrampolineLevel() + ",");
					    // Trampoline Sync Level
					    writer.append(m.getTrampolineSyncLevel() + ",");
					    // trampoline team
					    writer.append(m.getTrampolineTeam() + ",");
					    // tumbling levelCompetitor
					    if(m.isTumblingCompetitor()){
					    	writer.append(YES + ",");
					    }else{
					    	writer.append(NO + ",");
					    }
				    	// tumbling level
				    	writer.append(m.getTumblingLevel() + ",");
				    	// dmt competitor
				    	if(m.isDmtCompetitor()){
					    	writer.append(YES + ",");
					    }else{
					    	writer.append(NO + ",");
					    }
				    	// dmt level
				    	writer.append(m.getDmtLevel() + ",");
				    	// Trampoline form Judge
				    	if(m.isTrampolineFormJudge()){
					    	writer.append(YES + ",");
					    }else{
					    	writer.append(NO + ",");
					    }
				    	// Trampoline tariff Judge
				    	if(m.isTrampolineTariffJudge()){
					    	writer.append(YES + ",");
					    }else{
					    	writer.append(NO + ",");
					    }
				    	// Trampoline Sync Judge
				    	if(m.isTrampolineSyncJudge()){
					    	writer.append(YES + ",");
					    }else{
					    	writer.append(NO + ",");
					    }
				    	// Trampoline Superior Judge
				    	if(m.isTrampolineSuperiorJudge()){
					    	writer.append(YES + ",");
					    }else{
					    	writer.append(NO + ",");
					    }
				    	// Trampoline Judge Level
				    	writer.append(m.getTrampolineJudgeLevel() + ",");
				    	// Tumbling Judge
				    	if(m.isTumblingJudge()){
					    	writer.append(YES + ",");
					    }else{
					    	writer.append(NO + ",");
					    }
				    	// Tumbling JudgeLevel
				    	writer.append(m.getTumblingJudgeLevel() + ",");
				    	// Tumbling Superior Judge
				    	if(m.isTumblingSuperiorJudge()){
					    	writer.append(YES + ",");
					    }else{
					    	writer.append(NO + ",");
					    }
				    	// DmtJudge
				    	if(m.isDmtJudge()){
					    	writer.append(YES + ",");
					    }else{
					    	writer.append(NO + ",");
					    }
				    	writer.append(m.getDmtJudgeLevel() + ",");
				    	// DmtSuperiorJudge
				    	if(m.isDmtSuperiorJudge()){
					    	writer.append(YES + ",");
					    }else{
					    	writer.append(NO + ",");
					    }
				    	// Scorekeeping
				    	if(m.isScorekeeper()){
					    	writer.append(YES + ",");
					    }else{
					    	writer.append(NO + ",");
					    }
				    	// Marshalling
				    	if(m.isMarshling()){
					    	writer.append(YES);
					    }else{
					    	writer.append(NO);
					    }
				    	
				    	writer.append("\n");
				    }
				}
			}
			writer.flush();
		    writer.close();
		}catch(Exception e){
			LOGGER.log(Level.SEVERE, "Failed to build CSV file");
			LOGGER.log(Level.SEVERE, e.getMessage());
			return;
		}
		
		LOGGER.log(Level.INFO, "Saving csv file");

		LOGGER.log(Level.INFO, "File located at " + FILE_LOCATION);
		
	}
	
	/**
	 * Grab content from URL
	 * 
	 * @param url
	 * @return
	 * @throws IOException 
	 * @throws Exception
	 */
	public static String getTextFromUrl(String url) throws IOException {
        URL website = new URL(url);
        URLConnection connection = website.openConnection();
        BufferedReader in = new BufferedReader(
                                new InputStreamReader(
                                    connection.getInputStream()));

        StringBuilder response = new StringBuilder();
        String inputLine;

        while ((inputLine = in.readLine()) != null) 
            response.append(inputLine);

        in.close();

        return response.toString();
    }
	
	
}
