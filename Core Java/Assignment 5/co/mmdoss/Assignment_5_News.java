package co.mmdoss;

import java.util.LinkedList;
import java.util.List;

class Assignment_5_News {

	public static void main(String[] args) {
		List<News> newsList=new LinkedList<News>();
		newsList.add(new News(1, "mmdoss", "amit", "Very good"));
		newsList.add(new News(2, "kamal", "gandhi", "Properly executed"));
		newsList.add(new News(3, "venky", "gandhi", "Very well written"));
		newsList.add(new News(4, "sree", "muthu", "Amazing insight into the story"));
		newsList.add(new News(5, "muthu", "kamal", "Poor report"));
		newsList.add(new News(6, "kamal", "muthu", "Fantabulous"));
		newsList.add(new News(7, "sree", "amit", "Super creativity"));
		
		System.out.println("News list : \n");
		newsList.forEach(System.out::println);
		
		System.out.println("\n--------------------------\n");
		System.out.println("NewsId which received maximum comments : \n");
		
		News news1=newsList.stream()
				.max((o1,o2)->o1.getComment().length()-o2.getComment().length())
				.get();
		System.out.println(news1.getNewsId());
		
		/*System.out.println("\n--------------------------\n");
		System.out.println("User posted maximum comments : \n");*/
		

		
		/*System.out.println("\n--------------------------\n");
		System.out.println("Display commentByUser wise number of comments : \n");*/
		
			
		
		
		
	}

}
