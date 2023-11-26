package Gaurav;

//MainCourse.java
public class MainCourse {
 private FoodItem[] mainCourses;

 public MainCourse() {
     mainCourses = new FoodItem[]{
             new FoodItem("Lemon Capellini Salad (With Tomatoes And Capers)", 120),
             new FoodItem("Easy Spicy Lemon Butter Chicken", 200),
             new FoodItem("Japanese Steakhouse Style Hibachi Chicken", 220),
             new FoodItem("Oven Baked Creamy Amish Chicken", 180),
             new FoodItem("Pesto Cream Cheese Chicken", 190),
             new FoodItem("Quick Stir Fried Kimchi Noodles", 150),
             new FoodItem("Cantonese Style Pan Fried Noodles", 160),
             new FoodItem("Olive Tapenade Pasta", 170)
     };
 }

 public FoodItem[] getMainCourses() {
     return mainCourses;
 }
}

