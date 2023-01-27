import java.util.Properties;
class Test {

    public static void printSystemProperties(){
        System.out.println("printing system properties using java");
        Properties props = System.getProperties();
        System.out.println( props);
    }
    public static void main(String[] args){
        System.out.println( "java program started");
        printSystemProperties();
    }    
}