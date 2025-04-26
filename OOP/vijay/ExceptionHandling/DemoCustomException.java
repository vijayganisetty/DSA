package OOP.vijay.ExceptionHandling;

class CustomException extends  Exception {

    public CustomException(String  str) {
     super(str);
    }
}

public  class DemoCustomException{


    public static void main(String[] args) {

        try{
            throw new CustomException("exeption occrued");

        }
        catch ( CustomException me){
            System.out.println("grooot"+me);
        }
    }

}
