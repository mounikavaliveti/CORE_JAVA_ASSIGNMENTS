import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class StreamAssignment{
    public static void main(String[]args){    
    	
    	List<Fruit> fru=Arrays.asList(
    			new Fruit("Mango",100,55,"Red"),
    			new Fruit("Grapes",105,60,"Green"),
    			new Fruit("guava",110,65,"Red"),
    			new Fruit("Papaya",78,34,"Yellow"));
    	
    	
    	List<News> news1=Arrays.asList(
    			new News(2,"Navya","Shravan"," budget list is good"),
    			new News(3,"Mounika","Ashu"," ipl started"),
    			new News(3,"Mounika","Ashu","I support kkr"),
    			new News(4,"Ashish","Narhsa","wbu 12 exam"),
    			new News(2,"Navya","Yallesh","without budget list"),
    			new News(3,"Mounika","Ashu","ipl india ka festival"));
    	
        Trader Mounika = new Trader("Mounika", "Pune");
        Trader surya = new Trader("surya","Delhi");
        Trader Lakshmi = new Trader("Lakshmi","Hyderabad");
        Trader akil = new Trader("Akil","Mumbai");
		
		
		List<Transaction> transactions = Arrays.asList(
            new Transaction(Mounika, 2045, 375), 
            new Transaction(Mounika, 2016, 500),
            new Transaction(Mounika, 2045, 400),
            new Transaction(surya, 2016, 478),	
            new Transaction(surya, 2016, 456)
            
        );	
        

		//  Displayed the fruit names of low calories fruits i.e. calories < 100 sorted in
		//descending order of calories.
		System.out.println("Acoording to <less calories ");
		fru.stream()
		.filter(t->(t.FruitCalories<100))
		.collect(Collectors.toList())
		.forEach(t->System.out.println(t));

		//Display color wise list of fruit names
		System.out.println("\nSort according to color");
		fru.stream()
		.sorted((p1,p2)->p1.FruitColor.compareTo(p2.FruitColor))
		.forEach(System.out::println);
		
		//Display only RED color fruits sorted as per their price in ascending order.
		System.out.println("\nSort Red color fruits sorted withprice in ascending");
		fru.stream()
		.filter(t->t.FruitColor.equals("Red"))
		.forEach(t->System.out.println(t));
		
		//Find out the newsId which has received maximum comments.
		System.out.println("\nnewsId which has received maximum comments");
		int  p=news1.stream()
				.min((p1,p2)-> {
					return (int) p1.getNewsID()+p2.getNewsID();
					}).get().getNewsID();
			 System.out.println(p);
	
		
		 //Find out how many times the word 'budget' arrived in user comments all news.
		        System.out.println("\nthe word 'budget' arrived in user comments ");
		
		news1.stream()
		.filter(t->t.NewsComment.contains("budget"))
		.forEach(t->System.out.println(t));
		
		//Find out which user has posted maximum comments.
		 System.out.println("\nwhich user has posted maximum comments");
	 	String  n=news1.stream()
		.max((p1,p2)-> {
			return (int) p1.getNewsCommentbyUser().compareTo(p2.getNewsCommentbyUser());
			}).get().getNewsCommentbyUser();
	
		System.out.println(n);

		//Display commentByUser wise number of comments
		 System.out.println("\ncommentByUser wise number of comments");
		news1.stream()
		.sorted((p1,p2)->p1.getNewsCommentbyUser().compareTo(p2.getNewsCommentbyUser()))
		.collect(Collectors.toList())
		.forEach(t->System.out.println(t.NewsCommentbyUser+"="+t.NewsComment));
		
		
		
		
		
        //  Find all transactions from year 2045 and sort them by value (small to high).
        List<Transaction> tr2045 = transactions.stream()
                                               .filter(transaction -> transaction.getYear() == 2045)
                                               .sorted(comparing(Transaction::getValue))
                                               .collect(toList());
        System.out.println(tr2045);
        
        //  What are all the unique cities where the traders work?
        List<String> cities = 
            transactions.stream()
                        .map(transaction -> transaction.getTrader().getCity())
                        .distinct()
                        .collect(toList());
        System.out.println(cities);

        // Find all traders from Pune and sort them by name.
        
        List<Trader> traders = 
            transactions.stream()
                        .map(Transaction::getTrader)
                        .filter(trader -> trader.getCity().equals("Pune"))
                        .distinct()
                        .sorted(comparing(Trader::getName))
                        .collect(toList());
        System.out.println(traders);
        
        
        // Return a string of all traders’ names sorted alphabetically.
        
        String traderStr = 
            transactions.stream()
                        .map(transaction -> transaction.getTrader().getName())
                        .distinct()
                        .sorted()
                        .reduce("", (n1, n2) -> n1 + n2);
        System.out.println(traderStr);
        
        //Are there any trader based in Pune?
        
        boolean PuneBased =
            transactions.stream()
                        .anyMatch(transaction -> transaction.getTrader()
                                                            .getCity()
                                                            .equals("Pune")
                                 );
        System.out.println(PuneBased);
        
        //Are there any trader in indore?
        
        boolean indoreBased =
                transactions.stream()
                            .anyMatch(transaction -> transaction.getTrader()
                                                                .getCity()
                                                                .equals("indore")
                                     );
            System.out.println(indoreBased);
        
        // Update all transactions so that the traders from Pune are set to Delhi.
        transactions.stream()
                    .map(Transaction::getTrader)
                    .filter(trader -> trader.getCity().equals("Pune"))
                    .forEach(trader -> trader.setCity("Delhi"));
        System.out.println(transactions);
        
        
        // What's the highest value in all the transactions?
        int highestValue = 
            transactions.stream()
                        .map(Transaction::getValue)
                        .reduce(0, Integer::max);
        System.out.println(highestValue);   
        
        // What's the lowest value in all the transactions?
        int lowestValue = 
                transactions.stream()
                            .map(Transaction::getValue)
                            .reduce(500, Integer::min);
            System.out.println(lowestValue);      
    }
}