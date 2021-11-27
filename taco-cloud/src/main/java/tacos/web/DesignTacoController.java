// tag::head[]
package tacos.web;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;
import tacos.Ingredient;
import tacos.Ingredient.Type;
import tacos.Taco;

/**
 * 控制器
 * 
 * TODO 处理HTTP Get请求 localhost:8080/design
 * 
 * @date 2021年10月31日
 * @author Keason
 */
@Slf4j // Simple Logging Facade for java 等同于生成private static final org.slf4j.Logger
@Controller // 识别成控制器，作为组件扫描的候选者。Spring会自动创建一个实例，并启用上下文
@RequestMapping("/design") // 处理HTTP Get请求
public class DesignTacoController {

//end::head[]

	/**
	 * 配置配料列表
	 * 
	 * @param model
	 */
	@ModelAttribute
	public void addIngredientsToModel(Model model) {

		List<Ingredient> ingredients = Arrays.asList(new Ingredient("FLTO", "Flour Tortilla", Type.WRAP),
				new Ingredient("COTO", "Corn Tortilla", Type.WRAP),
				new Ingredient("GRBF", "Ground Beef", Type.PROTEIN),
				new Ingredient("CARN", "Carnitas", Type.PROTEIN),
				new Ingredient("TMTO", "Diced Tomatoes", Type.VEGGIES),
				new Ingredient("LETC", "Lettuce", Type.VEGGIES),
				new Ingredient("CHED", "Cheddar", Type.CHEESE),
				new Ingredient("JACK", "Monterrey Jack", Type.CHEESE),
				new Ingredient("SLSA", "Salsa", Type.SAUCE),
				new Ingredient("SRCR", "Sour Cream", Type.SAUCE));

		Type[] types = Ingredient.Type.values();
		for (Type type : types) {
			model.addAttribute(type.toString().toLowerCase(), filterByType(ingredients, type));
		}
	}

	/**
	 * 主要的处理请求
	 * 
	 * @param model 模型
	 * @return
	 */
	@GetMapping
	public String showDesignForm(Model model) {
		model.addAttribute("design", new Taco());
		return "design";
	}

	// end::showDesignForm[]

	/*
	 * //tag::processDesign[]
	 * 
	 * @PostMapping public String processDesign(Design design) { // Save the taco
	 * design... // We'll do this in chapter 3 log.info("Processing design: " +
	 * design);
	 * 
	 * return "redirect:/orders/current"; }
	 * 
	 * //end::processDesign[]
	 */

	// tag::processDesignValidated[]
	@PostMapping
	public String processDesign(@Valid @ModelAttribute("design") Taco design, Errors errors, Model model) {
		if (errors.hasErrors()) {
			return "design";
		}

		// Save the taco design...
		// We'll do this in chapter 3
		log.info("Processing design: " + design);

		return "redirect:/orders/current";
	}

	// end::processDesignValidated[]

	// tag::filterByType[]
	private List<Ingredient> filterByType(List<Ingredient> ingredients, Type type) {
		return ingredients.stream()
				.filter(x -> x.getType().equals(type))
				.collect(Collectors.toList());
	}

	// end::filterByType[]
	// tag::foot[]
}
// end::foot[]
