package rc.legostore.api;


import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rc.legostore.model.LegoSet;

@RestController
@RequestMapping("legostore/api")
public class LegoStoreController {

	@Autowired
	private  MongoTemplate  mongoTemplate;
  
	 

	@PostMapping(path = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void insert(@RequestBody LegoSet legoset) {
		this.mongoTemplate.insert(legoset);
	}
}
