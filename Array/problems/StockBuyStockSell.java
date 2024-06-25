public class StockBuyStockSell{

    public int stockBuySell(int price[]){
        int n = price.length;

        int profit = 0;

        for(int i = 1; i<n; i++){
            if(price[i] > price[i-1]){
                profit += price[i] - price[i-1];
            }
        }

        return profit;
    }

    public void printArray(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] price = {1, 5, 3, 8, 12};

        int[] price1 = {30, 20, 10};

        StockBuyStockSell stock = new StockBuyStockSell();

        System.out.println("Original Array stocks : ");
        stock.printArray(price);
        int profit = stock.stockBuySell(price);
        System.out.println("Profit : " + profit);


        System.out.println("Original Array stocks : ");
        stock.printArray(price1);
        int profit1 = stock.stockBuySell(price1);
        System.out.println("Profit : " + profit1);
        
    }
}