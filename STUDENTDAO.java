package net.codejava.ws;
import java.util.ArrayList;
import java.util.List;

public class STUDENTDAO {
    private static STUDENTDAO instance;
    private static List<STUDENT> data = new ArrayList<>();
     
    static {
        data.add(new STUDENT(1, "GAURI","1997/02/1","2020/03/10"));
        data.add(new STUDENT(2, "GITA","1998/01/10","2022/09/10"));   
    }
     
    private STUDENTDAO() {
         
    }
     
    public static STUDENTDAO getInstance() {
        if (instance == null) {
            instance = new STUDENTDAO();
        }
         
        return instance;               
    }
     
    public List<STUDENT> listAll() {
        return new ArrayList<STUDENT>(data);
    }
     
    public int add(STUDENT student) {
        int newId = data.size() + 1;
        student.setid(newId);
        data.add(student);
         
        return newId;
    }
     
    public STUDENT get(int id) {
        STUDENT studentToFind = new STUDENT(id);
        int index = data.indexOf(studentToFind);
        if (index >= 0) {
            return data.get(index);
        }
        return null;
    }
     
    public boolean delete(int id) {
        STUDENT studentToFind = new STUDENT(id);
        int index = data.indexOf(studentToFind);
        if (index >= 0) {
            data.remove(index);
            return true;
        }
         
        return false;
    }
     
    public boolean update(STUDENT student) {
        int index = data.indexOf(student);
        if (index >= 0) {
            data.set(index, student);
            return true;
        }
        return false;
}
}
