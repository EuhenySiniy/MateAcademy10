package toxml;

import org.apache.log4j.Logger;

import java.beans.XMLEncoder;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FormatingToXml {
    private static final Logger LOGGER = Logger.getLogger(FormatingToXml.class);

    public void collectionInitialization() {
        List<Map<List<Set<Integer>>, String>> list = new ArrayList<>();
        Integer value = 10;
        Set<Integer> set = new HashSet<>(value);
        List<Set<Integer>> list1 = new ArrayList<>();
        list1.add(set);
        Map<List<Set<Integer>>, String> map = new HashMap<>();
        map.put(list1, "Element");
        list.add(map);
    }

    public void conversion(List list) {
        try(FileOutputStream xmlFile = new FileOutputStream("list.xml")) {
            XMLEncoder xmlEncoder = new XMLEncoder(xmlFile);
            xmlEncoder.writeObject(list);
        } catch (IOException e) {
            LOGGER.info(e.getMessage());
        }
    }
}
