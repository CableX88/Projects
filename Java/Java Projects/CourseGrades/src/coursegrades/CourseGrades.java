/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursegrades;

/**
 *
 * @author DavidX2X
 */
public class CourseGrades {
private String name;
private String grade;

    public CourseGrades(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String ToString()
 {
     return name + " " + grade;
 }
    public boolean Equals(CourseGrades b){
   if(this.name.equals(b.getName())&&(this.grade.equals(b.getGrade())))
           return true;
   
   
      return false;
    
}
}
