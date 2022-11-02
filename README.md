# springboot-restApi
# java bean
  *create  package name ex<model/bean/dto>
  * within the package create class ex<Student/user/client>
  * create variable ex <private int id;/private String fName;>
  * create constructor
  * create getter and setter

# Controller
  * create java class/controller ex<StudentController.java/TestController.java>
  * use @RestController annotation
  * create method correspond to desire task ex<GET/POST/PUT/DELETE>
  * use annotation ex <@GETMAPPING/@POSTMAPPING/@DELETEMAPPING>
  * return a class/object

# Lists
*create public method ex List<Student>{return object}
* List<object> anyname = new ArrayList<>();
* anyname.add(new object(parameters ex id,fname));  


# Ports
*application.properties  add <server.port=0000> desired port number 8080/8082/3000

# PathVariable
*create public Model nameOfMethod( variable to be passed ex<int id>){return object}
*GetMapping annotation and uri ('url/{variable to be passed<id>}')
*<{baseurl}>/{id}
*add @PathVariable annotation inside method ex method(@PathVariable int studentId){return object}