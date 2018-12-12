package com.yamanaka.todo.todoapi.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
public class Tasks {

    /** 自動採番ID */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long task_id;

    /** タスク内容 */
    private String task_content;

    /** 発生時間 */
    private Timestamp created_time;

    /** 完了しているかの判定フラグ */
    private Boolean completed_flag;

    /** TasksとProjectsは多対1の関係 */
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name="project_id",insertable=false, updatable=false)
    private Projects projects;

}
