//package com.skyllx.firstwebapplication.MarksManagement;
//
//
//import com.skyllx.firstwebapplication.todo.ToDO;
//import com.skyllx.firstwebapplication.todo.ToDoService;
//import jakarta.validation.Valid;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.ui.ModelMap;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.*;
//
//import java.time.LocalDate;
//import java.util.List;
//
//public class manageController {
//    @Autowired
//    private manageService manageService;
//
//    @RequestMapping("/todo-List")
//    public String returntoDos( ModelMap mapper) {
//        List<MarksManagementSystem> managementSystems = manageService.findByUser("megha");
//        mapper.put("managementSystems",managementSystems );
//        return "todo-List";
//
//
//    }
//
//    @RequestMapping(value = "/addtodo", method = RequestMethod.GET)
//    public String returnupdatedtoDos(@SessionAttribute("username") String username,
//                                     ModelMap mapper) {
//
//        ToDO todo = new ToDO(0, username, "desc", LocalDate.now().plusYears(1), false);
//        mapper.put("todo", todo);
//        return "addtodo";
//
//
//    }
//
//
//
//
//}
