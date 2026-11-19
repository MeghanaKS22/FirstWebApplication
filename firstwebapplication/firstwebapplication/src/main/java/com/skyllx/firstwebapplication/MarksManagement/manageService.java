//package com.skyllx.firstwebapplication.MarksManagement;
//
//import com.skyllx.firstwebapplication.todo.ToDO;
//import jakarta.validation.Valid;
//
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.function.Predicate;
//
//
//public class manageService {
//    static private List<MarksManagementSystem> managementSystems = new ArrayList<>();
//    static  private int managecount=0;
//
//    static {
//        managementSystems.add( new MarksManagementSystem("1","meghana",
//              "25","srinivasUniversity","67"));
//        managementSystems.add(new MarksManagementSystem("2","sahana",
//                "45","srinivas","78"));
//        managementSystems.add( new MarksManagementSystem("1","meghana",
//                "25","srinivasUniversity","67"));
//        managementSystems.add(new MarksManagementSystem("2","sahana",
//                "45","srinivas","78"));
//        managementSystems.add( new MarksManagementSystem("1","meghana",
//                "25","srinivasUniversity","67"));
//        managementSystems.add(new MarksManagementSystem("2","sahana",
//                "45","srinivas","78"));
//
//    }
//
//    public List<MarksManagementSystem> findByUserName(String name){
//        return managementSystems;
//    }
//    public void addToDo(String username,String description,LocalDate targetDate,boolean done ){
//        ToDO todo=new ToDO(++managecount,username,description,targetDate.plusYears(1),done);
//        MarksManagementSystem.add(todo);
//    }
//
//    public List<MarksManagementSystem> findByUser(String megha) {
//    }
//
////    public List<MarksManagementSystem> findByUser(String megha) {
////      return "";
////    }
//
//
////    public List<MarksManagementSystem> findByUser(String megha) {
////
////    }
//}
//
