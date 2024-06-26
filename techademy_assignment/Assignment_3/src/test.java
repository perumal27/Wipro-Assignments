import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class test {

    @Test
    void testEmployeeAttributes() {
        Employee employee = new Employee(1, "kumar", 50000.0);

   
        assertEquals(1, employee.getId());
        assertEquals("kumar", employee.getName());

        assertEquals(50000.0, employee.getSalary(), 0.001); 
    }

    @Test
    void testRaiseSalary() {
        Employee employee = new Employee(1, "ramar", 60000.0);
        employee.raiseSalary(5000.0);

        assertEquals(65000.0, employee.getSalary(), 0.001); 
    }

    @Test
    void testEmployeeEquality() {
   
        Employee employee1 = new Employee(1, "kumr", 50000.0);
        Employee employee2 = new Employee(1, "ramar", 50000.0);

        assertEquals(employee1, employee2);
        assertNotSame(employee1, employee2);
    }
}
