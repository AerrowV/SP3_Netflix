public class TextUI {

        //metode til at kalde en besked
    public String DisplayMsg(String msg){
        return msg;
    }

    public String prompt(String msg){

        displayMsg(msg);
        String input = scan.nextLine();
        return input;
    }

    public void displayMsg(String msg){
        System.out.println("\n***************");
        System.out.println(msg);
        System.out.println("***************\n");
    }

    

}
