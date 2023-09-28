
package vaccinationprogramme;

/**
 *
 * @author Paolo Junior Costarelli - 20235305 - HCCOMP2
 */
public class PatientCA {
    
    private String fullName;
    private int age;
    private boolean symptoms; 
    private int priority;
    
    public PatientCA(){
        fullName = "";
        age = 0;
        symptoms = false;
        priority = 0;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
    
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSymptoms() {
        return symptoms;
    }

    public void setSymptoms(boolean symptoms) {
        this.symptoms = symptoms;
    }

    @Override
    public String toString() {
        return "Full Name: " + fullName + ", Age: " + age + ", Symptoms: " + symptoms + ", Priority: " + priority +"\n";
    }    
}
