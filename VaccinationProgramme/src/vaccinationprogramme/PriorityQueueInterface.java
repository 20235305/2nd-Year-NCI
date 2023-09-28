package vaccinationprogramme;

/**
 *
 * @author Paolo Junior Costarelli - 20235305 - HCCOMP2
 */
public interface PriorityQueueInterface {
    
    public String enqueue(PatientCA patient);

    public int size();

    public boolean isEmpty();

    public Object dequeue();
    
    public String next();

    public String printPriorityQueue();
}
