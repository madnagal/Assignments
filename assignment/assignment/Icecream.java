public class Icecream extends DesertShop
{
        int totalicecreams = 500;
        int price = 40;
        int totalcost,cost,tax;
        @Override
        public void addItem(int number)
        {
            totalicecreams=totalicecreams+number;
            System.out.println("Total icecreams in the store="+totalicecreams);
        }
        @Override
        public void getCost(int number)
        {
            cost=number*price;
            totalcost=cost+tax*number;
            System.out.println("the cost of"+number+"icecreams is"+number+"*"+price+"="+cost);
            System.out.println("tax is:"+(tax*number)+"\nTotal cost is:"+totalcost);
        }
}

