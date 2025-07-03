public class myArrays {
    public static void main(String[] args) {
        //int marks[] = {97, 98, 88}; //also declare array like this
        int marks[] = new int[3];
        marks[0] = 97; //physics
        marks[1] = 98; //chemistry
        marks[2] = 88; //maths

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        
        for(int i = 0; i <= 2; i++) {
            System.out.println(marks[i]);
        }
    }
    
}
