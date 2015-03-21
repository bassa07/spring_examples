package com.sandeep.spring;

import java.util.List;

public class PostBox {
List<Post> posts;
String pbName;

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
