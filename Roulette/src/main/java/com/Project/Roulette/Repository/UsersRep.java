package com.Project.Roulette.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.data.mongodb.core.*;
import org.springframework.data.mongodb.core.query.CriteriaDefinition;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;
import com.Project.Roulette.Document.Users;
import com.jayway.jsonpath.Criteria;
import com.mongodb.client.result.UpdateResult;
import java.util.List;
@Repository
public class UsersRep {
	@Autowired
	private MongoTemplate mongoTemplate;
	public Users saveUser (Users users)
	{
		return mongoTemplate.save(users);
	}
	public UpdateResult updateUser(String idUser, String nameUser)
	{
		return mongoTemplate.updateFirst(
				new Query().addCriteria((CriteriaDefinition) Criteria.where("idUser").is(idUser)) , 
				new Update().addToSet("nameUser", nameUser), 
				"Users" 
		);
				
	}
	public Users findUser(String idUser)
	{
		return mongoTemplate.findOne(new Query().query((CriteriaDefinition) Criteria.where("idUser").is(idUser)), Users.class , "Users");
	}
	
}
