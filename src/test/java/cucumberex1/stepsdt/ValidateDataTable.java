package cucumberex1.stepsdt;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

public class ValidateDataTable {

	@Given("print the values in the below data table")
	public void print_the_values_in_the_below_data_table(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    List<List<String>> data = dataTable.asLists();
	    for(List<String> l : data) {
	    	for(String s : l) {
	    		System.out.println(s);
	    	}
	    }
	}
}
