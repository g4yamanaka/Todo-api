DROP TABLE IF EXISTS tasks;
DROP TABLE IF EXISTS projects;
DROP TABLE IF EXISTS tabs;
DROP TABLE IF EXISTS users;

CREATE TABLE tasks (
  task_id         INTEGER PRIMARY KEY AUTO_INCREMENT,
  task_content    VARCHAR(255),
  created_time    TIMESTAMP,
  completed_flag  BOOLEAN,
  PRIMARY KEY (task_id)
);

CREATE TABLE projects (
  project_id    BIGINT PRIMARY KEY AUTO_INCREMENT,
  project_name  VARCHAR(255),
  task_id       BIGINT,
  PRIMARY KEY (project_id),
  CONSTRAINT FK__projects__task_id FOREIGN KEY (task_id) REFERENCES tasks (task_id)
);

CREATE TABLE tabs (
  tab_id      BIGINT PRIMARY KEY AUTO_INCREMENT,
  tab_name    VARCHAR(255),
  project_id  BIGINT,
  PRIMARY KEY (tab_id),
  CONSTRAINT FK__tabs__project_id FOREIGN KEY (project_id) REFERENCES projects (project_id)
);

CREATE TABLE users (
  user_id   BIGINT AUTO_INCREMENT,
  user_name VARCHAR(255),
  tab_id    BIGINT,
  PRIMARY KEY (user_id),
  CONSTRAINT FK__users__tab_id FOREIGN KEY (tab_id) REFERENCES tabs (tab_id)
);
