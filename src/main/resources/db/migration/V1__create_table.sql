DROP TABLE IF EXISTS tasks;
DROP TABLE IF EXISTS projects;
DROP TABLE IF EXISTS tabs;
DROP TABLE IF EXISTS users;

CREATE TABLE users (
  user_id   BIGINT AUTO_INCREMENT,
  user_name VARCHAR(255),
  PRIMARY KEY (user_id),
);

CREATE TABLE tabs (
  tab_id      BIGINT PRIMARY KEY AUTO_INCREMENT,
  tab_name    VARCHAR(255),
  user_id  BIGINT,
  PRIMARY KEY (tab_id),
  CONSTRAINT FK__tabs__user_id FOREIGN KEY (user_id) REFERENCES users (user_id)
);

CREATE TABLE projects (
  project_id    BIGINT PRIMARY KEY AUTO_INCREMENT,
  project_name  VARCHAR(255),
  tab_id       BIGINT,
  PRIMARY KEY (project_id),
  CONSTRAINT FK__projects__tab_id FOREIGN KEY (tab_id) REFERENCES tabs (tab_id)
);

CREATE TABLE tasks (
  task_id         BIGINT PRIMARY KEY AUTO_INCREMENT,
  task_content    VARCHAR(255),
  created_time    TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  completed_flag  BOOLEAN DEFAULT FALSE,
  project_id      BIGINT,
  PRIMARY KEY (task_id),
  CONSTRAINT FK__tasks__project_id FOREIGN KEY (project_id) REFERENCES projects (project_id)
);