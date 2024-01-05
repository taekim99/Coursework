public class TestPerson {
    public static void main(String[] args) {
        Person taeKim = new Person("Tae Kim", "Kelly Community", "(631)310-7472", 23, "taehyuk.kim@stonybrook.edu");
        System.out.println(taeKim);
        System.out.println();

        Student taeKim2 = new Student("Tae Kim", "Kelly Community", "(631)310-7472", 23, "taehyuk.kim@stonybrook.edu", "Sophomore");
        System.out.println(taeKim2);
        System.out.println();

        Employee taeKim3 = new Employee("Tae Kim", "Kelly Community", "(631)310-7472", 23, "taehyuk.kim@stonybrook.edu", 100000, 2026, 5, 1);
        System.out.println(taeKim3);
        System.out.println();

        Faculty taeKim4 = new Faculty("Tae Kim", "Kelly Community", "(631)310-7472", 23, "taehyuk.kim@stonybrook.edu", 100000, 2026, 5, 1,
                "Mondays and Wednesdays 8:30- 10am", 1);
        System.out.println(taeKim4);
        System.out.println(taeKim4.salaryRange());

        Staff taeKim5 = new Staff("Tae Kim", "Kelly Community", "(631)310-7472", 23, "taehyuk.kim@stonybrook.edu", 100000, 2026, 5, 1, "Student Assistant");
        System.out.println(taeKim5);
    }
}