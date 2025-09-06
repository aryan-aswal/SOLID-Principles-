package Example_2.ProblematicCode;

public class Volunteers extends Employee{
    @Override
    public int getSalary() {
        throw new UnsupportedOperationException("Volunteers don't get salary");
    }
}
