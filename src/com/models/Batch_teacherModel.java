/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.models;

/**
 *
 * @author Mutaher Affan
 */
public class Batch_teacherModel {
    private Integer batch_teacher_id;
    private Integer teacher_id;
    private Integer batch_id;

    public Integer getBatch_teacher_id() {
        return batch_teacher_id;
    }

    public void setBatch_teacher_id(Integer batch_teacher_id) {
        this.batch_teacher_id = batch_teacher_id;
    }

    public Integer getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(Integer teacher_id) {
        this.teacher_id = teacher_id;
    }

    public Integer getBatch_id() {
        return batch_id;
    }

    public void setBatch_id(Integer batch_id) {
        this.batch_id = batch_id;
    }
}
