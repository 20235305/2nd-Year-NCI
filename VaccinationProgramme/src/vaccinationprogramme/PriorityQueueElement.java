package vaccinationprogramme;

/**
 *
 * @author Paolo Junior Costarelli - 20235305 - HCCOMP2
 */
public class PriorityQueueElement {
    private int iKey;
    private PatientCA patient;
     
    public PriorityQueueElement(int iInPriority, PatientCA inPatient){
		iKey = iInPriority;
                patient = inPatient;
	}

    public int getiKey() {
		return iKey;
	}

      public void setiKey(int iInKey) {
		iKey = iInKey;
	}
	
	public PatientCA getPatient() {
            return patient;
      }

	public void setPatient(PatientCA inPatient) {
		patient = inPatient;
      }

      public String printPatient() {
          String sMessage ; 
          sMessage = "Name = " + patient.getFullName()+ " * Year of Birth = " + patient.getAge();
          return sMessage; 
      }
}
