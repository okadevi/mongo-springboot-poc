package mongodb.poc.iom.model;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="poc_user")
public class User {
	
	@Field("name")
	private String userName;
	
	@Id
	private ObjectId userId;
	private Date creationDate;// = new Date();
	
	public User() {}
	
	public User(String userName) {
		super();
		this.userName = userName;
		this.userId = ObjectId.get();
		this.creationDate = new Date();
	}



	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public Date getCreationDate() {
		return creationDate;
	}
	public ObjectId getUserId() {
		return userId;
	}
	public void setUserId(ObjectId userId) {
		this.userId = userId;
	}
	
	
	
}
