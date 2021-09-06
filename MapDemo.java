import java.awt.Color;

import java.util.HashMap;

import java.util.Map;

import java.util.Set;

public class MapDemo
{

public static void main(String[] args)

{

Map<String, Color>favoriteColors = new HashMap<String, Color>(); favoriteColors.put("sai", Color.BLUE); favoriteColors.put("Ram", Color.GREEN); favoriteColors.put("krishna", Color.RED);

favoriteColors.put("narayana", Color.BLUE); // Print all keys and values in the map

Set<String>keySet = favoriteColors.keySet(); for (String key : keySet)

{

Color value = favoriteColors.get(key);

System.out.println(key + " : " + value);

}

}

}
