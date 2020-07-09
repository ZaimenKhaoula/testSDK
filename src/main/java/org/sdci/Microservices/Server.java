package org.sdci.Microservices;

import java.io.IOException;

import org.sdci.sdk.communication.*;
import org.sdci.sdk.models.Request;
import org.sdci.sdk.models.Response;
import org.sdci.sdk.service.*;

public class Server extends BasicService {
		public static void main( String[] args ) throws IOException, InterruptedException {
			new Server("srv");
			
	    }
	
	 	public Server(String id) throws IOException, InterruptedException {
	        
	        XAddCommunicationFeature(new IServerService() {
	           
	         

				@Override
				public Response XProcessRequest(String sender, Request request) {
					System.out.println("received request [ "+request.getBody()+" ] from the client: [ "+ sender+" ]"); 
					Response r =new Response(null,null,"reponse du serveur");
	                return r;
				}   
	        });
	        this.StartService(id);
	        this.RunService();
	        //this.StopService();
	       
	    }

	    public void StartService(String idMicroService) throws IOException, InterruptedException {
	        XInitialize();
	        // do other service business stuff
	    }
	    public void StopService(){
	        // do other business stuff
	        XTerminate();
	    }
	    public void RunService() {
	        // do business stuff and make use of any of :
	        //  XSendRequest(destination, requestMessage);
	    	
	        //  XSubscribeToTopic(topic);
	        //  XPublishMessage(topic, requestMessage);
	    }
}
