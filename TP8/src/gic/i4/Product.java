package gic.i4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Product{
    int productNumber, amount;
    String name;
    float price;
    int count = 0;
    Product(){};

    Product(int productNumber, String name, float price, int amount){
        this.productNumber = productNumber;
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public int getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    ArrayList<Product> products = new ArrayList<Product>();

    void showProduct(){
        Iterator itr=products.iterator();
        //traversing elements of ArrayList object
        if(itr.hasNext()){
            System.out.println("_____Product_____");
            System.out.println("No.\tName\tPrice\tAmount");
            while(itr.hasNext()){
                Product pr=(Product) itr.next();
                System.out.println(pr.productNumber + "\t"+ pr.name+ "\t" + pr.price +"\t\t" +pr.amount);
            }
        }else{
            System.out.println("There are no product!");
        }
    }
    void addNewProduct(){
        Scanner sc = new Scanner(System.in);
        System.out.println("_____Add Product_____");

        System.out.print("Enter product No: ");
        int productNo = Integer.parseInt(sc.nextLine());
        System.out.print("Enter product name: ");
        String productName = sc.nextLine();
        System.out.print("Enter product price: ");
        float productPrice = sc.nextFloat();
        System.out.print("Enter product amount: ");
        int productAmount = sc.nextInt();


        Product pro = new Product(productNo, productName, productPrice, productAmount);
        products.add(pro);
        System.out.println("The product name " +productName+ " has been added!");
        count += 1;
    }
    void removeProduct(){
        int inputNumber;
        boolean isFound = false;
        Scanner sc = new Scanner(System.in);

        if(count <= 0){

            System.out.print("There are no product!");
        }else if(count == 1) {
            System.out.println("_____Remove Product_____");
            System.out.print("Enter product No: ");
            inputNumber = sc.nextInt();
            products.clear();count--;
        }
        else{
            System.out.print("Enter product No: ");
            inputNumber = sc.nextInt();
            for (Product pro : products) {
                if (pro.getProductNumber() == inputNumber) {
                    products.remove(inputNumber - 1);
                    System.out.println("This product had been removed!");
                    isFound = true;
                    break;
                }

            }
            if(!isFound){
                System.out.println("There are no this product!");
            }
            count--;
        }
    }
    void updateProduct(){
        boolean isfound = false;
        Scanner sc = new Scanner(System.in);

        if(count >= 1){
            System.out.println("_____Update Product_____");
            System.out.print("Enter product No: ");
            int inputNumber = sc.nextInt();
            for (Product pro : products) {
                if (pro.getProductNumber() == inputNumber) {
                    System.out.println("______Update Product_____");

                    System.out.print("Enter product  No: ");
                    int productNo = sc.nextInt();
                    System.out.print("Enter product name: ");
                    String productName = sc.nextLine();
                     productName = sc.nextLine();
                    System.out.print("Enter product price: ");
                    float productPrice = sc.nextFloat();
                    System.out.print("Enter product amount: ");
                    int productAmount = sc.nextInt();


                    pro.setProductNumber(productNo);
                    pro.setName(productName);
                    pro.setPrice(productPrice);
                    pro.setAmount(productAmount);
                    System.out.println("The product name " +productName+ " has been added!");
                    isfound = true;
                    break;

                }
            }
            if(!isfound){
                System.out.println("This product is not found!");
            }
        }else {
            System.out.println("There are no produce!");
        }
    }



}
