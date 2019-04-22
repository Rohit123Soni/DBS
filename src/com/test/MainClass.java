/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import com.dao.DBManager;
import com.models.BatchModel;
import com.models.Batch_teacherModel;
import com.models.DepartmentModel;
import com.models.StudentModel;
import com.models.TeacherModel;
import com.models.UserModel;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Mutaher Affan
 */
public class MainClass {
    public static void main(String[] args) {
        MainClass mainClass = new MainClass();
        mainClass.login();
    }
    
    public void All_Management() {
           Scanner input = new Scanner(System.in);
           System.out.println("Enter 1 for Department Management.    :");
           System.out.println("Enter 2 for Teacher Management.       :");
           System.out.println("Enter 3 for Student Management.       :");
           System.out.println("Enter 4 for Batch Management.         :");
           System.out.println("Enter 5 for Batch Teacher Management. :");
           int i = input.nextInt();
           switch(i) {
            case 1: Department_Management();
                break;
            case 2: Teacher_Management();
                break;
            case 3: Student_Management();
                break;
            case 4:Batch_Management();
                break;
            case 5: Batch_teacher_Management();
                break;
            default: System.out.println("Invalid Choice");   
        
            }
    }
        
    
    public void Batch_Management() {
        System.out.println("Enter 1 for Showing  Batches. :");
        System.out.println("Enter 2 for Adding Batch.     :");
        System.out.println("Enter 3 for Deleting Batch.   :");
        System.out.println("Enter 4 for Updating Batch.   :");
        System.out.println("Enter 5 to go back to Main Menu");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        switch(i) {
            case 1: showBatches();
                    break;
            case 2: addBatch();
                    break;
            case 3: deleteBatch();
                    break;
            case 4: updateBatch();
                    break;
            case 5: All_Management();
                    break;
            default: System.out.println("Invalid Choice");
        }
    }
    
    
    public void Department_Management() {
        System.out.println("Enter 1 for Showing Departments. :");
        System.out.println("Enter 2 for Adding Department.   :");
        System.out.println("Enter 3 for Deleting Department. :");
        System.out.println("Enter 4 for Updating Deparment.  :");
        System.out.println("Enter 5 to go back to Main Menu");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        switch(i) {
            case 1: showDepartments();
                    break;
            case 2: addDepartment();
                    break;
            case 3: deleteDeprtment();
                    break;
            case 4: updateDepartment();
                    break;
            case 5: All_Management();
                    break;
            default: System.out.println("Invalid Choice");
        }
    }
    
    public void Student_Management() {
        System.out.println("Enter 1 for Showing Students.  :");
        System.out.println("Enter 2 for Adding Student.    :");
        System.out.println("Enter 3 for Deleting Student.  :");
        System.out.println("Enter 4 for Updating Student.  :");
        System.out.println("Enter 5 to go back to Main Menu");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        switch(i) {
            case 1: showStudents();
                    break;
            case 2: addStudent();
                    break;
            case 3: deleteStudent();
                    break;
            case 4: updateStudent();
                    break;
            case 5: All_Management();
                    break;
            default: System.out.println("Invalid Choice");
        }
    }
    
    public void Batch_teacher_Management() {
        System.out.println("Enter 1 for Showing Batch Teachers.  :");
        System.out.println("Enter 2 for Adding Batch Teachers.   :");
        System.out.println("Enter 3 for Deleting Batch Teachers. :");
        System.out.println("Enter 4 for Updating Batch Teachers. :");
        System.out.println("Enter 5 to go back to Main Menu");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        switch(i) {
            case 1: showBatch_teachers();
                    break;
            case 2: addBatch_teacher();
                    break;
            case 3: deleteBatch_Teacher();
                    break;
            case 4: updateBatch_teacher();
                    break;
            case 5: All_Management();
                    break;
            default: System.out.println("Invalid Choice");
        }
    }
    
    public void Teacher_Management() {
        System.out.println("Enter 1 for Showing Teachers. :");
        System.out.println("Enter 2 for Adding Teachers. :");
        System.out.println("Enter 3 for Deleting Teachers. :");
        System.out.println("Enter 4 for Updating Teachers. :");
        System.out.println("Enter 5 to go back to Main Menu");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        switch(i) {
            case 1: showTeachers();
                break;
            case 2: addTeacher();
                break;
            case 3: deleteTeacher();
                break;
            case 4: updateTeacher();
                break;
            case 5: All_Management();
            default: System.out.println("Invalid Choice");
        }
    }
    
   
   
