package br.com.dio;

import br.com.dio.persistence.ContactDAO;
import br.com.dio.persistence.EmployeeAuditDAO;
import br.com.dio.persistence.EmployeeParamDAO;
import br.com.dio.persistence.ModuleDAO;
import br.com.dio.persistence.entity.ContactEntity;
import br.com.dio.persistence.entity.EmployeeEntity;
import br.com.dio.persistence.entity.ModuleEntity;
import net.datafaker.Faker;
import org.flywaydb.core.Flyway;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Locale;
import java.util.stream.Stream;

import static java.time.ZoneOffset.UTC;


public class Main {

    private final static EmployeeParamDAO employeeDAO = new EmployeeParamDAO();

    private final  static EmployeeAuditDAO employeeAuditDAO = new EmployeeAuditDAO();

    private final static ContactDAO contactDAO = new ContactDAO();

    private final static ModuleDAO moduleDAO = new ModuleDAO();

    private final static Faker faker = new Faker(Locale.of("pt", "BR"));

    public static void main(String[] args) {

        var flayway = Flyway.configure()
                .dataSource("jdbc:mysql://localhost/jdbc-sample", "root", "mysqldeveloper")
                .load();
        flayway.migrate();

//        var insert = new EmployeeEntity();
//        insert.setName("Josefh'");
//        insert.setSalary(new BigDecimal("4550"));
//        insert.setBirthday(OffsetDateTime.now().minusYears(25));
//        System.out.println(insert);
//        employeeDAO.insertWithProcedure(insert);
//        System.out.println(insert);

       // employeeDAO.findAll().forEach(System.out::println);

       // System.out.println(employeeDAO.findById(1));

//         var update = new EmployeeEntity();
//        update.setId(12);
//        update.setName("Nome De Gente");
//        update.setSalary(new BigDecimal("8520"));
//        update.setBirthday(OffsetDateTime.now().minusYears(35).minusDays(15));
//        employeeDAO.update(update);
//
//       employeeDAO.delete(insert.getId());
//
//        employeeAuditDAO.findAll().forEach(System.out::println);

//        var entities = Stream.generate(() -> {
//            var employee = new EmployeeEntity();
//            employee.setName(faker.name().fullName());
//            employee.setSalary(new BigDecimal(faker.number().digits(4)));
//            employee.setBirthday(OffsetDateTime.of(LocalDate.now().minusYears(faker
//                    .number().numberBetween(40, 20)), LocalTime.MIN, UTC));
//            return employee;
//        }).limit(4000).toList();
//        employeeDAO.insert(entities);

//        var employee = new EmployeeEntity();
//        employee.setName("John'");
//        employee.setSalary(new BigDecimal("1850"));
//        employee.setBirthday(OffsetDateTime.now().minusYears(23));
//        System.out.println(employee);
//        employeeDAO.insert(employee);
//        System.out.println(employee);

//        var contact2 = new ContactEntity();
//        contact2.setDescription("miguel@gmail.com");
//        contact2.setType("email");
//        contact2.setEmployee(employee);
//        contactDAO.insert(contact2);

        //System.out.println(employeeDAO.findById(40002));
//
//        var employee = new EmployeeEntity();
//        employee.setName("John'");
//        employee.setSalary(new BigDecimal("1850"));
//        employee.setBirthday(OffsetDateTime.now().minusYears(23));
//        System.out.println(employee);
//        employeeDAO.insert(employee);
//        System.out.println(employee);
//
//        var contact1 = new ContactEntity();
//        contact1.setDescription("miguel@gmail.com");
//        contact1.setType("email");
//        contact1.setEmployee(employee);
//        contactDAO.insert(contact1);
//
//        var contact2 = new ContactEntity();
//        contact2.setDescription("65993352551");
//        contact2.setType("celular");
//        contact2.setEmployee(employee);
//        contactDAO.insert(contact2);

//        System.out.println(employeeDAO.findById(40010));
//        employeeDAO.findAll().forEach(System.out::println);

//        var entities = Stream.generate(() -> {
//            var employee = new EmployeeEntity();
//            employee.setName(faker.name().fullName());
//            employee.setSalary(new BigDecimal(faker.number().digits(4)));
//            employee.setBirthday(OffsetDateTime.of(LocalDate.now().minusYears(faker
//                    .number().numberBetween(40, 20)), LocalTime.MIN, UTC));
//            employee.setModules(new ArrayList<>());
//            var moduleAmount = faker.number().numberBetween(1, 4);
//            for (int i = 0; i < moduleAmount; i++) {
//                var module = new ModuleEntity();
//                module.setId(i+1);
//                employee.getModules().add(module);
//            }
//            return employee;
//        }).limit(3).toList();
//        entities.forEach(employeeDAO::insert);

//        moduleDAO.findAll().forEach(System.out::println);

    }
}























