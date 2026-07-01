package controller;

import dao.CourseDAO;
import java.util.List;
import model.Course;

/**
 *
 * @author carmeylia
 */
public class Coursecontroller {
    
    private CourseDAO courseDAO = new CourseDAO();
    
    public List<Course> getAll() {
        return courseDAO.getAll();
    }

    public void simpanMataKuliah(String kode, String namaMatkul, int sks, int semester) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}