package com.xworkz.collectionSecond.external;

import com.xworkz.collectionSecond.dto.PlaceDto;

import java.util.ArrayList;
import java.util.List;

public class PlaceRunner {
    public static void main(String[] args) {
        List<PlaceDto> list=new ArrayList<>();

        list.add(new PlaceDto("PRASAD", 'T', 5999, 2356,true,   "MALPE",      9.9f, 567897635l, 6.987));
        list.add(new PlaceDto("PRASAD", 'T', 5999, 2356, true,  "MALPE",      9.9f, 567897635L, 6.987));
        list.add(new PlaceDto("RAMESH", 'R', 6000, 2357, false, "UDUPI",      8.7f, 567897636L, 7.123));
        list.add(new PlaceDto("MAHESH", 'M', 6001, 2358, true,  "KUNDAPURA",  9.1f, 567897637L, 5.985));
        list.add(new PlaceDto("KIRAN",  'K', 6002, 2359, false, "GOKARNA",    8.4f, 567897638L, 6.552));
        list.add(new PlaceDto("VIJAY",  'V', 6003, 2360, true,  "MURUDESHWAR",9.3f, 567897639L, 7.888));

        list.add(new PlaceDto("ARUN",   'A', 6004, 2361, true,  "HONNAVAR",   8.9f, 567897640L, 6.432));
        list.add(new PlaceDto("SANJAY", 'S', 6005, 2362, false, "KARWAR",     8.1f, 567897641L, 7.654));
        list.add(new PlaceDto("DEEPAK", 'D', 6006, 2363, true,  "AGUMBE",     9.5f, 567897642L, 6.876));
        list.add(new PlaceDto("NAVEEN", 'N', 6007, 2364, false, "KOLLUR",     7.9f, 567897643L, 5.999));
        list.add(new PlaceDto("PRAVEEN",'P', 6008, 2365, true,  "SAKLESHPUR", 9.0f, 567897644L, 7.321));

        list.add(new PlaceDto("KARTHIK",'K', 6009, 2366, true,  "CHIKMAGALUR",9.8f, 567897645L, 6.234));
        list.add(new PlaceDto("RAGHU",  'R', 6010, 2367, false, "MANDYA",     8.3f, 567897646L, 7.098));
        list.add(new PlaceDto("MANOJ",  'M', 6011, 2368, true,  "MYSORE",     9.2f, 567897647L, 6.754));
        list.add(new PlaceDto("LOKESH", 'L', 6012, 2369, true,  "HASSAN",     8.6f, 567897648L, 7.443));
        list.add(new PlaceDto("GIRISH", 'G', 6013, 2370, false, "BELUR",      7.8f, 567897649L, 5.765));

        list.add(new PlaceDto("RAVI",   'R', 6014, 2371, true,  "HALEBIDU",   9.3f, 567897650L, 6.555));
        list.add(new PlaceDto("SUNIL",  'S', 6015, 2372, false, "BADAMI",     8.5f, 567897651L, 7.222));
        list.add(new PlaceDto("ASHOK",  'A', 6016, 2373, true,  "AIHOLE",     9.4f, 567897652L, 7.532));
        list.add(new PlaceDto("RAJESH", 'R', 6017, 2374, true,  "PATTADAKAL", 8.2f, 567897653L, 6.888));
        list.add(new PlaceDto("YOGESH", 'Y', 6018, 2375, false, "BAGALKOT",   7.9f, 567897654L, 5.934));

        list.add(new PlaceDto("SURESH", 'S', 6019, 2376, true,  "VIJAYAPURA", 8.7f, 567897655L, 7.999));
        list.add(new PlaceDto("VIJETH", 'V', 6020, 2377, false, "BIDAR",      8.1f, 567897656L, 6.120));
        list.add(new PlaceDto("HARI",   'H', 6021, 2378, true,  "KALABURAGI", 8.9f, 567897657L, 7.000));
        list.add(new PlaceDto("RAHUL",  'R', 6022, 2379, true,  "RAICHUR",    7.8f, 567897658L, 6.671));
        list.add(new PlaceDto("TEJAS",  'T', 6023, 2380, false, "GADAG",      8.4f, 567897659L, 5.778));

        list.add(new PlaceDto("RITHVIK",'R', 6024, 2381, true,  "DHARWAD",    9.1f, 567897660L, 7.221));
        list.add(new PlaceDto("UDAY",   'U', 6025, 2382, false, "HUBLI",      8.2f, 567897661L, 6.457));
        list.add(new PlaceDto("ANIL",   'A', 6026, 2383, true,  "BELGAUM",    9.0f, 567897662L, 6.110));
        list.add(new PlaceDto("JAY",    'J', 6027, 2384, false, "GOA BORDER", 7.6f, 567897663L, 5.654));
        list.add(new PlaceDto("MANU",   'M', 6028, 2385, true,  "DANDELI",    9.7f, 567897664L, 7.889));

        list.forEach(n-> System.out.println(n));

        for (PlaceDto dto:list){
            System.out.println(dto);
        }
    }
}
