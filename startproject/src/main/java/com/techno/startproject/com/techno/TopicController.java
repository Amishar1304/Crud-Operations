package com.techno.startproject.com.techno;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController        
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	
	@GetMapping("/top")
	public List<topic> getAllTopics()
	{
		return topicService.getAllTopics();

}
	@GetMapping("/top/{id}")
	public topic getTopic(@PathVariable String id)
	{
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/top")
	public void addTopic(@RequestBody topic topic) {
		topicService.addTopic(topic);		
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/top/{id}")
	public void updateTopic(@RequestBody topic topic, @PathVariable String id) {
		topicService.updateTopic(id, topic);		
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/top/{id}")
	public void deleteTopic(@PathVariable String id)
	{
		 topicService.deleteTopic(id);
	}
	
	
	
	
	

}
