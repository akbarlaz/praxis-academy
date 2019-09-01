package kasus;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "member")
public class Member {

   @Id
   private int member_id;
   private String fullName; 
   private String address;   
   @ManyToOne(targetEntity=kasus.Salutation.class,cascade=CascadeType.ALL)
   @JoinColumn(name="salutationId",referencedColumnName="salutationId")
   private Salutation salutation;  

   public Member() {}
   public Member(String fullName, String address) {
      this.fullName = fullName;
      this.address = address;
   }
   
   public int getId() {
      return member_id;
   }
   
   public void setId( int member_id ) {
      this.member_id = member_id;
   }
   
   public String getFullName() {
      return fullName;
   }
   
   public void setFullName( String fullName ) {
      this.fullName = fullName;
   }
   
   public String getAddress() {
      return address;
   }
   
   public void setAddress( String address ) {
      this.address = address;
   }
   
   public Salutation getSalutation() {
      return salutation;
   }
   
   public void setSalutation( Salutation salutation ) {
      this.salutation = salutation;
   }

 }