    private void showDepartments(){
         List<DepartmentModel> departmentModels = DBManager.getAllDepartments();
         System.out.println("DEPARTMENT ID      NAME      CODE");
         for(DepartmentModel departmentModel : departmentModels){
            System.out.println();
            System.out.print(" "+departmentModel.getDepartment_id());
            System.out.print("              "+departmentModel.getName());
            System.out.println("        "+departmentModel.getCode());
         }
    }
    
         //Add Department
    private void addDepartment(){
        Scanner input = new Scanner(System.in);
        DepartmentModel departmentModel = new DepartmentModel();
        System.out.print("Enter Name: ");
        departmentModel.setName(input.next());
        System.out.print("Enter Code: ");
        departmentModel.setCode(input.next());
        int row = DBManager.addDepartment(departmentModel);
    
            if (row > 0){
                System.out.println("Record Added Successfully :)");
            }
            else{
                System.out.println("Record not Added ");
            }
    }
    
    
     //Delete Department
    private void deleteDeprtment(){
        DepartmentModel departmentModel = new DepartmentModel();
        Scanner input = new Scanner(System.in);
        showDepartments();
        System.out.println();
        System.out.println();
        System.out.print("Enter Department Id: ");
        departmentModel.setDepartment_id(input.nextInt());
        int row = DBManager.deleteDepartment(departmentModel);
        
        if (row > 0){
                System.out.println("Record Deleted Successfully :)");
            }
            else{
                System.out.println("Record not Deleted ");
            }
    }
 
     //UPDATE DEPARTMENT
        private void updateDepartment() {
        DepartmentModel departmentModel = new DepartmentModel();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name: ");
        departmentModel.setName(input.next());
        System.out.println("Enter Code: ");
        departmentModel.setCode(input.next());
        int row = DBManager.updateDepartment(departmentModel);
        if (row > 0) {
            System.out.println("Record Updated Successfully :)");
        }
        else {
            System.out.println("Record Not Updated");
        }
    }
    
 
    //BATCH TEACHER
    
    private void showBatch_teachers() {
        List<Batch_teacherModel> batch_teacherModels = DBManager.getAllBatchTeachers();
        System.out.println("BATCH_TEACHER     TEACHER_ID      BATCH_ID");
        for (Batch_teacherModel batch_teacherModel : batch_teacherModels) {
            System.out.println();
            System.out.println("  "+batch_teacherModel.getBatch_teacher_id());
            System.out.println("  "+batch_teacherModel.getTeacher_id());
            System.out.println("  "+batch_teacherModel.getBatch_id());
        }
    }
    
    private void addBatch_teacher() {
        Scanner input = new Scanner(System.in);
        Batch_teacherModel batch_teacherModel = new Batch_teacherModel();
        System.out.println("Enter Teacher Id: ");
        batch_teacherModel.setTeacher_id(input.nextInt());
        System.out.println("Enter Batch Id: ");
        batch_teacherModel.setBatch_id(input.nextInt());
        int row = DBManager.addBatch_Teacher(batch_teacherModel);
        
         if (row > 0){
                System.out.println("Record Added Successfully :)");
            }
         else{
                System.out.println("Record not Added ");
            }
    }
    
    
      private void deleteBatch_Teacher() {
        Batch_teacherModel batch_teacherModel = new Batch_teacherModel();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter BATCH TEACHER ID: ");
        batch_teacherModel.setBatch_teacher_id(input.nextInt());
        int row = DBManager.deleteBatch_Teacher(batch_teacherModel);
        
        if (row > 0){
                System.out.println("Record Added Successfully :)");
            }
        else{
                System.out.println("Record not Added ");
            }
        
    }
      
        private void updateBatch_teacher() {
        Batch_teacherModel batch_teacherModel = new Batch_teacherModel();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Teacher Id: ");
        batch_teacherModel.setTeacher_id(input.nextInt());
        System.out.println("Enter Batch ID: ");
        batch_teacherModel.setBatch_id(input.nextInt());
        int row = DBManager.updateBatch_Teacher(batch_teacherModel);
        
        if (row > 0){
                System.out.println("Record Updated Successfully :)");
            }
        else{
                System.out.println("Record not Added ");
            }
    }
    
