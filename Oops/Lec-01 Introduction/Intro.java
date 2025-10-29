public class Intro {
    public static void main(String[] args) {
        // Stores 5 roll nos.
        int[] rollnos = new int[5];

        // store 5 names
        String[] names = new String [5];

        // data of 5 students: {roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];

        // just declaring
        Student divyansh = new Student();

        divyansh.rno = 22;
        divyansh.name = "Divyansh Singh";
        divyansh.marks = 88.5f;

        System.out.println(divyansh.rno);
        System.out.println(divyansh.name);
        System.out.println(divyansh.marks);

        // System.out.println(Arrays.toString(students));
    }
    // Creating a class
    static class Student {
        int rno;
        String name;
        float marks;
    }
}
// Class is name group of property & fn.
// A class is an template of an objects
// An object is an instsance of a class
// Class --> logical Construct
// Object --> physical reality / Occupy space in memory
