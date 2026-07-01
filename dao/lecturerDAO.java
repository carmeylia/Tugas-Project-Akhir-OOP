package dao;

import java.util.ArrayList;
import model.lecture;

public class lecturerDAO {
    
    private final ArrayList<lecture> listLecturer;

    public lecturerDAO() {
        this.listLecturer = new ArrayList<>();
    }

    
    public void addLecturer(lecture dosen) {
        listLecturer.add(dosen);
    }

    public ArrayList<lecture> getAllLecturers() {
        return listLecturer;
    }
}