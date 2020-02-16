/* Christina Parkhurst - CS 202 - Employee - 1/22/20 */
package Week3;

public class Employee1Main {
    public static void main(String[] args) {
        //Polymorphism and Arrays
        Employee1[] e = {new Lawyer(5), new Secretary(10), new Marketer(1),
                new LegalSecretary(3), new FamilyLawyer(3)};
        for (int i = 0; i < e.length; i++) {
            System.out.println("index: " + i);
            System.out.println("Salary: " + e[i].getSalary());
            System.out.println("Vacation days: " + e[i].getVacationDays());
            System.out.println();
        }


//        // employee object
//        Employee1 emp1 = new Employee1(0);
//        emp1.printInfo();
//        System.out.println();
//
//        // secretary object
//        Secretary sec1 = new Secretary(5);
//        sec1.printInfo();
//        System.out.println();
//
//        //lawyer object
//        Lawyer law1 = new Lawyer(5);
//        law1.printInfo();
//        System.out.println();
//
//        //family lawyer object
//        FamilyLawyer fam1 = new FamilyLawyer(10);
//        fam1.printInfo();
//        System.out.println();
//
//        //legal secretary object
//        LegalSecretary leg1 = new LegalSecretary(2);
//        leg1.printInfo();
//        System.out.println();
//
//        // marketer object
//        Marketer mark = new Marketer(1);
//        mark.printInfo();
    }
}
