public class Candy extends DesertShop {
    int totalcandies = 500;
    int price = 60;
    int totalcost,cost,tax;
    @Override
    public void addItem(int number)
    {
        totalcandies=totalcandies+number;
        System.out.println("Total Cookies in the store="+totalcandies);
    }
    @Override
    public void getCost(int number)
    {
        cost=number*price;
        totalcost=cost+tax*number;
        System.out.println("the cost of"+number+"candies is"+number+"*"+price+"="+cost);
        System.out.println("tax is:"+(tax*number)+"\nTotal cost is:"+totalcost);
    }
}
