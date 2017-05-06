package com.paul.diaz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test {
    private static HashMap<String, List<String>> left_map_rights;

    public static void main(String args[]) throws Exception {
        left_map_rights = new HashMap<>();
       
        System.out.println("start");
        List<List<String>> routes = GetAllRoutes("BKI", "SIN");
        System.out.println("end");
        routes.forEach(System.out::println);
        
        
    }
        public static List<List<String>> GetAllRoutes(String start, String end) {
            List<List<String>> routes = new ArrayList<>();
            List<String> rights = left_map_rights.get(start);
            if (rights != null) {
                for (String right : rights) {
                    List<String> route = new ArrayList<>();
                    route.add(start);
                    route.add(right);
                    Chain(routes, route, right, end);
                }
            }
            return routes;
        }

        public static void Chain(List<List<String>> routes, List<String> route, String right_most_currently, String end) {
            if (right_most_currently.equals(end)) {
                routes.add(route);
                return;
            }
            List<String> rights = left_map_rights.get(right_most_currently);
            if (rights != null) {
                for (String right : rights) {
                    if (!route.contains(right)) {
                        List<String> new_route = new ArrayList<String>(route);
                        new_route.add(right);
                        Chain(routes, new_route, right, end);
                    }
                }
            }
        }
    }