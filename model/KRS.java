/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.Course;

/**
 *
 * @author carmeylia
 */
public class KRS {
  
  private Course course;
  private double score;
  private String grade;
  private lecture lecturel;
  private int Semester;
  
  public KRS (Course course,double score){
      this.course = course;
      this.score = score;
      this.grade = setGrade();
     
      }
  public void setLecture(lecture lecturel){
      this.lecturel = lecturel;
  }
  public void setSemester (int semester){
      this.Semester = semester;
  }
  public lecture getLecture(){
      return lecturel;
  }
  
  
  public Course getCourse() {
      return course;
  }
  public double getScore() {
      return score;
  }
  public String getGrade(){
      return grade;
  }
  public String setGrade (){
      
      if (score >= 85)
          return "A";
      else if (score >= 75)
          return "B";
      else if (score >= 60)
          return "C";
      else
          return "D";
          
  }

}

