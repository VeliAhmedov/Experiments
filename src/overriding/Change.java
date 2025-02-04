package overriding;

public class Change extends Marry {
    //Overriding method
    @Override
    public void marryDate(){
        System.out.println("Marry will be on 27 Dec");
    }

}
//changing super class is worst practice in OOP and in java overall, so create and extend new class for change
