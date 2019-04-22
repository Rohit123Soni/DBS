/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.dao.connection.DBConnection;
import com.models.BatchModel;
import com.models.Batch_teacherModel;
import com.models.DepartmentModel;
import com.models.StudentModel;
import com.models.TeacherModel;
import com.models.UserModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mutaher Affan
 */
public class DBManager {
    private static Connection conn = DBConnection.getConnection();
 
    //     ********------STUDENT---MANAGEMENT---METHODS------********
    
    //  GET ALL STUDENT
    
    public static List<StudentModel> getAllStudents(){
        List<StudentModel> studentModels = new ArrayList<>();
        StudentModel studentModel = null;
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("select * from student where active = 1");
            while(rs.next()){
                studentModel = new StudentModel();
                studentModel.setStudent_id(rs.getInt("student_id"));
                studentModel.setName(rs.getString("name"));
                studentModel.setContact_no(rs.getString("contact_no"));
                studentModel.setDepartmentModel(DBManager.getDepartmentById(rs.getInt("department_id")));
                studentModel.setRoll_no(rs.getString("roll_no"));
                studentModel.setEmail(rs.getString("email"));
                studentModels.add(studentModel);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
       return studentModels;
    }
    
    //ADDING STUDENT
     public static Integer addStudent(StudentModel studentModel){
        
         Integer num = 0;
        
         try {
            Statement statement = conn.createStatement();
            num = statement.executeUpdate("insert into student (name, roll_no, contact_no, email,"
                    + " department_id) values ('"+studentModel.getName()+"','"+studentModel.getRoll_no()+"',"
                    + "'"+studentModel.getContact_no()+"','"+studentModel.getEmail()+"',"
                    + "'"+studentModel.getDepartmentModel().getDepartment_id()+"')");
        
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return num;
    }
    
    //DELETING STUDENT
     public static Integer deleteStudent(StudentModel studentModel){
       
         Integer num = 0;
    
         try {
            Statement statement = conn.createStatement();
            num = statement.executeUpdate("update student set active = 0"
                    + " where student_id = '"+studentModel.getStudent_id()+"'");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return num;
    }
    
    //UPDATING STUDENT
     public static Integer updateStudent(StudentModel studentModel){
      
         Integer num = 0;
         
        try {
            Statement statement = conn.createStatement();
           num = statement.executeUpdate("update student set name = '"+studentModel.getName()+"'"
                   + " roll_no = '"+studentModel.getRoll_no()+"',contact_no = '"
                   + ""+studentModel.getContact_no()+"',email = '"+studentModel.getEmail()+"'"
                   + ",department_id = '"+studentModel.getDepartmentModel()+"'");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return num;
    }
    
    //     ********------TEACHER---MANAGEMENT---METHODS------********
    
    //GET ALL TEACHERS

     public static List<TeacherModel> getAllTeachers() {  
         
        List<TeacherModel> teacherModels = new ArrayList<>();
        TeacherModel teacherModel = null;
        
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM teacher WHERE active = 1");
            while (rs.next()) {
                teacherModel = new TeacherModel();
                teacherModel.setTeacher_id(rs.getInt("teacher_id"));
                teacherModel.setName(rs.getString("name"));
                teacherModel.setAddress(rs.getString("address"));
                teacherModel.setContact_no(rs.getString("contact_no"));
                teacherModel.setEmail(rs.getString("email"));
                teacherModels.add(teacherModel);
            
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return teacherModels;
    }
    
    //ADDING TEAHCER
    
     public static Integer addTeacher(TeacherModel teacherModel){
        Integer rs = 0;
        try {
            Statement statement = conn.createStatement();
            rs = statement.executeUpdate("insert into teacher (name, address, contact_no, email) values"
                    + " ('"+teacherModel.getName()+"','"+teacherModel.getAddress()+"',"
                    + "'"+teacherModel.getContact_no()+"','"+teacherModel.getEmail()+"')");
            
            } catch (SQLException ex) {
                ex.printStackTrace();
        }
        return rs;
    }
    
    //DELETING TEACHER
    
     public static Integer deleteTeacher(TeacherModel teacherModel){
        Integer rs = 0;
        try {
            Statement statement = conn.createStatement();
            rs = statement.executeUpdate("update teacher set active = 0"
                    + " where teacher_id = '"+teacherModel.getTeacher_id()+"' ");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }
    
    //UPDATING TEACHER
    
     public static Integer updateTeacher(TeacherModel teacherModel){
        Integer rs = 0;
        try {
            Statement statement = conn.createStatement();
            rs = statement.executeUpdate("update teacher set name = '"+teacherModel.getName()+"',"
                    + " address = '"+teacherModel.getAddress()+"',contact_no = "
                    + "'"+teacherModel.getContact_no()+"',email = '"+teacherModel.getEmail()+"'");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }
    
    //     ********------DEPARTMENT---MANAGEMENT---METHODS------********
     
    //GET ALL DEPARTMENTS

     public static List<DepartmentModel> getAllDepartments(){ 
         
        List<DepartmentModel> departmentModels = new ArrayList<>();
        DepartmentModel departmentModel = null;
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("select * from department where active = 1");
            while(rs.next()){
                departmentModel = new DepartmentModel();
                departmentModel.setDepartment_id(rs.getInt("department_id"));
                departmentModel.setCode(rs.getString("code"));
                departmentModel.setName(rs.getString("name"));
                departmentModels.add(departmentModel);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    return departmentModels;
}
    
    //ADDING DEPARTMENT
    
     public static Integer addDepartment(DepartmentModel departmentModel){
        Integer rs = 0;
        try {
            Statement statement = conn.createStatement();
            rs = statement.executeUpdate("INSERT INTO department (name,code) values"
               +"('"+departmentModel.getName()+"',"+"'"+departmentModel.getCode()+"')");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }
    
    
    //DELETING DEPARTMENT
    
     public static Integer deleteDepartment(DepartmentModel departmentModel){
        Integer rs = 0;
        try {
            Statement statement = conn.createStatement();
            rs = statement.executeUpdate("update department set active = 0 where"
                    + " department_id = '"+departmentModel.getDepartment_id()+"'");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }
    
    //UPDATING DEPARTMENT
    
     public static Integer updateDepartment(DepartmentModel departmentModel){
        Integer rs = 0;
        try {
            Statement statement = conn.createStatement();
            rs = statement.executeUpdate("update department set name = '"+departmentModel.getName()+"',"
                    + " code = '"+departmentModel.getCode()+"'");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }
    
    //     ********------BATCH---MANAGEMENT---METHODS------********
     
     //GET ALL BATCHES
    
     public static List<BatchModel> getAllBatches() {
         
         List<BatchModel> batchModels = new ArrayList<>();
         BatchModel batchModel = null;
         DepartmentModel departmentModel = new DepartmentModel();
        
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM batch WHERE active = 1");
            while (rs.next()) {
                batchModel = new BatchModel();
                batchModel.setBatch_id(rs.getInt("batch_id"));
                batchModel.setYear(rs.getString("year"));
                batchModel.setShift(rs.getString("shift"));
                batchModel.setGroup(rs.getString("group"));
                batchModel.setDepartment_id(rs.getInt("department_id"));
                batchModels.add(batchModel);
                
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return batchModels;
    }
     
     //GET LOGIN USERNAME AND PASSWORD
     
     public static UserModel getUsername_and_Password() {
    
        UserModel userModel = null;
         
         try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM user");
            while(rs.next()) {
                userModel = new UserModel();
                userModel.setName(rs.getString("name"));
                userModel.setPassword(rs.getString("password"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
         return userModel;
     }
     
     //ADDING BATCH
    
     public static Integer addBatch(BatchModel batchModel) {
        Integer rs = 0;
        
        try {
            Statement statement = conn.createStatement();
            rs = statement.executeUpdate("INSERT INTO batch (year,shift,group,department_id) values"
                    + "('"+batchModel.getYear()+"','"+batchModel.getShift()+"','"+batchModel.getGroup()
                    +"','"+batchModel.getDepartment_id()+"')");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }
     
     //DELETING BATCH
     
     public static Integer deleteBatch(BatchModel batchModel) {
         Integer rs = 0;
         
         try {
            Statement statement = conn.createStatement();
            rs = statement.executeUpdate("UPDATE batch set active = 0 WHERE"
                    + "batch_id = '"+batchModel.getBatch_id()+"'");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
         return rs;
     }
 
     //UPDATING BATCH
      
      public static Integer updateBatch(BatchModel batchModel) {
        Integer rs = 0;
          
          try {
            Statement statement = conn.createStatement();
            rs = statement.executeUpdate("UPDATE batch WHERE"+"batch_id = '"+batchModel.getBatch_id()+"',"+" set year = '"+batchModel.getYear()+"',"
                    +"shift = '"+batchModel.getShift()+"',"+"group = '"+batchModel.getGroup()
                    +"',"+"department_id = '"+batchModel.getDepartment_id()+"'");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
          return rs;
      }
      
       //     ********------BATCH_TEACHER---MANAGEMENT---METHODS------********
     
       //GETTING ALL BATCH TEACHERS
    
    public static List<Batch_teacherModel> getAllBatchTeachers() {
        
        List<Batch_teacherModel> batch_teacherModels = new ArrayList<>();
        Batch_teacherModel batch_teacherModel = null;
        
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM batch_teacher WHERE active = 1");
            while(rs.next()) {
                batch_teacherModel = new Batch_teacherModel();
                batch_teacherModel.setBatch_teacher_id(rs.getInt("batch_teacher_id"));
                batch_teacherModel.setTeacher_id(rs.getInt("teacher_id"));
                batch_teacherModel.setBatch_id(rs.getInt("batch_id"));
                batch_teacherModels.add(batch_teacherModel);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return batch_teacherModels;
    }
    
    //ADDING BATCH_TEACHER
    
    public static Integer addBatch_Teacher(Batch_teacherModel batch_teacherModel) {
         Integer rs = 0;
        
        try {
            Statement statement = conn.createStatement();
            rs = statement.executeUpdate("INSERT INTO batch_teacher (teacher_id,batch_id) values"
            +"('"+batch_teacherModel.getTeacher_id()+"','"+batch_teacherModel.getBatch_id()+"')");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }
    
    //DELETING BATCH TEACHER
    
     public static Integer deleteBatch_Teacher(Batch_teacherModel batch_teacherModel) {
         Integer rs = 0;
         
         try {
            Statement statement = conn.createStatement();
            rs = statement.executeUpdate("UPDATE batch_teacher set active = 0 WHERE"
                    + "batch_teacher_id = '"+batch_teacherModel.getBatch_teacher_id()+"'");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
         return rs;
     }
     
     //UPDATING BATCH TEACHER
     
      public static Integer updateBatch_Teacher(Batch_teacherModel batch_teacherModel) {
        Integer rs = 0;
          
          try {
            Statement statement = conn.createStatement();
            rs = statement.executeUpdate("UPDATE batch_teacher set teacher_id = '"+batch_teacherModel.getBatch_teacher_id()+"',"
                    +"batch_id ='"+batch_teacherModel.getBatch_id()+"'");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
          return rs;
      }
      
    //     ********------USER---MANAGEMENT---METHODS------********
         
    //GET ALL USERS
    
    public static List<UserModel> getAllUsers() {
        
        List<UserModel> userModels = new ArrayList<>();
        UserModel userModel = null;
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM user");
            while (rs.next()) {
                userModel = new UserModel();
                userModel.setName(rs.getString("name"));
                userModel.setUser_id(rs.getInt("user_id"));
                userModel.setPassword(rs.getString("password"));
                userModels.add(userModel);      
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return userModels;
    }
    
  
    //GET DEPARTMENT BY ID
    
    public static DepartmentModel getDepartmentById(Integer departmentId) {
        
        DepartmentModel departmentModel = null;
        
        try { 
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM department WHERE " + 
                    "department_id = "+ "'"+departmentId+"'and active = 1");
            while (rs.next()) {
                departmentModel = new DepartmentModel();
                departmentModel.setDepartment_id(rs.getInt("department_id"));
                departmentModel.setName(rs.getString("name"));
                departmentModel.setCode(rs.getString("code"));
                
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return departmentModel;
    }
    
      //Get Student Id By Roll No
    public static StudentModel getStudentByRollNo(Integer integer){
        StudentModel studentModel = new StudentModel();
        try {
                Statement statement = conn.createStatement();
                ResultSet rs =  statement.executeQuery("select student_id from student where"
                  + " roll_no = '"+integer+"'");
                studentModel.setStudent_id(rs.getInt("student_id"));
            } catch (SQLException ex) {
                ex.printStackTrace();
                }
        return studentModel;
    }
    
   
    
  
    
  
    
 
    
   
    
    
    
    
    
    
  
    
    
 
  
    
    
  
    
    
}