
package personnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    private final ArrayList<Person> persons;
    
    public Employees() {
        persons = new ArrayList<Person>();
   
    }
    public void add(Person person) {
        persons.add(person);
    }
    public void add(List<Person> persons) {
        for(Person p : persons) {
            this.persons.add(p);
        }
    }
    public void print() {
        Iterator<Person> iterator = persons.iterator();
        while(iterator.hasNext()) {
            Person nextPerson = iterator.next();
            System.out.println(nextPerson);
        }
    }
    public void print(Education education) {
        Iterator<Person> iterator = persons.iterator();
        
        while(iterator.hasNext()) {
            Person nextPerson = iterator.next();
            if(nextPerson.getEducation() == education) {
                System.out.println(nextPerson);
            }
        }
    }
    public void fire(Education education) {
        Iterator<Person> iterator = persons.iterator();
        
        while(iterator.hasNext()) {
            Person nextPerson = iterator.next();
            if(nextPerson.getEducation() == education) {
                iterator.remove();
            }
        }
    }
}
