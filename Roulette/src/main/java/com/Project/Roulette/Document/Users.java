package com.Project.Roulette.Document;


import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

@Document(collection = "Users")
public class Users 
{
	@Id
	private String idUser= new ObjectId().toString();	
	private String nameUser;	
	private String statusUser;
	private String password;
	@DateTimeFormat(iso= DateTimeFormat.ISO.DATE_TIME)
	private Date creationDate= new Date();	
	
	public Users()
	{
		
	}
	
	public String getIdUser()
	{
		return idUser;
	}
	public void setIdUser(String idUser)
	{
		this.idUser= idUser;
	}	
	public String getNameUser()
	{
		return nameUser;
	}
	public void setNameUser(String nameUser)
	{
		this.nameUser= nameUser;
	}	
	public String getStatusUser()
	{
		return statusUser;
	}
	public void setStatusUser(String statusUser)
	{
		this.statusUser= statusUser;
	}	
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password= password;
	}		
	public Date getCreationDate()
	{
		return creationDate;
	}
	public void CreationDate(Date creationDate)
	{
		this.creationDate= creationDate;
	}	
	
	
}