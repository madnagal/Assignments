import java.lang.*;
import java.util.*;
public class DesertShop {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Cookie cookie = new Cookie();
        Candy candy = new Candy();
        Icecream icecream = new Icecream();
        System.out.println("Choose 1 if you are owner \n choose 2 if you are custumer");
        int choose = sc.nextInt();
        switch (choose)
        {
            case 1:
                System.out.println("enter the item you want to add");
                String str = sc.next();
                if (str.equalsIgnoreCase("Cookie")) {
                    System.out.println("enter the number of cookie you want to add");
                    int number = sc.nextInt();
                    cookie.addItem(number);
                } else if (str.equalsIgnoreCase("Candy")) {
                    System.out.println("enter the number of candy you want to add");
                    int number = sc.nextInt();
                    candy.addItem(number);
                } else if (str.equalsIgnoreCase("Icecream")) {
                    System.out.println("enter the number of icecream you want to add");
                    int number = sc.nextInt();
                    icecream.addItem(number);
                }
                break;
            case 2:
                System.out.println("enter the item you want to order");
                String str1 = sc.next();
                if (str1.equalsIgnoreCase("Cookie")) {
                    System.out.println("enter the number of cookie you want to order");
                    int number = sc.nextInt();
                    cookie.getCost(number);
                } else if (str1.equalsIgnoreCase("Candy")) {
                    System.out.println("enter the number of candy you want to order");
                    int number = sc.nextInt();
                    candy.getCost(number);
                } else if (str1.equalsIgnoreCase("Icecream")) {
                    System.out.println("enter the number of icecream you want to order");
                    int number = sc.nextInt();
                    icecream.getCost(number);
                }
                break;
        }
    }
}
