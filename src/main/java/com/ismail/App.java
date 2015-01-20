package com.ismail;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        App app = new App();
        app.printString("hello");
    }
    /*
     * @param line String that needs to be printed
     * @return Returns 1 on successfull print. Returns -1 on failure.
     */
    public int printString(String line){

        try{
            System.out.println(line);
            return 1;
        }catch(Exception e){
            return -1;
        }

    }
}
