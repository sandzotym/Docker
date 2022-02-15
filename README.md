# Docker

![image](https://user-images.githubusercontent.com/93154062/153587645-4a2280de-e21c-4f41-87b4-91e38529c712.png)

**Problem Statements** -
- Apps working in one machine but not on another.
- Dependency ver. mismatches like Spring versions.
- Corrupted Libraries like Jar Corrupted, usually the Tomcat Jar
- Software Upgrade like JDK8.

**Approach** - All these Problems can be bundled in a Container.

**Solution/Docker** - A tool to make it easier to build, deploy & run Apps using Containers.

**Docker Engine** - holds all Containers.

**Architecture** 
![image](https://user-images.githubusercontent.com/93154062/153527210-7e4ecd56-a619-41c3-8fdc-f4e860c62adb.png)

**Workflow**
<img width="1375" alt="Screenshot 2022-02-11 at 7 31 34 AM" src="https://user-images.githubusercontent.com/93154062/153527312-cdb45582-725a-488e-88e3-dcc52b5c3467.png">

**DockerHub** - Repo

**GIT/JENKINS Integration & Dockerization** - Check Master Branch

<img width="1033" alt="Screenshot 2022-02-14 at 11 06 44 PM" src="https://user-images.githubusercontent.com/93154062/153917046-86e1b8a7-a2ea-44fc-97a5-c680ebb6a891.png">

* With Springboot 2.3.0 M1 version & above, it enables to create Docker Image from App itself using Cloud Native buildpacks. No Dockerfile is needed. Check terminal Commands for Execution.

**Dockerization using Google JIB Library as a Container Tool** 

Advantages -
- No Docker Installation
- No Docker File
- No Manual Bild & Push

Check POM Plugins & Terminal Commands for Execution

Maven - Settings.xml 

<img width="345" alt="Screenshot 2022-02-15 at 12 22 36 PM" src="https://user-images.githubusercontent.com/93154062/154008262-b003b950-e741-4d56-8947-af7d5e01c78a.png">

**Dockerization Springboot & MongoDB** - Check Springboot-MongoDB-Dockerize Branch

<img width="636" alt="Screenshot 2022-02-15 at 4 10 49 PM" src="https://user-images.githubusercontent.com/93154062/154045570-3d31a14b-b91a-4fa5-bf30-f3b44f10a518.png">

There are two ways to link the Containers among themselves -
- D-Link which uses CLI
- Docker-Compose that uses Config File
