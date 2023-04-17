package ProxyExample;

import ProxyExample.InternetAccess;

public class ProxyInternetAccess implements InternetAccess
{
  // to provide the object of the ProxyExample.EmployeeInternetAccess

  private String employeeName;
  private EmployeeInternetAccess employeeInternetAccess;



  @Override
  public void grantInternetAccessToEmployees(){
         if (getRole(employeeName) > 4) {
  employeeInternetAccess = new EmployeeInternetAccess(employeeName);
  employeeInternetAccess.grantInternetAccessToEmployees();
} else {
  System.out.println("No Internet access granted. Your job level is below 5");
}
}

  public int getRole(String empName) {
    //make a DB call to get the employee role and return it.
    return 31;
  }
}
