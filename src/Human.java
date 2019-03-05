import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*
Добрая Зинаида и летние каникулы
*/

public class Human {

    public static void main(String[] args) throws ParseException {
        HashMap <String, Date> m = Human.createMap();
        Human.removeAllSummerPeople(m);
    }

    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("j1", df.parse("JUNE 1 1980"));
        map.put("j2", df.parse("JUNE 1 1980"));
        map.put("aS", df.parse("AUGUST 1 1980"));
        map.put("Sftallofne", df.parse("FEBRUARY 1 1980"));
        map.put("Stallghone", df.parse("FEBRUARY 1 1980"));
        map.put("Shtallone", df.parse("FEBRUARY 1 1980"));
        map.put("Stalghlone", df.parse("FEBRUARY 1 1980"));
        map.put("Stalone", df.parse("FEBRUARY 1 1980"));
        map.put("Stalobbne", df.parse("FEBRUARY 1 1980"));
        map.put("Stalloe", df.parse("FEBRUARY 1 1980"));

        return map;

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {

        Set<String> set = new HashSet<>();

        for (Map.Entry<String, Date>  element : map.entrySet()) {
            Date date = element.getValue();
            if (date.getMonth()==6 || date.getMonth()==7 ||date.getMonth()==8) {
                set.add(element.getKey());
            }
        }

        for (String string : set){
            map.remove(string);
        }

        for (Map.Entry<String, Date>  element : map.entrySet()) {
            System.out.println(element.getKey());
        }

    }
}