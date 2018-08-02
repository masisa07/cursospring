package guru.springframework.spring5recipeapp.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Entity
@Data
public class Recipe {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String description;
	private Integer preTime;
	private Integer cookTime;
	private Integer servings;
	private String url;
	private String directions;
	//TODO: private Difficulty difficulty;
	@Lob
	private Byte[] image;
	
	@OneToMany (cascade=CascadeType.ALL, mappedBy = "recipe")
	private Set<Ingredient> ingredients;
	@OneToOne (cascade = CascadeType.ALL)
	private Notes note;
	
	
}