package stepDefinition;

import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class DatatestStepDef {

	@Given("I want to automate flows with json data firstName and lastName")
	public void i_want_to_automate_flows_with_json_data_firstName_and_lastName(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    
		Map<String,String> dataValues = dataTable.asMap(String.class, String.class);
		
		//System.out.println("Size of data table:"+dataValues.size());
		
		System.out.println(""+dataValues.get(1));
		
		/*
		 * foreach(String name: dataValues) {
		 * 
		 * 
		 * 
		 * }
		 */
		
		
	}

	@Given("enjoy the automation")
	public void enjoy_the_automation() {
	    
	    
	}

	@When("I automate the flow")
	public void i_automate_the_flow() {
	    
	}

	@Then("I print json data")
	public void i_print_json_data() {
	    
	}
}
