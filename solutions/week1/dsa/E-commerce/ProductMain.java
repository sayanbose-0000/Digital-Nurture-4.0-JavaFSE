import java.util.Scanner;

class Product {
  int productId;
  String productName;
  String category;
}

class ProductMain {
  static void getProducts(Product[] p) {
    for (int i = 0; i < p.length; i++) {
      p[i] = new Product();
    }
    
    p[0].productId = 3;
    p[0].productName = "Laptop";
    p[0].category = "Electronics";

    p[1].productId = 1;
    p[1].productName = "Mouse";
    p[1].category = "Electronics";


    p[2].productId = 2;
    p[2].productName = "Spoons";
    p[2].category = "Home Essentials";

    
    p[3].productId = 5;
    p[3].productName = "Mobile";
    p[3].category = "Gadgets";

    p[4].productId = 4;
    p[4].productName = "Earbuds";
    p[4].category = "Gadgets";
  }

  static void displayProducts(Product[] p) {
    for (int i = 0; i < p.length; i++) {
      System.out.println(p[i].productId + "\t" + p[i].productName + "\t\t" + p[i].category);
    }

    System.out.println();
  }

  static void linearSearch(Product[] p) {
    // Linear Search
    System.out.print("Enter the product you want to search (Linear search): ");
    Scanner sc = new Scanner(System.in);

    String val = sc.nextLine();

    boolean flag = false;
    for (int i = 0; i < p.length; i++) {
      if (val.equals(p[i].productName)) {
        flag = true;
        System.out.println("Found at: " + i);
        System.out.println(p[i].productId + "\t" + p[i].productName + "\t\t" + p[i].category);
        break;
      }
    }

    if (!flag) {
      System.out.println("Not found");
    }

  }

  static void sort(Product[] p) {
    for (int i = 0; i < p.length - 1; i++) {
      for (int j = 0; j < p.length - i - 1; j++) {
        if (p[j].productId > p[j+1].productId) {
          Product temp = p[j];
          p[j] = p[j+1];
          p[j+1] = temp;
        }
      }
    }
  }

  static void binarySearch(Product[] p) {
    // Binary Search
    sort(p);

    System.out.print("Enter the product id want to search (Binary search): ");
    Scanner sc = new Scanner(System.in);

    int val = sc.nextInt();

    int low = 0, high = p.length - 1;

    boolean flag = false;
    while (low <= high) {
      int mid = (low + high) / 2;

      if (val < p[mid].productId) high = mid-1; 
      else if (val > p[mid].productId) low = mid + 1;
      else {
        flag = true;
        System.out.print("Found at: " + mid);
        System.out.println(p[mid].productId + "\t" + p[mid].productName + "\t\t" + p[mid].category);
        break;
      }

    }

    if (!flag) {
      System.out.println("Not found");
    }
  }

  public static void main(String[] args) {
    Product[] p = new Product[5];
    getProducts(p);

    displayProducts(p);

    System.out.print("1- Linear Search, 2- Binary Search --- ");
    Scanner sc = new Scanner(System.in);

    int choice = sc.nextInt();

    if (choice == 1) {
      linearSearch(p);
    } 
    
    else {
      binarySearch(p);
    } 
  }
}

// Output
// ======

// User@bose /c/sayan/Digital-Nurture-4.0-JavaFSE/solutions/week1/dsa/E-commerce
// $ javac ProductMain.java 
// User@bose /c/sayan/Digital-Nurture-4.0-JavaFSE/solutions/week1/dsa/E-commerce
// $ java ProductMain
// 3       Laptop          Electronics
// 1       Mouse           Electronics
// 2       Spoons          Home Essentials
// 5       Mobile          Gadgets
// 4       Earbuds         Gadgets

// 1- Linear Search, 2- Binary Search --- 2
// Enter the product id want to search (Binary search): 4
// Found at: 34    Earbuds         Gadgets