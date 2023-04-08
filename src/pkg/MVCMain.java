package pkg;

public class MVCMain {  
    public static void main(String[] args) {  
    Employee model = retriveEmployeeFromDatabase();  
    EmployeeView view = new EmployeeView();  
    EmployeeController controller = new EmployeeController(model, view);  
    controller.updateView();  
       controller.setEmployeeName("Hitesh");  
       System.out.println("\nEmployee Details after updating: ");  

       controller.updateView();  
    }  

    private static Employee retriveEmployeeFromDatabase(){  
       Employee Employee = new Employee();  
       Employee.setName("Amit");  
       Employee.setId("11");  
       Employee.setDepartment("UPES");  
       return Employee;  
    }  
 }  