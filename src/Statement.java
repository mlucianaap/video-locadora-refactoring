import java.util.Enumeration;

public abstract class Statement {
	public abstract String statement(Enumeration rentals, Customer customer);

	public String value(Customer aCustomer) {
      return this.statement(aCustomer.getRentals(), aCustomer);
   }
}
