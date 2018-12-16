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
import java.util.List;

@Entity
@Setter
@Getter
public class Projects {

    /** 自動採番ID */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long project_id;

    /** プロジェクトの名前 */
    private String project_name;

    /** ProjectsとTasksは1対多の関係 */
    @OneToMany(mappedBy = "projects")
    @JsonManagedReference
    private List<Tasks> tasks;

    /** ProjectsとTabsは多対1の関係 */
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name="tab_id",insertable=false, updatable=false)
    private Tabs tabs;
}
