package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date dateMoment1 = sdf.parse("21/06/2018 13:05:44");
		String title1 = "Traveling to New Zealand";
		String content1 = "I'm going to visit this wonderful country!";
		int likes1 = 12;
		
		Post post1 = new Post(dateMoment1, title1, content1, likes1);
		
		String comment01_01 = "Have a nice trip";
		String comment02_01 = "Wow that's awesome!";
		
		post1.addComment(new Comment(comment01_01));
		post1.addComment(new Comment(comment02_01));
		
		/* ----------------------------------------------------------------- */
		
		Date dateMoment2 = sdf.parse("28/07/2018 23:14:19");
		String title2 = "Good night guys";
		String content2 = "See you tomorrow";
		int likes2 = 5;
		
		Post post2 = new Post(dateMoment2, title2, content2, likes2);
		
		String comment01_02 = "Good night";
		String comment02_02 = "May the Force be with you";
		
		post2.addComment(new Comment(comment01_02));
		post2.addComment(new Comment(comment02_02));
		
		/* ----------------------------------------------------------------- */
		
		System.out.println(post1);
		
		System.out.println();
		
		System.out.println(post2);
		
	}

}
