package com.mingcloud.dataMigration.controller;

import com.mingcloud.dataMigration.dto.TableDto;
import com.mingcloud.dataMigration.mapper.master.MasterTableMapper;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest
public class MapTest {

    @Autowired
    private MasterTableMapper masterTableMapper;


    @Test
   public void testMap() throws JSONException {
        Map<String,Object> map1 = new HashMap<String, Object>();
        map1.put("aa", "11");
        map1.put("bb", "22");
        Map<String,Object> map2 = new HashMap<String, Object>();
        map2.put("cc", "23");
        map2.put("dd", "24");
        Map<String,Object> map3 = new HashMap<String, Object>();
        map3.put("ee", "55");
        map3.put("ff", "66");

        JSONObject map4 = new JSONObject();
        map4.put("g0", "woshi");
        map4.put("g", map1);
        map4.put("h", map2);
        map4.put("i", map3);

        System.out.println("map1=="+map1);
        System.out.println("map4=="+map4);

        JSONObject map5 = new JSONObject();
        map5.put("g0", "woshi");
        map5.put("g", map4);

        System.out.println("map5=="+map5);


        //map1=={aa=11, bb=22}
        //map4=={"g":"{aa=11, bb=22}","h":"{cc=23, dd=24}","g0":"woshi","i":"{ee=55, ff=66}"}
        //map5=={"g":{"g":"{aa=11, bb=22}","h":"{cc=23, dd=24}","g0":"woshi","i":"{ee=55, ff=66}"},"g0":"woshi"}

    }
    @Test
    public void testTableMap(){
        Map<String, Object> tableMap = new HashMap<>();


        TableDto dto = new TableDto();
        dto.setNewTable("t_user");
        dto.setOldTable("t_student");
        //dto.map.put("id","id");
        dto.map.put("name","name");
        dto.map.put("age","age");


        tableMap.put("newTable",dto.getNewTable());
        tableMap.put("oldTable",dto.getOldTable());

        Map<String, Object> map = new HashMap<>();
        map.put("tableMap",tableMap);
        map.put("columnMap",dto.map);
        masterTableMapper.selectDataInto(map);




        Set<Map.Entry<String, Object>> set = dto.map.entrySet();
        Iterator<Map.Entry<String, Object>> iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            String key = (String) entry.getKey();
            String value = (String) entry.getValue();
            System.out.println("key:" + key + ",value:" + value);
        }

    }

    @Test
    public void testLinkedHashMap(){
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("name1", "josan1");
        linkedHashMap.put("name2", "josan2");
        linkedHashMap.put("name3", "josan3");
        Set<Map.Entry<String, String>> set = linkedHashMap.entrySet();
        Iterator<Map.Entry<String, String>> iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            String key = (String) entry.getKey();
            String value = (String) entry.getValue();
            System.out.println("key:" + key + ",value:" + value);
        }
    }




}
