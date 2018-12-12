package com.yamanaka.todo.todoapi.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@Setter
public class Users {

    /** 自動採択ID */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long user_id;

    /** ユーザネーム */
    private String user_name;

    /** UsersとTabsは1対多の関係 */
    @OneToMany(mappedBy = "users")
    @JsonManagedReference
    private List<Tabs> tabs;

}
