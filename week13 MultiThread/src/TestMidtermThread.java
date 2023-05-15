/*
 *  Ratchapoom Huabiam
 *  ID: 6402041620256
 */

public class TestMidtermThread {
	    
 	public static void main(String[] args) {
 	double[] CED = {5,6,3,2,8,9,6,10,6,4,9,3,7,4};
    double[] RA = {6,5,3,7,8,5,9,4,10,3,2,8,7};
    double[] TA = {5,3,8,5,9,8,9,5,3,4};
    double total;
    double totalAvg;
   
        // Create Thread
		MidtermThread MTCED = new MidtermThread("CED",CED);
		MidtermThread MTRA = new MidtermThread("RA",RA);
		MidtermThread MTTA = new MidtermThread("TA",TA);
		
		Thread tCED = new Thread(MTCED);
        Thread tRA = new Thread(MTRA);
        Thread tTA = new Thread(MTTA);        
       
        //Start Thread // Unblocked Statement
        tCED.start();
        tRA.start();
        tTA.start();
      
        // Join Thread
        try {
			 tCED.join();
			 tRA.join();
			 tTA.join();
		 }
		 catch(InterruptedException e) {			
		 }
        
        System.out.printf("Sect: %s -- Avg: %.2f\n",MTCED.getSect(),MTCED.getAverage());
        System.out.printf("Sect: %s  -- Avg: %.2f\n",MTRA.getSect(),MTRA.getAverage());
        System.out.printf("Sect: %s  -- Avg: %.2f\n",MTTA.getSect(),MTTA.getAverage());
        
        // Average of all 3 Section.
        total = MTCED.getAverage()+MTRA.getAverage()+MTTA.getAverage();
     
        totalAvg = total /3;
        System.out.printf("Total average = %.2f\n",totalAvg);
	}

}
