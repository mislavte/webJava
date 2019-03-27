package hr.java.web.teskera.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class Expense {

	@NotEmpty(message = "Niste unijeli naziv troška.")
	@Size(min = 2, max = 35, message = "Naziv mora imati između 2 i 35 znakova.")
	private String name;

	@NotNull(message = "Niste unijeli iznos.")
	@DecimalMin(value = "0.01", message = "Minimalan iznos je 0.01.")
	private BigDecimal amount;

	@NotNull(message = "Odaberite vrstu troška. Smjesta!")
	private ExpenseType expenseType;
	
	public static enum ExpenseType {
		
		FOOD,
		DRINKS,
		WASTING_MONEY_ON_STUFF_YOU_DONT_NEED
		
	}
}
