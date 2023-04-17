package ProxyExample;

import ProxyExample.InternetAccess;

public class EmployeeInternetAccess implements InternetAccess
{
  //to grant the authorization to the particular employee

  private String employeeName;

  @Override
  public void grantInternetAccessToEmployees()
  {
    System.out.println("Internet Access granted for employee: " + employeeName);
  }

  public EmployeeInternetAccess(String empName) {
    this.employeeName = empName;
  }

  public String getEmployeeName() {
    return employeeName;
  }

  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }
}
