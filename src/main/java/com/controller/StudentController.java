package com.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.model.Student;
import com.service.StudentService;


//creating RestController
@RestController
public class StudentController {
//autowired the StudentService class
	@Autowired
	StudentService studentService;

//creating a get mapping that retrieves all the students detail from the database 
	@GetMapping("/student")
	public List<Student> getAllStudent() {

		return studentService.getAllStudent();
	}

//find studentsbyID
	@GetMapping("/student")
	public Map<String, Object> findFullName(@PathVariable("id") int id){
		Map<String, Object> obj=new HashMap<String, Object>();
		
		Student stu=new Student();
		
		stu=studentService.getStudentById(id);
		
		String fullName=stu.getFirstName()+" "+stu.getLastName();
		
		obj.put("Student ", stu);
		obj.put("FullName ", fullName);
		return obj;
			
		}
		
	// find name and jobType
	
	@GetMapping("/student/id")
	public Map<String, Object> findJobType(@PathVariable("id") int id) {
		Map<String, Object> obj=new HashMap<String, Object>();
		
		
		return null;
		
	}

	@GetMapping("/students")
	public HashMap<String , Object> findAdultOrYoung(){
		
		HashMap<String , Object> obj=new HashMap<String , Object>();
		
		List<Student> std=new ArrayList<Student>();
		
		std=studentService.getAllStudent();
		
		List<Student> adult=new ArrayList<Student>();
		List<Student> young=new ArrayList<Student>();
		
		for(Student s : std) {
			if(s.getAge() > 30) {
				adult.add(s);}
			else if(s.getAge() < 30) {
				young.add(s);
			}
			obj.put("adult student: ", adult);
			obj.put("Young student: ", young);
		
	}
		return obj;
		}

//creating a delete mapping that deletes a specific student
	@DeleteMapping("/student/{id}")
	public void deleteStudent(@PathVariable("id") int id) {
		studentService.delete(id);
	}

//creating post mapping that post the student detail in the database
	@PostMapping("/student")
	public int saveStudent(@RequestBody Student student) {
		studentService.saveOrUpdate(student);
		return student.getId();
	}

}