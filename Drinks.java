package Gaurav;

//Drinks.java
public class Drinks {
 private FoodItem[] drinks;

 public Drinks() {
     drinks = new FoodItem[]{
             new FoodItem("Coca Cola", 40),
             new FoodItem("Thums Up", 40),
             new FoodItem("Sprite", 40),
             new FoodItem("Pepsi", 40),
             new FoodItem("7 Up", 40),
             new FoodItem("Mirinda", 40),
             new FoodItem("Maaza", 45),
             new FoodItem("Mountain Dew", 40)
     };
 }

 public FoodItem[] getDrinks() {
     return drinks;
 }
}

