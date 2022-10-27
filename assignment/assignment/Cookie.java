public class Cookie extends DesertShop
{
    int totalcookie = 500;
    int price = 40;
    int totalcost,cost,tax;
    @Override
    public void addItem( int number)
    {
        totalcookie=totalcookie+number;
        System.out.println("Total cookie in the store="+totalcookie);
    }
    @Override
    public void getCost(int number)
    {
        cost=number*price;
        totalcost=cost+tax*number;
        System.out.println("the cost of"+number+"cookie is"+number+"*"+price+"="+cost);
        System.out.println("tax is:"+(tax*number)+"\nTotal cost is:"+totalcost);
    }
}
