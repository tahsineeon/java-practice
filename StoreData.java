public class StoreData{
    public static void main(String[] args){
      //variable declaration
       String name = "Tahsin";
       int age = 20;
       double height = 5.8;

       //variable declaration with reference data types
       String neighbour = "Nobin"; 
       String friend = neighbour; 

       //variable declaration with data types(primitive data types)
       byte ageofnobin = 25; // byte data type
       int phone = 1234567890; // int data type
       long phone2 = 123456789012345L; // long data type
       float pi = 3.14F; // float data type
       char letter = '@'; // char data type
       boolean isAdult = true; // boolean data type true/false

         //non-primitive data types
         String name2 = "Tahsin"; // String data type


         //printing the variables
         System.out.println("name:" + name);
         System.out.println("age:" + age);
         System.out.println("height:" + height);

          System.out.println("neighbour:" + neighbour);
          System.out.println("friend:" + friend);

          System.out.println("ageofnobin: " + ageofnobin);
          System.out.println("phone: " + phone);
          System.out.println("phone2: " + phone2);
          System.out.println("pi: " + pi);
          System.out.println("letter: " + letter);
          System.out.println("isAdult: " + isAdult);
          System.out.println("name2: " + name2);
          System.out.println("Length of name2: " + name2.length());
    }   
}
