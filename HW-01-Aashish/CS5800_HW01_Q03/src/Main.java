public class Main {
    public static void main(String[] args) {
        // Instructors
        Instructor nima = new Instructor("Nima", "Davarpanah", "3-2636");
        Instructor vickie = new Instructor("Vickie", "Chan", "4-2008"); // New instructor for Advanced Software Engineering

        // Textbooks
        Textbook cleanCode = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");
        Textbook HowNotToDie = new Textbook("How Not to Die", "Michael Greger", "Macmillan"); // Second textbook

        // course with one instructor and one textbook initially
        Course advancedSoftwareEngineering = new Course("Advanced Software Engineering");
        advancedSoftwareEngineering.addInstructor(nima);
        advancedSoftwareEngineering.addTextbook(cleanCode);

        // Print details with one instructor and one textbook
        System.out.println("=== Course (Initial) ===");
        advancedSoftwareEngineering.printCourseDetails();

        // Adding a second instructor and a second textbook to the course
        advancedSoftwareEngineering.addInstructor(vickie);
        advancedSoftwareEngineering.addTextbook(HowNotToDie); // Adding the second textbook

        // Print details for two instructors and two textbooks
        System.out.println("\n=== Course (Updated) ===");
        advancedSoftwareEngineering.printCourseDetails();
    }
}
