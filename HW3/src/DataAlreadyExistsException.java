public class DataAlreadyExistsException extends Exception{
    public DataAlreadyExistsException(){
        super("Такой человек уже существует в базе данных");
    }
}