import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class App{

    public void run(){
        while(true){
        try{
            writeData(getDataEntry());
        } catch (DataAmountException | DateFormatException | PhoneNumberException | GenderException | DataAlreadyExistsException e){
            System.out.println(e.getMessage());
            continue;
        }
        System.out.println("Данные успешно записаны");
    }
    }

private static String getDataEntry() throws DataAmountException, DateFormatException, PhoneNumberException, GenderException{
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите данные через пробел, в формате: \nФамилия Имя Отчество дата_рождения(dd.MM.yyyy) номер_телефона(10 символов) пол(m,f)");
    String line = sc.nextLine();
    String[] data = line.split(" ");
    int len = data.length;
    if (len != 6){
        throw new DataAmountException(len,6);
    }
    try{
        String dateRaw = data[3];
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy", Locale.ENGLISH);
        LocalDate.parse(dateRaw, formatter);
    } catch(DateTimeParseException e){
        throw new DateFormatException();
    }
    if (data[4].length()!=10){
        throw new PhoneNumberException();
    }
    for (char c : data[4].toCharArray()) {
        try{
            int i = (int)c;
        } catch(NumberFormatException e){
            throw new PhoneNumberException();
        }
    if (!data[5].equals("m") && !data[5].equals("f")){
        throw new GenderException();
    }}
    return line;

}

private static void writeData(String line) throws DataAlreadyExistsException{
    File file = new File(String.format("%s.txt", line.split(" ")[0]));
    if (!file.exists()){
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    try(FileWriter fw = new FileWriter(file,true)){
        List<String> lines = Files.readAllLines(file.toPath(),StandardCharsets.UTF_8);
        if (!lines.contains(line)){
            fw.write(line+"\n");
        } else{
            throw new DataAlreadyExistsException();
        }
    } catch(IOException e){
        e.printStackTrace();
    }
}

}