    //SHOW BATCH
    
    private void showBatches() {
        List<BatchModel> batchModels = DBManager.getAllBatches();
        System.out.println("BATCH_ID     YEAR      SHIFT      GROUP   DEPARTMENT_ID");
        for(BatchModel batchModel : batchModels) {
            System.out.println();
            System.out.println(" "+batchModel.getBatch_id());
            System.out.println(" "+batchModel.getYear());
            System.out.println(" "+batchModel.getShift());
            System.out.println(" "+batchModel.getGroup());
            System.out.println(" "+batchModel.getDepartment_id());
        }
    }
    
      //ADD BATCH
    
     private void addBatch() {
        Scanner input = new Scanner(System.in);
        BatchModel batchModel = new BatchModel();
        System.out.println("Enter Year: ");
        batchModel.setYear(input.next());
        System.out.println("Enter Shift: ");
        batchModel.setShift(input.next());
        System.out.println("Enter Group: ");
        batchModel.setGroup(input.next());
        System.out.println("Enter Department ID");
        batchModel.setDepartment_id(input.nextInt());
        int row = DBManager.addBatch(batchModel);
        
         if (row > 0){
                System.out.println("Record Added Successfully :)");
            }
         else{
                System.out.println("Record not Added ");
            }
        
    }
    
     private void deleteBatch() {
        BatchModel batchModel = new BatchModel();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Batch Id: ");
        batchModel.setBatch_id(input.nextInt());
        int row = DBManager.deleteBatch(batchModel);
        
        if (row > 0){
                System.out.println("Record Deleted Successfully :)");
            }
        else{
                System.out.println("Record not Deleted ");
            }
    }
     
   private void updateBatch() {
        BatchModel batchModel = new BatchModel();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Year: ");
        batchModel.setYear(input.next());
        System.out.println("Enter Shift: ");
        batchModel.setShift(input.next());
        System.out.println("Enter Group: ");
        batchModel.setGroup(input.next());
        System.out.println("Enter Department ID: ");
        batchModel.setDepartment_id(input.nextInt());
        int row = DBManager.updateBatch(batchModel);
        if (row > 0){
                System.out.println("Record Updated Successfully :)");
            }
        else{
                System.out.println("Record not Added ");
            }
    }
    
    
    
    private void showUsers() {
        List<UserModel> userModels = DBManager.getAllUsers();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("USER_ID      NAME     PASSWORD");
        for(UserModel userModel: userModels){
            System.out.println();
            System.out.print(userModel.getUser_id());
            System.out.print("          "+userModel.getName());
            System.out.print("      "+userModel.getPassword());
            System.out.println();
            System.out.println();
            
        }
    }
    private void showTeachers() {
        List<TeacherModel> teacherModels = DBManager.getAllTeachers();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("TEACHER_ID      NAME    ADDRESS    CONTACT_NO     EMAIL");
        for(TeacherModel teacherModel: teacherModels) {
            System.out.println();
            System.out.print(teacherModel.getTeacher_id());
            System.out.print("            "+teacherModel.getName());
            System.out.print("             "+teacherModel.getAddress());
            System.out.print("              "+teacherModel.getContact_no());
            System.out.print("               "+teacherModel.getEmail());
            System.out.println();
            System.out.println();
            
        }
        
    }
    
         //Add Teacher
    private void addTeacher(){
        TeacherModel teacherModel = new TeacherModel();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        teacherModel.setName(input.next());
        System.out.print("Enter Address: ");
        teacherModel.setAddress(input.next());
        System.out.print("Enter Contact No: ");
        teacherModel.setContact_no(input.next());
        System.out.println("Enter Email: ");
        teacherModel.setEmail(input.next());
        int row = DBManager.addTeacher(teacherModel);
        if (row > 0){
                System.out.println("Record Added Successfully :)");
            }
            else{
                System.out.println("Record not Added ");
            }
    }
    
