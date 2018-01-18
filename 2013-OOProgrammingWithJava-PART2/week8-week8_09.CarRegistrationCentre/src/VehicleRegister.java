import java.util.HashMap;
import java.util.ArrayList;
public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owners;
    
    public VehicleRegister() {
        this.owners = new HashMap<RegistrationPlate, String>();
    }
    public boolean add(RegistrationPlate plate, String owner) {
        if(this.owners.get(plate) == null) {
            this.owners.put(plate, owner);
            return true;
        } else {
            return false;
        }
    }
    public String get(RegistrationPlate plate) {
        if(this.owners.containsKey(plate)) {
            return owners.get(plate);
        }
           return null; 
        }
    public boolean delete(RegistrationPlate plate) {
        if(this.owners.containsKey(plate)) {
            this.owners.remove(plate);
            return true;
        } else {
            return false;
        }
    }
    public void printRegistrationPlates() {
        for(RegistrationPlate key : this.owners.keySet()) {
            System.out.println(key);
        }
    }
    public void printOwners() {
        ArrayList<String> owner = new ArrayList<String>();
        for(RegistrationPlate key : this.owners.keySet()) {
            String ownerName = this.owners.get(key);
            if(!owner.contains(ownerName)) {
                owner.add(ownerName);
            }
        }
        for(String name : owner) {
            System.out.println(name);
        }
    }
    
}
