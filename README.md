# test.task
Application uses embedded H2 DB
It starts on port 8080
It sends and receives JSON
It creates two departments and two test employees on startup

After packaging run the app from /target using java -jar test.task-0.0.1-SNAPSHOT.jar

API short Description:

Use:
1. *GET*
- **/employees** to show all employees
- **/employees/department/{id}** to show all employees by department
- **/employees/{id}** to show concrete employee
- **/departments** to show all departments
2. *POST*
- **/employees/{id}** to show concrete employee (receives JSON)
3. *PUT*
- **/employees/{id}** to change concrete employee (receives JSON)
- **/employees/{id}/department/{depId}** to change department for employee (depId=-1 to unset)
4. *DELETE*
- **/employees/{id}** to delete concrete employee
