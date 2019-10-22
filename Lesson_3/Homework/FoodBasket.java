package Lesson_3.Homework;

import java.util.LinkedHashMap;
import java.util.Map;

public class FoodBasket {

    private static final String[] foodBasket = {
            "Apple", "Orange", "Peach", "Melon",
            "Apple", "Watermelon", "Nut", "Bread",
            "Nut", "Potato", "Orange", "Milk",
            "Banana", "Nut"
    };

    public static void main(String[] args) {
        checkFoodBasket();
    }

    private static void checkFoodBasket() {
        Map<String, Integer> foodRepeating = new LinkedHashMap<>();
        for (String food : foodBasket) {

            Integer repeat = foodRepeating.get(food);
            if (repeat == null){
                repeat = 0;
            }
            foodRepeating.put(food, repeat + 1);

//            Integer repeat = foodRepeating.getOrDefault(food, 0);
//            foodRepeating.put(food, repeat + 1);
//
//            foodRepeating.merge(food, 1, (oldValue, newValue) -> oldValue + newValue);

//            foodRepeating.merge(food, 1, Integer::sum);
        }

        for (Map.Entry<String, Integer> o : foodRepeating.entrySet()) {
            System.out.println(o.getValue() + " " + o.getKey() + " in a basket");

//        foodRepeating.forEach((food, repeat) -> {
//            System.out.println(repeat + " " + food + " in a basket");
//        });
        }
    }
}
