package vaccinationprogramme;

import java.util.*;

/**
 *
 * @author Paolo Junior Costarelli - 20235305 - HCCOMP2
 */
    
public class MyPriorityQueue implements PriorityQueueInterface{

    private ArrayList<PatientCA> thePQueue;

    public MyPriorityQueue() {
        thePQueue = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return thePQueue.isEmpty();
    }

    @Override
    public int size() {
        return thePQueue.size();
    }

    //a new element with a given key and element information will be added 
    @Override
    public String enqueue(PatientCA patient) {
        
        int age =  patient.getAge();
        boolean medicalCondition = patient.isSymptoms();
        patient.setPriority(findPriority(age,medicalCondition));
        int priority = patient.getPriority();
        
        if(thePQueue.isEmpty()){
            thePQueue.add(patient);
            return"Patient is added to position 1 \n";            
        }
        
        for(int i = 0; i < thePQueue.size(); i++ ){           
            if(thePQueue.get(i).getPriority() < priority){
                thePQueue.add(i,patient);
                return"Patient is added to position " + (i+1) + "\n";   
               
            }
            if(i == thePQueue.size()-1){
                thePQueue.add(patient);
                return"Patient is added to the last position \n";   
            }
        }
        return"No patient was added";
    }
    
    
    public int findPriority(int age, boolean medicalConditions){
        if(age > 17 && age < 65 && medicalConditions == true){
            return 6;
        }else if(age >= 90){
            return 10;
        }else if(age >= 80 && age <  90){
            return 9;
        }else if(age >= 70 && age <  80){
            return 8;
        }else if(age >= 65 && age <  70){
            return 7;
        }else if(age >= 55 && age <  65){
            return 5;
        }else if(age >= 45 && age <  55){
            return 4;
        }else if(age >= 30 && age <  45){
            return 3;
        }else if(age >= 18 && age <  30){
            return 2;
        }else if(age < 18){
            return 1;
        }
        return 0;
    }
    
    //remove the first element on the list, which has the highest key (priority)
    @Override
    public Object dequeue() {
        return thePQueue.remove(0);
    }
    
    
    @Override
    public String next(){
        String output = "The next patient is: \n" + thePQueue.get(0).toString();
        dequeue();
        return output;
    
    }

    @Override
    public String printPriorityQueue() {
        String printPriorityQueue = new String();
        PatientCA newPatient;
        for (int iCount = 0; iCount < thePQueue.size(); iCount++) {
            newPatient = thePQueue.get(iCount);
            printPriorityQueue = printPriorityQueue.concat(newPatient.toString()+ "\n");
        }
        return printPriorityQueue;
    }
}
