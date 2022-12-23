package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;


    private int cheesePrice;  // price of extra cheese
    private int toppingPrice; // price of extra toppings

    private int paperBagPrice; // price of paperBag

    private boolean topping; // to check topping is added or not
    private boolean cheese ; // to check cheese is added or not

    private boolean paperBag;  // to check paperBag is added or not

    private boolean isBill ;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.cheesePrice = 80;
        this.paperBagPrice = 20;
        if(isVeg){
            this.price = 300;
            this.toppingPrice = 70;
        }
        else{
            this.price = 400;
            this.toppingPrice = 120;
        }
        this.topping = false;
        this.cheese = false;
        this.paperBag = false;

        this.bill = "Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!cheese){
            this.price += this.cheesePrice;
            cheese = true;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(!topping){
            this.price += this.toppingPrice;
            topping = true;
        }
    }

    public void addTakeaway(){
        // your code goes here

        if(!paperBag){
            this.price += this.paperBagPrice;
            paperBag = true;
        }

    }

    public String getBill(){
        // your code goes here

        if(!isBill){
            if(cheese){
                this.bill += "Extra Cheese Added: "+this.cheesePrice+"\n";
            }
            if(topping){
                this.bill += "Extra Toppings Added: "+this.toppingPrice+"\n";
            }
            if(paperBag){
                this.bill += "Paperbag Added: "+this.paperBagPrice+"\n";
            }

            this.bill += "Total Price: "+this.price+"\n";
            isBill = true;
        }

        return this.bill;


    }
}
