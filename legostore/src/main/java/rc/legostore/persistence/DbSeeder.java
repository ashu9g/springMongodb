package rc.legostore.persistence;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import rc.legostore.model.DeliveryInfo;
import rc.legostore.model.LegoSet;
import rc.legostore.model.LegoSetDifficulty;
import rc.legostore.model.ProductReview;

@Service
public class DbSeeder implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		 
		LegoSet millinumnFalkon= new LegoSet(
				"Millinumn Falkon",
				"Stars Wars", 
				LegoSetDifficulty.HARD,
				new DeliveryInfo(LocalDate.now().plusDays(1), 30, true)  ,
				Arrays.asList(
						new ProductReview("Dan", 7),
						new ProductReview("Anna", 10),
						new ProductReview("John", 8)
						)
			);
		

		LegoSet skyPolice= new LegoSet(
				"sky Police Air Base",
				"city", 
				LegoSetDifficulty.MEDIUM,
				new DeliveryInfo(LocalDate.now().plusDays(3), 50, true)  ,
				Arrays.asList(
						new ProductReview("Dan", 5),
						new ProductReview("Andrew", 8) 
						)
			);

		LegoSet mcLarenSenna= new LegoSet(
				"mcLarenSenna Senna",
				"Speed Champions", 
				LegoSetDifficulty.EASY,
				new DeliveryInfo(LocalDate.now().plusDays(7), 70, false)  ,
				Arrays.asList(
						new ProductReview("Bogdan", 9),
						new ProductReview("Christa", 9) 
						)
			);

		LegoSet mindsStormsEva= new LegoSet(
				"mindsStorms Eva3",
				"Mindstorms", 
				LegoSetDifficulty.HARD,
				new DeliveryInfo(LocalDate.now().plusDays(10), 100, true)  ,
				Arrays.asList(
						new ProductReview("Cosmin", 10),
						new ProductReview("Jane", 9),
						new ProductReview("James", 10)
						)
			);

	 
		
	}

	
}