         //Delete Teacher
    private void deleteTeacher(){
        TeacherModel teacherModel = new TeacherModel();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Teacher Id: ");
        teacherModel.setTeacher_id(input.nextInt());
        int row = DBManager.deleteTeacher(teacherModel);
        if (row > 0){
                System.out.println("Record Added Successfully :)");
            }
            else{
                System.out.println("Record not Added ");
            }
    }
    
   
    
   
    
       //Update Teacher
    private void updateTeacher(){
        TeacherModel teacherModel = new TeacherModel();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Name: ");
        teacherModel.setName(input.next());
        System.out.print("Enter Address: ");
        teacherModel.setAddress(input.next());
        System.out.print("Enter Contact No: ");
        teacherModel.setContact_no(input.next());
        System.out.print("Enter Email: ");
        teacherModel.setEmail(input.next());
        int row = DBManager.updateTeacher(teacherModel);
        if (row > 0){
                System.out.println("Record Updated Successfully :)");
            }
            else{
                System.out.println("Record not Added ");
            }
    }
    
  
    
  
    


    private void showStudents() {
        List<StudentModel> studentModels = DBManager.getAllStudents();
        System.out.println("STUDENT_ID      NAME     ROLL_NO    EMAIL    CONTACT_NO   DEPARTMENT");
        for(StudentModel studentModel : studentModels) {
            System.out.println();
            System.out.println("             "+studentModel.getStudent_id());
            System.out.println("              "+studentModel.getName());
            System.out.println("              "+studentModel.getRoll_no());
            System.out.println("               "+studentModel.getContact_no());
            System.out.println("                 "+studentModel.getEmail());
            System.out.println("                   "+studentModel.getDepartmentModel().getName());
        }
    }
    
        //Add Student
    private void addStudent(){
        DepartmentModel departmentModel = new DepartmentModel();
        StudentModel studentModel = new StudentModel();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Name: ");
        studentModel.setName(input.nextLine());
        System.out.print("Enter Roll No: ");
        studentModel.setRoll_no(input.nextLine());
        System.out.print("Enter Contact No: ");
        studentModel.setContact_no(input.nextLine());
        System.out.print("Enter Email: ");
        studentModel.setEmail(input.nextLine());
        System.out.print("Enter Department Id: ");
        //showDepartment();
        departmentModel = DBManager.getDepartmentById(input.nextInt());
        studentModel.setDepartmentModel(departmentModel);
        DBManager.addStudent(studentModel);
        
        int row = DBManager.addStudent(studentModel);
            if (row > 0){
                System.out.println("Record Added Successfully :)");
            }
            else{
                System.out.println("Record not Added ");
            }
        
    }
    
     
     //Delete Student
    private void deleteStudent(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        int row = DBManager.deleteStudent(DBManager.getStudentByRollNo(input.nextInt()));
        
            if (row > 0){
                System.out.println("Record Deleted Successfully :)");
            }
            else{
                System.out.println("Record not Deleted ");
            }
    }
   
    
      //Update Student
    private void updateStudent(){
        Scanner input = new Scanner(System.in);
        StudentModel studentModel = new StudentModel();
        DepartmentModel departmentModel = new DepartmentModel();
        String name = new String(input.next());
        studentModel.setName(name);
        String roll_no = new String(input.next());
        studentModel.setRoll_no(roll_no);
        String contact_no = new String(input.next());
        studentModel.setContact_no(contact_no);
        String email = new String(input.next());
        studentModel.setEmail(email);
        departmentModel = DBManager.getDepartmentById(input.nextInt());
        studentModel.setDepartmentModel(departmentModel);
        DBManager.updateStudent(studentModel);
        
        System.out.print("Enter Roll No: ");
        int row = DBManager.updateStudent(DBManager.getStudentByRollNo(input.nextInt()));
        
        if (row > 0){
                System.out.println("Record Updated Successfully :)");
            }
            else{
                System.out.println("Record not Updated ");
            }
        
    }
    
    private void login() {
        Scanner input = new Scanner(System.in);
        UserModel userModel =  DBManager.getUsername_and_Password();
        System.out.println("Enter Correct User Name : ");
        String username = input.nextLine();
        System.out.println("Enter Password: ");
        String password = input.nextLine();
        if(userModel.getName().equals(username) && userModel.getPassword().equals(password)) {
           All_Management();
        }
           
        else {
            System.out.println("Username and Password does not match.Please enter again");
            login();
        }
        
    }
}

