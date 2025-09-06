package school;

public class SchoolManager {
    private final StudentEnrollmentManager enrollmentManager = new StudentEnrollmentManager();
    private final ClassScheduler scheduler = new ClassScheduler();
    private final TeacherSalaryManager salaryManager = new TeacherSalaryManager();
    private final InfrastructureManager infrastructureManager = new InfrastructureManager();

    public void enrollStudent(Student student) {
        enrollmentManager.enrollStudent(student);
    }

    public void scheduleClasses() {
        scheduler.scheduleClasses();
    }

    public void manageTeacherSalaries() {
        salaryManager.manageTeacherSalaries();
    }

    public void maintainInfrastructure() {
        infrastructureManager.maintainInfrastructure();
    }
}
