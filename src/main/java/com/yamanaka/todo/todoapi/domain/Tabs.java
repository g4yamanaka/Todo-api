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
@Getter
@Setter
public class Tabs {

    /** 採番ID */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long tab_id;

    /** タブの名前 */
    private String tab_name;

    /** TabsとUsersは多対1の関係 */
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name="user_id",insertable=false, updatable=false)
    private Users users;

    /** TabsとProjectsは1対多の関係 */
    @OneToMany(mappedBy = "tabs")
    @JsonManagedReference
    private List<Projects> projects;
}
