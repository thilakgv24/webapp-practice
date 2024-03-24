package in.thilak.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	

	private static List<ToDo> todos = new ArrayList<>();	
	
	static {
		todos.add(new ToDo(1, "sachin", "Learn AWS", LocalDate.now().plusYears(1), false));
		todos.add(new ToDo(2, "sachin", "Learn JAVA", LocalDate.now().plusYears(2), false));
		todos.add(new ToDo(3, "sachin", "K Learn Docker", LocalDate.now().plusYears(3), false));
	}
	
	public List<ToDo> findByUserName(String userName) {
		return this.todos;
	}

}
