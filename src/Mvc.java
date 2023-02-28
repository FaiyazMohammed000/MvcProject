public class Mvc {
        public static void main(String[] args) {

            Employee model = retriveEmployeefromDatabase();
            EmployeeView view = new EmployeeView();
            EmployeeController controller = new EmployeeController(model, view);
            controller.updateView();
            controller.setEmployeeName("mohammed");
            System.out.println("after updating:");
            controller.updateView();


        }
            private static Employee retriveEmployeefromDatabase(){
                Employee emp=new Employee();
                emp.setName("faiyaz");
                emp.setId("15454");
                emp.setDepartment("development");
                return emp;
            }

    }
