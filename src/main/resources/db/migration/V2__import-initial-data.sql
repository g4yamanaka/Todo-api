-- Users data
INSERT INTO users (user_id, user_name) VALUES (1, 'g4yamanaka');
INSERT INTO users (user_id, user_name) VALUES (2, 'hogehoge');

-- Tabs data
INSERT INTO tabs (tab_id, tab_name, user_id) VALUES (101, 'GTD', 1);
INSERT INTO tabs (tab_id, tab_name, user_id) VALUES (102, 'TODO', 1);
INSERT INTO tabs (tab_id, tab_name, user_id) VALUES (103, 'SHOP', 2);

-- projects data
INSERT INTO projects (project_id, project_name, tab_id) VALUES (201, 'inbox', 101);
INSERT INTO projects (project_id, project_name, tab_id) VALUES (202, '後でやる', 101);
INSERT INTO projects (project_id, project_name, tab_id) VALUES (203, 'callender', 102);
INSERT INTO projects (project_id, project_name, tab_id) VALUES (204, 'callender', 103);


-- tasks data
INSERT INTO tasks (task_id, task_content, completed_flag, project_id) VALUES (301, '牛乳を買う', TRUE, 201);
INSERT INTO tasks (task_id, task_content, completed_flag, project_id) VALUES (302, '本を買う', FALSE, 201);
INSERT INTO tasks (task_id, task_content, completed_flag, project_id) VALUES (303, 'ボーリングをする', FALSE, 202);
INSERT INTO tasks (task_id, task_content, completed_flag, project_id) VALUES (304, 'DBの勉強をする', FALSE, 203);
INSERT INTO tasks (task_id, task_content, completed_flag, project_id) VALUES (305, 'Vueの勉強をする', FALSE, 203);
INSERT INTO tasks (task_id, task_content, completed_flag, project_id) VALUES (306, 'spring bootの勉強をする', FALSE, 203);