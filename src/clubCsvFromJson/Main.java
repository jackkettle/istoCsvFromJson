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
				+ "Trampoline Sync Competitor,"
				+ "Trampoline Superior Judge,"
				+ "Tumbling JudgeLevel,"
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
				    	writer.append(c.getName() + ",");
					    writer.append(m.getName() + ",");
					    writer.append(m.getGender() + ",");
					    if(m.isShirt()){
					    	writer.append(YES + ",");
					    }else{
					    	writer.append(NO + ",");
					    }
					    writer.append(m.getShirtSize() + ",");
					    writer.append(m.getShirtColor() + ",");
					    if(m.isPastCommISTO()){
					    	writer.append(YES + ",");
					    }else{
					    	writer.append(NO + ",");
					    }
					    if(m.isSocialTicket()){
					    	writer.append(YES + ",");
					    }else{
					    	writer.append(NO + ",");
					    }
					    if(m.isTrampolineCompetitor()){
					    	writer.append(YES + ",");
					    }else{
					    	writer.append(NO + ",");
					    }
					    if(m.isTrampolineSyncCompetitor()){
					    	writer.append(YES + ",");
					    }else{
					    	writer.append(NO + ",");
					    }
					    writer.append(m.getTrampolineSyncPartner() + ",");
					    writer.append(m.getTrampolineLevel() + ",");
					    writer.append(m.getTrampolineSyncLevel() + ",");
					    writer.append(m.getTrampolineTeam() + ",");
				    	if(m.isTumblingCompetitor()){
					    	writer.append(YES + ",");
					    }else{
					    	writer.append(NO + ",");
					    }
				    	writer.append(m.getTumblingLevel() + ",");
				    	if(m.isDmtCompetitor()){
					    	writer.append(YES + ",");
					    }else{
					    	writer.append(NO + ",");
					    }
				    	writer.append(m.getDmtLevel() + ",");
				    	if(m.isTrampolineFormJudge()){
					    	writer.append(YES + ",");
					    }else{
					    	writer.append(NO + ",");
					    }
				    	if(m.isTrampolineTariffJudge()){
					    	writer.append(YES + ",");
					    }else{
					    	writer.append(NO + ",");
					    }	
				    	if(m.isTrampolineSyncCompetitor()){
					    	writer.append(YES + ",");
					    }else{
					    	writer.append(NO + ",");
					    }
				    	if(m.isTrampolineSuperiorJudge()){
					    	writer.append(YES + ",");
					    }else{
					    	writer.append(NO + ",");
					    }
				    	writer.append(m.getTumblingJudgeLevel() + ",");
				    	if(m.isTumblingJudge()){
					    	writer.append(YES + ",");
					    }else{
					    	writer.append(NO + ",");
					    }
				    	writer.append(m.getTumblingJudgeLevel() + ",");
				    	if(m.isTumblingSuperiorJudge()){
					    	writer.append(YES + ",");
					    }else{
					    	writer.append(NO + ",");
					    }
				    	if(m.isDmtJudge()){
					    	writer.append(YES + ",");
					    }else{
					    	writer.append(NO + ",");
					    }
				    	writer.append(m.getDmtJudgeLevel() + ",");
				    	if(m.isDmtSuperiorJudge()){
					    	writer.append(YES + ",");
					    }else{
					    	writer.append(NO + ",");
					    }
				    	if(m.isScorekeeper()){
					    	writer.append(YES + ",");
					    }else{
					    	writer.append(NO + ",");
					    }
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
