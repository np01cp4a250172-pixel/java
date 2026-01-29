package week12;
import java.util.ArrayList;



public class StudentApp
{
    public static void main(String[] args)
    {
        ArrayList<Student> students = new ArrayList<Student>();

        // Initial data
        students.add(new Student("Ayush", "L1N1", "9876543210"));
        students.add(new Student("Rahul", "L1M1", "9876543211"));
        students.add(new Student("Gaurav", "L1N2", "9876543212"));

        System.out.println("Initial List:");
        displayStudents(students);

        // 1. Remove "Gaurav"
        for (int i = 0; i < students.size(); i++)
        {
            if (students.get(i).getName().equals("Gaurav"))
            {
                students.remove(i);
                break;
            }
        }

        System.out.println("\nAfter removing Gaurav:");
        displayStudents(students);

        // 2. Add "Aavaya" before Ayush
        students.add(0, new Student("Aavaya", "L1C1", "9876543213"));

        System.out.println("\nAfter adding Aavaya before Ayush:");
        displayStudents(students);

        // 3. Change Rahul's group from L1M1 to L1N2
        for (Student s : students)
        {
            if (s.getName().equals("Rahul"))
            {
                s.setGroup("L1N2");
            }
        }

        System.out.println("\nAfter changing Rahul's group:");
        displayStudents(students);

        // 4. Change name Ayush to Aayush
        for (Student s : students)
        {
            if (s.getName().equals("Ayush"))
            {
                s.setName("Aayush");
            }
        }

        System.out.println("\nAfter changing Ayush to Aayush:");
        displayStudents(students);
    }

    // method to display list using for-each loop
    public static void displayStudents(ArrayList<Student> students)
    {
        for (Student s : students)
        {
            System.out.println(
                s.getName() + " | " +
                s.getGroup() + " | " +
                s.getPhone()
            );
        }
    }
}
