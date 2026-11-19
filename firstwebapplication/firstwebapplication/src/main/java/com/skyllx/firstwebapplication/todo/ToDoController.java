package com.skyllx.firstwebapplication.todo;


import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@Controller
public class ToDoController {
    @Autowired
    private ToDoService toDoService;

    @RequestMapping("/todo-list")
    public String returntoDos(@SessionAttribute("username") String username, ModelMap mapper) {
        List<ToDO> toDos = toDoService.findByUserName(username);
        mapper.put("todos", toDos);
        return "todo-List";


    }

    @RequestMapping(value = "/addtodo", method = RequestMethod.GET)
    public String returnupdatedtoDos(@SessionAttribute("username") String username,
                                     ModelMap mapper) {

        ToDO todo = new ToDO(0, username, "", LocalDate.now().plusYears(1), false);
        mapper.put("todo", todo);
        return "addtodo";


    }

    @RequestMapping(value = "/addtodo", method = RequestMethod.POST)

    public String returnupdatedtoDosAfterAdding(@SessionAttribute("username") String username, @Valid @ModelAttribute("todo") ToDO todo,
                                                BindingResult result) {
        if (result.hasErrors()) {
            return "addtodo";

                  }
//        System.out.println(username);
//        String username=(String) mapper.get("username");
        toDoService.addToDo(username, todo.getDescription(), todo.getTargetDate(), false);
        return "redirect:todo-list";


    }

//    @RequestMapping(value="/add-todo",method=RequestMethod.GET)
//    public String addToDoPage(@SessionAttribute("username") String username)

    @RequestMapping("/delete-todo")
    public String deleteToDo(@RequestParam int id) {
        toDoService.deleteById(id);
        return "redirect:todo-list";
    }

    @RequestMapping(value="/update-todo",method=RequestMethod.GET)
    public String findToDo(@RequestParam int id, ModelMap mapper) {
        ToDO todo = toDoService.findById(id);
        mapper.addAttribute("todo", todo);


        return "addtodo";
    }
    @RequestMapping(value = "/update-todo",method = RequestMethod.POST)

    public String updateToDo(@SessionAttribute("username") String username,@Valid @ModelAttribute("todo")ToDO todo,
                                                BindingResult result){
        if(result.hasErrors()){

            return "addtodo";

        }
        todo.setUsername(username);
        toDoService.update(todo);
        return "redirect:todo-list";

    }



}
// 1.add starter validation dependency to the pom.xml file and import lib code
//2 way binding-form with todocontroller and todocontroller to todos class
//form backing-add the form to todos object by using 2 way bidnidng
//fragments-combination of htmland jsp
