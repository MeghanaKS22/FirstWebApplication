package com.skyllx.firstwebapplication.todo;

import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class ToDoService {
    static private List<ToDO> todos = new ArrayList<>();
    static  private int todocount=0;

    static {
       todos.add( new ToDO(++todocount,"meghna","meet parents",
                LocalDate.now().plusYears(1),false));
        todos.add(new ToDO(++todocount,"meghna","meet meghana",
                LocalDate.now().plusYears(1),false));
       todos.add( new ToDO(++todocount,"meghna","meet shankar",
                LocalDate.now().plusYears(1),false));
       todos.add(new ToDO(++todocount,"meghna","meet shankar",
                LocalDate.now().plusYears(1),false));
        todos.add(new ToDO(++todocount,"meghna","meet meghana",
                LocalDate.now().plusYears(1),false));
    }

    public List<ToDO> findByUserName(String name){
        return todos;
    }
    public void addToDo(String username,String description,LocalDate targetDate,boolean done ){
        ToDO todo=new ToDO(++todocount,username,description,targetDate.plusYears(1),done);
        todos.add(todo);
    }


    public void deleteById(int id) {
       Predicate<ToDO> predicate=todos -> todos.getId()==id;
        todos.removeIf(predicate);
    }

    public ToDO findById(int id) {
        Predicate<ToDO> predicate=todos -> todos.getId()==id;
        ToDO todo=todos.stream().filter(predicate).findFirst().get();
        return todo;

    }

    public void update(@Valid ToDO todo) {
        deleteById(todo.getId());
        todos.add(todo);

    }
}
