package jbr.javautil.treemap;

import jbr.javautil.maputil.MapSortingByValue;
import jbr.javautil.maputil.MyTreeMap;

public class TreeMapValueSorting {

  public static void main(String[] args) {
    MapSortingByValue.sortByValueUsingCollectionSort(MyTreeMap.getMapStringInteger(), "ASC");
    MapSortingByValue.sortByValueUsingCollectionSort(MyTreeMap.getMapStringInteger(), "DESC");

    System.out.println("\n");
    MapSortingByValue.sortByValue(MyTreeMap.getMapStringInteger(), "ASC");
    MapSortingByValue.sortByValue(MyTreeMap.getMapStringInteger(), "DESC");
  }

}
