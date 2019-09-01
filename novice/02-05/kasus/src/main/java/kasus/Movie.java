package kasus;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movie")
public class Movie {

   @Id
   private int movie_id;
   private String title; 
   private int member_id;  

   public Movie() {}
   public Movie(String title) {
      this.title = title;
   }
   
   public int getId() {
      return movie_id;
   }

   public void setId( int movie_id ) {
      this.movie_id = movie_id;
   }
   
   public String getTitle() {
      return title;
   }
   
   public void setTitle( String title ) {
      this.title = title;
   }
   
   public Integer getMemberId() {
      return member_id;
   }
   
   public void setMemberId( Integer member_id ) {
      this.member_id = member_id;
   }
   
   
 }