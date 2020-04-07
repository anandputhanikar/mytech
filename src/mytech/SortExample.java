package mytech;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class SortExample implements ExecuteMain {
    @Override
    public void execute() {
        System.out.println("Sorted values: ");
        sortSet();
    }

    public void sortSet(){

        List<String> dateList = new ArrayList<>();
        dateList.add("10/10/2019");
        dateList.add("09/09/2019");
        dateList.add("08/13/2019");
        dateList.add("10/22/2019");
        dateList.add("09/02/2019");
        dateList.add("14/08/2019");
        dateList.add("01/01/1900");
        dateList.add("01/04/2019");
        dateList.add("01/05/2019");
        dateList.add("01/03/2019");
        //System.out.println(dateList);

        System.out.println("Min in list :: "+Collections.min(dateList));
        System.out.println("");
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        Set<Long> set = new HashSet<>();
        Map<Object, Object> dateMap = new HashMap<>();
        dateList.stream().forEach(dt-> {
            try {
                long longDt = sdf.parse(dt).getTime();
                set.add(longDt);
                set.add(null);
                set.add(null);
                dateMap.put(longDt,dt);
            }catch (ParseException pe){
                System.out.print("Error parsing date :: "+pe);
                return;
            }
        });
        System.out.println(set);


        long startTime = System.currentTimeMillis();
        set.remove(null);
        long minDt = Collections.min(set);
        System.out.println("Min in Set :: "+minDt+" Earliest Date is :: "+
                dateMap.entrySet().stream().filter(map->(long)map.getKey()==minDt).map(map->map.getValue()).findFirst().get());
        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);  //Total execution time in milli seconds
        System.out.println("Time take in java :: "+duration);

       long startTime1 = System.currentTimeMillis();
       long dt =  set.stream().filter(st->st!=null).sorted().findFirst().get();
        System.out.println("Min in Set :: "+dt+" Earliest Date is :: "+
                dateMap.entrySet().stream().filter(map->(long)map.getKey()==dt).map(map->map.getValue()).findFirst().get());
        long endTime1 = System.currentTimeMillis();
        long duration1 = (endTime1 - startTime1);  //Total execution time in milli seconds
        System.out.println("Time take in java8 :: "+duration1);
    }


}


