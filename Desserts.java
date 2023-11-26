package Gaurav;

//Desserts.java
public class Desserts {
 private FoodItem[] desserts;

 public Desserts() {
     desserts = new FoodItem[]{
             new FoodItem("Almond Malai Kulfi", 90),
             new FoodItem("Lemon Tart", 100),
             new FoodItem("Pistachio Phirni", 80),
             new FoodItem("Fudgy Chewy Brownies", 110),
             new FoodItem("Low Fat Tiramisu", 120),
             new FoodItem("Coconut Kheer", 85),
             new FoodItem("Chocolate Coffee Truffle", 95)
     };
 }

 public FoodItem[] getDesserts() {
     return desserts;
 }
}

