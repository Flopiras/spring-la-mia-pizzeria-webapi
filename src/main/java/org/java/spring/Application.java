package org.java.spring;

import org.java.spring.auth.conf.AuthConf;
import org.java.spring.auth.db.pojo.Role;
import org.java.spring.auth.db.pojo.User;
import org.java.spring.auth.db.serv.RoleService;
import org.java.spring.auth.db.serv.UserService;
import org.java.spring.db.pojo.Ingredient;
import org.java.spring.db.pojo.Pizza;
import org.java.spring.db.serv.IngredientService;
import org.java.spring.db.serv.OfferService;
import org.java.spring.db.serv.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner{
	
	@Autowired
	private PizzaService pizzaService;
	
	@Autowired
	private OfferService offerService;
	
	@Autowired
	private IngredientService ingredientService;
	
	@Autowired
	private RoleService roleService;
	
	@Autowired
	private UserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//INGREDIENTS
		Ingredient i1 = new Ingredient("pomodoro");
		Ingredient i2 = new Ingredient("mozzarella");
		Ingredient i3 = new Ingredient("wurstel");
		Ingredient i4 = new Ingredient("patatine");
		Ingredient i5 = new Ingredient("melanzane");
		Ingredient i6 = new Ingredient("olive");
		Ingredient i7 = new Ingredient("salame");
		Ingredient i8 = new Ingredient("funghi");
	
		ingredientService.save(i1);
		ingredientService.save(i2);
		ingredientService.save(i3);
		ingredientService.save(i4);
		ingredientService.save(i5);
		ingredientService.save(i6);
		ingredientService.save(i7);
		ingredientService.save(i8);
		
		//PIZZAS
		pizzaService.save(new Pizza("Margherita", "mozzarella, pomodoro", "https://primochef.it/wp-content/uploads/2019/08/SH_pizza_fatta_in_casa-1200x800.jpg.webp", 8.5f, i1));
		pizzaService.save(new Pizza("Diavola", "mozzarella, pomodoro, salame piccante", "https://wips.plug.it/cips/buonissimo.org/cms/2012/05/69630013_m.jpg", 8.5f));
		pizzaService.save(new Pizza("Campagnola", "mozzarella, pomodoro, funghi, prosciutto", "https://media-cdn.tripadvisor.com/media/photo-s/10/ed/eb/85/photo1jpg.jpg", 8.5f));
		pizzaService.save(new Pizza("Rustica", "pomodoro, mozzarella di bufala, peperoni, melanzane, zucchine", "https://www.fruttaweb.com/consigli/wp-content/uploads/2018/06/pizza-vegana.jpg", 8.5f));
		pizzaService.save(new Pizza("Sbriciolata", "mozzarella, pomodoro, salsiccia, pecorino", "https://blog.giallozafferano.it/incucinaconmary/wp-content/uploads/2012/09/pizap.com10.823721832130104313479955621741.jpg", 8.5f));
		pizzaService.save(new Pizza("Americana", "mozzarella, pomodoro, wurstel, patatine fritte", "https://i0.wp.com/www.piccolericette.net/piccolericette/wp-content/uploads/2017/11/3244_Pizza.jpg?resize=895%2C616&ssl=1", 8.5f, i1, i2, i3, i4));
		pizzaService.save(new Pizza("Hawaiana", "mozzarella, pomodoro, ananas", "https://garage.pizza/wp-content/uploads/2022/08/International-pineapple-pizza-day-570x570.jpg", 8.5f));
		pizzaService.save(new Pizza("Parmigiana", "mozzarella, pomodoro, melanzane fritte, parmigiano", "https://www.ricettedellanonna.net/wp-content/uploads/2014/09/pizza_rustica_aslla_parmigiana.1-620x465.jpg", 8.5f));
		pizzaService.save(new Pizza("4 Stagioni", "mozzarella, pomodoro, prosciutto crudo, carciofi, funghi, olive", "https://www.ricettedalmondo.it/images/foto-ricette/p/29526-pizza-quattro-stagioni.jpg", 8.5f));
		pizzaService.save(new Pizza("4 Formaggi", "mozzarella, provola, gorgonzola, parmigiano", "https://i0.wp.com/www.piccolericette.net/piccolericette/wp-content/uploads/2017/06/3234_Pizza.jpg?resize=895%2C616&ssl=1", 8.5f));
		pizzaService.save(new Pizza("Pere e gorgonzola", "mozzarella, pere, gorgonzola, noci", "https://i1.wp.com/www.piccolericette.net/piccolericette/wp-content/uploads/2021/07/4750_Pizza.jpg?resize=895%2C616&ssl=1", 8.5f));
		pizzaService.save(new Pizza("Tonno e cipolla", "mozzarella, tonno, cipolla", "https://i1.wp.com/www.piccolericette.net/piccolericette/wp-content/uploads/2017/10/3245_Pizza.jpg?resize=895%2C616&ssl=1", 8.5f));
		pizzaService.save(new Pizza("Campagnola", "mozzarella, pomodoro, funghi, prosciutto", "https://media-cdn.tripadvisor.com/media/photo-s/10/ed/eb/85/photo1jpg.jpg", 8.5f));
		pizzaService.save(new Pizza("Campagnola", "mozzarella, pomodoro, funghi, prosciutto", "https://media-cdn.tripadvisor.com/media/photo-s/10/ed/eb/85/photo1jpg.jpg", 8.5f));
		pizzaService.save(new Pizza("Campagnola", "mozzarella, pomodoro, funghi, prosciutto", "https://media-cdn.tripadvisor.com/media/photo-s/10/ed/eb/85/photo1jpg.jpg", 8.5f));
		pizzaService.save(new Pizza("Campagnola", "mozzarella, pomodoro, funghi, prosciutto", "https://media-cdn.tripadvisor.com/media/photo-s/10/ed/eb/85/photo1jpg.jpg", 8.5f));
		pizzaService.save(new Pizza("Campagnola", "mozzarella, pomodoro, funghi, prosciutto", "https://media-cdn.tripadvisor.com/media/photo-s/10/ed/eb/85/photo1jpg.jpg", 8.5f));
		pizzaService.save(new Pizza("Campagnola", "mozzarella, pomodoro, funghi, prosciutto", "https://media-cdn.tripadvisor.com/media/photo-s/10/ed/eb/85/photo1jpg.jpg", 8.5f));
		pizzaService.save(new Pizza("Campagnola", "mozzarella, pomodoro, funghi, prosciutto", "https://media-cdn.tripadvisor.com/media/photo-s/10/ed/eb/85/photo1jpg.jpg", 8.5f));
		pizzaService.save(new Pizza("Campagnola", "mozzarella, pomodoro, funghi, prosciutto", "https://media-cdn.tripadvisor.com/media/photo-s/10/ed/eb/85/photo1jpg.jpg", 8.5f));
		pizzaService.save(new Pizza("Campagnola", "mozzarella, pomodoro, funghi, prosciutto", "https://media-cdn.tripadvisor.com/media/photo-s/10/ed/eb/85/photo1jpg.jpg", 8.5f));
		pizzaService.save(new Pizza("Campagnola", "mozzarella, pomodoro, funghi, prosciutto", "https://media-cdn.tripadvisor.com/media/photo-s/10/ed/eb/85/photo1jpg.jpg", 8.5f));
		pizzaService.save(new Pizza("Campagnola", "mozzarella, pomodoro, funghi, prosciutto", "https://media-cdn.tripadvisor.com/media/photo-s/10/ed/eb/85/photo1jpg.jpg", 8.5f));
		pizzaService.save(new Pizza("Campagnola", "mozzarella, pomodoro, funghi, prosciutto", "https://media-cdn.tripadvisor.com/media/photo-s/10/ed/eb/85/photo1jpg.jpg", 8.5f));
		pizzaService.save(new Pizza("Campagnola", "mozzarella, pomodoro, funghi, prosciutto", "https://media-cdn.tripadvisor.com/media/photo-s/10/ed/eb/85/photo1jpg.jpg", 8.5f));
		pizzaService.save(new Pizza("Campagnola", "mozzarella, pomodoro, funghi, prosciutto", "https://media-cdn.tripadvisor.com/media/photo-s/10/ed/eb/85/photo1jpg.jpg", 8.5f));
		pizzaService.save(new Pizza("Campagnola", "mozzarella, pomodoro, funghi, prosciutto", "https://media-cdn.tripadvisor.com/media/photo-s/10/ed/eb/85/photo1jpg.jpg", 8.5f));
		
		//ROLES
		Role roleUser = new Role("USER");
		Role roleAdmin = new Role("ADMIN");
		Role roleGod = new Role("GOD");
		
		roleService.save(roleUser);
		roleService.save(roleAdmin);
		roleService.save(roleGod);
		
		String psw = AuthConf.passwordEncoder().encode("password");
		
		User florianaUser = new User("florianaUser", psw, roleUser);
		User florianaAdmin = new User("florianaAdmin", psw, roleAdmin);
		User florianaGod = new User("florianaGod", psw, roleGod);
		
		userService.save(florianaUser);
		userService.save(florianaAdmin);
		userService.save(florianaGod);
	}

}
