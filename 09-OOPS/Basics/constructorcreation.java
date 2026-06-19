package basics;


public class constructorcreation {
    public int id ;
    public String name;
    public int age ;
    public String faculty ;
    private int password;

    // default ctor
    
    public constructorcreation(){
        System.out.println("Default ctor is called");
    }

    // parameterised ctor

    public constructorcreation(int id , String name , int age , String faculty , int password){
        System.out.println("Parameterised ctor is called");

    // we created object in main and gave it the attributes value and those are catched by this studnet ctor
    // fucntion now to set value of attributes that are cached we use this. and set individual attributes

        this.id = id ;
        this.name = name;
        this.age = age;
        this.faculty = faculty;
        this.password = password;
    }

    // copy ctor 

    public constructorcreation(constructorcreation src){
        System.out.println("copy ctor is called");
        this.id = src.id;
        this.name = src.name;
        this.age = src.age;
        this.faculty = src.faculty;
        this.password = src.password;
    }

    public void study3hr(){
        System.out.println(" Study 3 hours" );
    }
    public void studymorethan3hr(){
        System.out.println(" Study more than 3 hours" );
    }
}
