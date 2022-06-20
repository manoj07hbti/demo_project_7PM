package class_and_object;

public class Book {

    // data member/property

    String name="Java";
    int pages=500;
    String writerName="Games Gosling";

    //TODO  Object : it is a instance of class
    // ToyMaker :  frame(Class) ----mud----->(object)toy1, toy2, toy 3, toy4........toy


    public static void main(String[] args) {
        // TODO SYNTAX :  ClassName objName= new ClassName();

        Book obj1= new Book();

        // TODO : print  objName.propertyName

        System.out.println("Printing obj1 name: "+ obj1.name);

        System.out.println("Printing obj1 page : "+ obj1.pages);

        System.out.println("Printing obj1 Writer: "+ obj1.writerName);

        Book obj2= new Book();

        System.out.println("Printing obj2 name: "+ obj2.name);

        System.out.println("Printing obj2 page : "+ obj2.pages);

        System.out.println("Printing obj2 Writer: "+ obj2.writerName);
    }

}
