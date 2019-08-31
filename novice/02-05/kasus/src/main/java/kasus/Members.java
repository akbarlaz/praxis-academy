package kasus;

public class Members {
    private int member_id;
    private String full_name; 
    private String physical_address;   
    private int salutation_id;  
 
    public Members() {}
    public Members(String full_name, String physical_address, int salutation_id) {
       this.full_name = full_name;
       this.physical_address = physical_address;
       this.salutation_id = salutation_id;
    }
    
    public int getId() {
       return member_id;
    }
    
    public String getFullName() {
       return full_name;
    }
    
    public String getPhysicalAddress() {
       return physical_address;
    }
    
    public int getSalutationId() {
       return salutation_id;
    }
 }