package javaPractice;

import java.util.HashMap;

public class hashMap
{
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("Karnataka","Bangalore");
        map.put("Tamil Nadu","Chennai");
        map.put("Telangana","Hyderabad");
        map.put("Kerala","kochi");
        System.out.println(map);
        System.out.println(map.get("Karnataka"));
        System.out.println(map.size());

        for (String str : map.keySet())
        {
            System.out.println("keys :"+str +" "+ "values"+":"+map.get(str));
        }



    }
}
