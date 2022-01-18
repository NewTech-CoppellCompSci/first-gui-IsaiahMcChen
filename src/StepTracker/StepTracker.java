package StepTracker;

public class StepTracker {
  //Parameters
   private int requiredSteps = 0;
   private int activeDays = 0;
   private int totalDays = 0;
   private int totalStepsTaken = 0;

   //Constructors
  public StepTracker(int requiredSteps) {
        this.requiredSteps = requiredSteps;
  }
  
  //Method 1 (Setter)
  public void addDailySteps(int steps) {
      //if steps taken that day are enough to be considered active
	  if (steps >= requiredSteps){
        //yes
		  	//adds total steps taken
		  totalStepsTaken += steps;
			//adds to how many days tracked
		  totalDays++;
		  	//since it was an active day, adds an active day
		  activeDays++;
      }
	  else {
		  //no
		  	//adds total steps taken
		  totalStepsTaken += steps;
		  	//adds to how many days tracked
		  totalDays++;
	  }
  }
  
  //Method 2 (Getter)
  public int activeDays() {
	  return activeDays;
  }
  
  //Method 3
  public double averageSteps() {
	//checks to see if any data was taken at all
	 if (totalStepsTaken == 0 || totalDays == 0) {
		 double calculation = (totalStepsTaken / totalDays);
		 return calculation;
	 }
	 return 0;
  }
}
