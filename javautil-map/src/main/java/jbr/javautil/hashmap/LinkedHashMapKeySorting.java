package jbr.javautil.hashmap;

import jbr.javautil.maputil.MapSortingByKey;
import jbr.javautil.maputil.MyLinkedHashMap;

/**
 * LinkedHashMap - 1) Maintains the order of insertion
 */
public class LinkedHashMapKeySorting {

  public static void main(String[] args) {

    MapSortingByKey.sortMapIntegerString(MyLinkedHashMap.getMapIntegerString(), "ASC");
    MapSortingByKey.sortMapIntegerString(MyLinkedHashMap.getMapIntegerString(), "DESC");

  }
}
