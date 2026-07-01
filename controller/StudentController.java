/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import view.Dashboard;
import java.sql.SQLException;
import java.util.List;
import model.Student;
import dao.StudentDAO;
/**
 *
 * @author carmeylia
 */
public class StudentController {
    
   
    private StudentDAO studentDAO = new StudentDAO();

    public List<Student> getStudent() throws SQLException {
        return studentDAO.getStudent(); 
    }
    public int create(Student student) throws SQLException {
        return studentDAO.create(student);
    } 
    public int update(Student student, String nim) throws SQLException {
        return studentDAO.update(student, nim);
    }
    public int delete(String nim) throws SQLException {
        return studentDAO.delete(nim); 
    }
    public static void main (String[] args){
        
        new Dashboard().setVisible(true);
    }
}