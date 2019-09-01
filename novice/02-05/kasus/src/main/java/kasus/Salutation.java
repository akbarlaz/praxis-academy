package kasus;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "salutation")
public class Salutation {
   
   @Id
   private int salutationId;
   private String salutation;   
   @OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="comp_id")
	private Set<Member> members;    

   
   public Salutation() {}
   public Salutation(String salutation) {
      this.salutation = salutation;
   }
   
   public int getId() {
      return salutationId;
   }
   
   public void setId( int salutationId ) {
      this.salutationId = salutationId;
   }
   
   public String getSalutation() {
      return salutation;
   }
   
   public void setSalutation( String salutation ) {
      this.salutation = salutation;
   }
   

 }