package com.controller;


import java.util.Scanner;

public class OfficerController {
	 public static void Options() {
	    	
	        Scanner sc = new Scanner(System.in);
	        

	        try {
	        	
	        
	            while (true) {
	            	
	                System.out.println("Press 1. Evidence Menu");
	                System.out.println("Press 2. Officers Menu");
	                System.out.println("Press 3. Incident Menu"); 
	                System.out.println("Press 4. Suspect Menu");
	                System.out.println("Press 5. Victim Menu");
	                System.out.println("Press 6. Agency Menu");
	                System.out.println("Press 7. Report Menu");
	                System.out.println("Press 8. Incident Officer Menu");
		            System.out.println("Press 0. Logout");
	           
		            
	                int input = sc.nextInt();
	                sc.nextLine();
	                
	                if(input == 0 ) break;

	                switch (input) {

	            	                    case 1:
	                    	   System.out.println("EvidenceMenu");
	                    	   EvidenceController.evidenceMenu(); 
                            break;
	                    case 2:
	                    	   System.out.println("OfficersMenu");
	                    	   OfficersController.officersControllerMenu(); 
                               break;
	                    case 3:
	                    	 System.out.println("IncidentMenu");
	                    	 IncidentController.incidentMenu();
	                    	 break;
	                    case 4:
	                    	System.out.println("SuspectMenu");
	                    	SuspectController.suspectMenu();
	                    	break;
	                    case 5:
	                    	System.out.println("VictimMenu");
	                    	VictimController.victimMenu();
	                    	break;
	                    case 6:
	                    	System.out.println("AgencyMenu");
	                    	AgencyController.AgencyMenu();
	                    	break;
	                    case 7:
	                    	System.out.println("ReportMenu");
	                    	ReportController.reportMenu();
	                    	break;
	                    case 8:
	                    	System.out.println("IncidentOfficerMenu");
	                    	IncidentOfficersController.incidentOfficerMenu();
	                    	break;
	                        
	                 
	                }
	            
	         }
	            
	        } finally {
	            
	            sc.close();
	        }
	    }

}
