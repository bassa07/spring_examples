package com.sandeep.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


public class ContextAwarePostBox implements ApplicationContextAware{
	private List<Post> posts;
	private String pbName;
		
	ApplicationContext context;
	
	//Call Sequence when bean loaded Constuctor, ContextAware methods
	public ContextAwarePostBox()
	{		
	}
	
	public void createPosts()
	{
		if(context != null)
		{
			pbName = "Hyderabad";
			posts = new ArrayList<Post>();
			
			int i=0;
			while(i<3){
				Post post = (Post)context.getBean("post");
				post.setFromAddress("From"+i);
				post.setToAddress("To:"+i);
				post.setBody("Body"+i);
				posts.add(post);
				i++;
			}
			 
		}
		else{
			System.out.println("Context is Null");
		}
	}
	public void showPosts()
	{
		for(Post post: posts)
		{
			System.out.println("From :" + post.getFromAddress() );
			System.out.println("To :" + post.getToAddress() );
			System.out.println(" \t \t Body :" + post.getBody());
			
			System.out.println("---------"+pbName+"-------------------------");
		}
	}
	
	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		this.context = context;
		System.out.println("Context has been assigned");
	}

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	public String getPbName() {
		return pbName;
	}

	public void setPbName(String pbName) {
		this.pbName = pbName;
	}

}
