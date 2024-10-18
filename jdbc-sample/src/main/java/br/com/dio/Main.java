package br.com.dio;

import br.com.dio.persistence.EmployeeAuditDAO;
import br.com.dio.persistence.EmployeeParamDAO;
import br.com.dio.persistence.entity.EmployeeEntity;
import org.flywaydb.core.Flyway;

import java.math.BigDecimal;
import java.time.OffsetDateTime;


public class Main {

    private final static EmployeeParamDAO employeeDAO = new EmployeeParamDAO();

    private final  static EmployeeAuditDAO employeeAuditDAO = new EmployeeAuditDAO();

    public static void main(String[] args) {

        var flayway = Flyway.configure()
                .dataSource("jdbc:mysql://localhost/jdbc-sample", "root", "mysqldeveloper")
                .load();
        flayway.migrate();

        var insert = new EmployeeEntity();
        insert.setName("Josefh'");
        insert.setSalary(new BigDecimal("4550"));
        insert.setBirthday(OffsetDateTime.now().minusYears(25));
        System.out.println(insert);
        employeeDAO.insertWithProcedure(insert);
        System.out.println(insert);

       // employeeDAO.findAll().forEach(System.out::println);

       // System.out.println(employeeDAO.findById(1));

         var update = new EmployeeEntity();
        update.setId(12);
        update.setName("Nome De Gente");
        update.setSalary(new BigDecimal("8520"));
        update.setBirthday(OffsetDateTime.now().minusYears(35).minusDays(15));
        employeeDAO.update(update);

       employeeDAO.delete(insert.getId());

        employeeAuditDAO.findAll().forEach(System.out::println);

    }
}























