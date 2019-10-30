package rc.legostore.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document(collection= "legosets")
public class LegoSet {
	@Id
	private String id;
	private String name;
	private String difficulty; 
	@Indexed(direction = IndexDirection.ASCENDING)
	private String theme;  
	private Collection<ProductReview> reviews= new ArrayList<>();
	
	@Field("deliver")
	private DeliveryInfo  deliveryInfo;

	@PersistenceConstructor  // if multiple constructor then instruct mongodb which constructor are used for persistence data to db
	public LegoSet(String name,
			String theme, 
			String mEDIUM,
			DeliveryInfo deliveryInfo,
			Collection<ProductReview> reviews) {
		super();
		this.name = name;
		this.difficulty = mEDIUM;
		
		this.theme = theme;
		this.reviews = reviews;
		this.deliveryInfo = deliveryInfo;
		
		if(reviews !=null ) {
			this.reviews = reviews;
		}
	}
	
 

	@Transient //do not persist this into db
	private int nbParts;

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDifficulty() {
		return difficulty;
	}

	public String getTheme() {
		return theme;
	}

	public Collection<ProductReview> getReviews() {
		return reviews;
	}

	public DeliveryInfo getDeliveryInfo() {
		return deliveryInfo;
	}

	public int getNbParts() {
		return nbParts;
	}
	
	
	
}
