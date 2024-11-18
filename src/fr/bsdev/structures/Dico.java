package fr.bsdev.structures;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import java.util.Set;
/**
 * This class is used to manipulate a dictionary.
 * the key is an object.
 * the value is a list of objects.
 * 
 * @param <K> - the type of keys maintained by this dico
 * @param <V> - the type of mapped values
 */
public class Dico<K, V> {
    
   private HashMap<K, List<V>> hashMap = new HashMap<>();
    
    
    /**
     * This constructor allows instantiating an empty dictionary.
     * 
     * @author Barois Stephane
	 * date   2023-12-12
	 * @version 1.0 
     */
	public Dico() {
		super();
	
	}
	/**
	 * This constructor allows you to create a dictionary with a value entry.
	 * <pre>
	 * <b> Example </b>
	 * Dico&lt;String, String&gt; dico = new Dico("Ford","Fiesta");
	 * System.out.println(dico.getDico());
	 * 
	 * <b> Result :</b>
	 * {Ford=[Fiesta]}
	 * </pre>
	 * @author Barois Stephane
	 * date   2023-12-12
	 * @version 1.0 
	 * @param key  - key with which the specified value is to be associated 
	 * @param value - value to be associated with the specified key
	 */
	public Dico(K key, V value) {
		super();
		List<V> lst = new ArrayList<>();
		lst.add(value);
		this.hashMap.put(key,lst);
		
	}
	/**
	 * This contructor allows to create an entry composed of a list of values.
	 * <pre>
	 * <b> Example </b>
	 * 
	 * String tabpeugeot[] = {"1007","1008","2008","3008"};
	 * 
	 * List&lt;String&gt; peugeot = new ArrayList&lt;&gt;();
	 * 
	 * for(String s:tabpeugeot)
	 * 		peugeot.add(s);
	 * 
	 * Dico&lt;String, String&gt; dico = new Dico("Peugeot",tabpeugeot);
	 * System.out.println(dico.getDico());
	 * 
	 * <b>Result :</b>
	 * {Peugeot=[1007, 1008, 2008, 3008]}
	 * </pre>
	 * @author Barois Stephane
	 * date   2023-12-12
	 * @version 1.0 
	 * @param key  - key with which the specified value is to be associated 
	 * @param values - array values to be associated with the specified key
	 */
	public Dico(K key, V[] values) {
		super();
		List<V> lst = new ArrayList<>();
		for(V el:values )
			lst.add(el);
		this.hashMap.put(key, lst);
		
	}
    

	/**
	 * This method adds a new entry to the dictionary.
	 * <pre>
	 * <b>Example </b>
	 * 
	 * Dico&lt;String, String&gt; dico = new Dico();
	 * dico.put("Ford", "Fiesta");
	 * System.out.println(dico.getDico());
	 * 
	 * <b>Result:</b>
	 * {Ford=[Fiesta]}
	 * </pre>
	 * @author Barois Stephane
	 * date   2023-12-12
	 * @version 1.0 
	 * @param key  - key with which the specified value is to be associated 
	 * @param value - value to be associated with the specified key
	 */
	public void put(K key, V value) {
		List<V> lstvalues = new ArrayList<>();
		//System.out.println(value);
		lstvalues.add(value);
		this.hashMap.put(key,lstvalues);
	
	}
	
	
	/**
	 * This method adds a new entry to the dictionary.
	 * <pre>
	 * <b>example:</b>
	 * 
	 * String tabpeugeot[] = {"1007","1008","2008","3008"};
	 * String tabrenault[] = {"clio","megane","espace"};
	 * List&lt;String&gt; peugeot = new ArrayList&lt;&gt;();
	 * 
	 * for(String s:tabpeugeot)
	 * 		peugeot.add(s);
	 * 
	 * List&lt;String&gt; renault = new ArrayList&lt;&gt;();
	 * for(String s:tabrenault) {
	 * 		renault.add(s);
	 * 
	 * Dico&lt;String, String&gt; dico = new Dico("Peugeot",tabpeugeot);
	 * System.out.println(dico.getDico());
	 * 
	 * dico.put("Renault", tabrenault);
	 * System.out.println(dico.getDico());
	 * 
	 * <b>Result:</b>
	 * 
	 * {Peugeot=[1007, 1008, 2008, 3008]}
	 * {Renault=[clio, megane, espace], Peugeot=[1007, 1008, 2008, 3008]}
	 * </pre>
	 * @author Barois Stephane
	 * date   2023-12-12
	 * @version 1.0 
	 * @param key  - key with which the specified value is to be associated 
	 * @param values - array values to be associated with the specified key
	 */
	public void put(K key, V[] values) {
		List<V> lstvalues = new ArrayList<>();
		for(V value:values)
			lstvalues.add(value);
		
		this.hashMap.put(key,lstvalues);
	
	}
	
	/**
	 * This method allows to add a value in the list corresponding to the key passed in parameter.
	 * If the key does not exist, this entry is added to the dictionary.
	 * <pre>
	 * <b>example:</b>
	 * 
	 * String tabpeugeot[] = {"1007","1008","2008","3008"};
	 * String tabrenault[] = {"clio","megane","espace"};
	 * List&lt;String&gt; peugeot = new ArrayList&lt;&gt;();
	 * 
	 * for(String s:tabpeugeot)
	 * 		peugeot.add(s);
	 * 
	 * List&lt;String&gt; renault = new ArrayList&lt;&gt;();
	 * for(String s:tabrenault) {
	 * 		renault.add(s);
	 * 
	 * Dico&lt;String, String&gt; dico = new Dico("Peugeot",tabpeugeot);
	 * dico.put("Renault", tabrenault);
	 * 
	 * dico.addValue("Renault", "KADJAR");
	 * System.out.println(dico.getDico());
	 * 
	 * dico.addValue("Fiat", "500");
	 * System.out.println(dico.getDico());
	 * 
	 * <b>Result:</b>
	 * 
	 * {Renault=[clio, megane, espace, KADJAR], Peugeot=[1007, 1008, 2008, 3008]}
	 * {Renault=[clio, megane, espace, KADJAR], Fiat=[500], Peugeot=[1007, 1008, 2008, 3008]}
	 * </pre>
	 * @author Barois Stephane
	 * date   2023-12-12
	 * @version 1.0 
	 * @param key  - key with which the specified value is to be associated 
	 * @param value - value to be associated with the specified key
	 */
	public void addValue(K key, V value) {
		if(this.keyExist(key)) {
			this.getValue(key).add(value);
			return;
		}else {
		    this.put(key, value);
		    return;
		}
			
		
	}
	/**
	 * This method checks if a key is in to the dictionary.
	 * <pre>
	 * <b>example:</b>
	 * 
	 * String tabpeugeot[] = {"1007","1008","2008","3008"};
	 * String tabrenault[] = {"clio","megane","espace"};
	 * List&lt;String&gt; peugeot = new ArrayList&lt;&gt;();
	 * 
	 * for(String s:tabpeugeot)
	 * 		peugeot.add(s);
	 * 
	 * List&lt;String&gt; renault = new ArrayList&lt;&gt;();
	 * for(String s:tabrenault) {
	 * 		renault.add(s);
	 * 
	 * Dico&lt;String, String&gt; dico = new Dico("Peugeot",tabpeugeot);
	 * dico.put("Renault", tabrenault);
	 * 
	 * 
	 * System.out.println("key Renault :"+dico.keyExist("Renault"));
	 * System.out.println("key Peugeot :"+dico.keyExist("Peugeot"));
	 * System.out.println("key Fiat :"+dico.keyExist("Fiat"));
	 * 
	 * <b>Result:</b>
	 * 
	 * key Renault :true
	 * key Peugeot :true
	 * key Fiat :false
	 * </pre>
	 * @author Barois Stephane
	 * date   2023-12-12
	 * @version 1.0
	 * @param key - key whose mapping is to be found in the dictionary
	 * @return    - return true value if this key is find 
	 */
	public boolean keyExist(K key) {
	   List<K> keys =  this.getKeys();
	   for(K k : keys) {
		   if (k.equals(key)) {
			   return true;
		   }
	   }
	   return false;
	}
	
	
	/**
	 * This method returns the list of keys.
	 * <pre>
	 * <b>example:</b>
	 * 
	 * String tabpeugeot[] = {"1007","1008","2008","3008"};
	 * String tabrenault[] = {"clio","megane","espace"};
	 * List&lt;String&gt; peugeot = new ArrayList&lt;&gt;();
	 * 
	 * for(String s:tabpeugeot)
	 * 		peugeot.add(s);
	 * 
	 * List&lt;String&gt; renault = new ArrayList&lt;&gt;();
	 * for(String s:tabrenault) {
	 * 		renault.add(s);
	 * 
	 * Dico&lt;String, String&gt; dico = new Dico("Peugeot",tabpeugeot);
	 * dico.put("Renault", tabrenault);

	 * List&lt;String&gt; keys = dico.getKeys();
	 * 
	 * System.out.println(keys.toString());
	 * 
	 * <b>Result:</b>
	 * 
	 * [Renault, Peugeot]
	 * </pre>
	 * @author Barois Stephane
	 * date   2023-12-12
	 * @version 1.0 
	 * @return type List&lt;K&gt; - return the list of keys contained in the dictionnary
	 */
	public List<K> getKeys() {
		Set<K> keys = this.hashMap.keySet();
		List<K> keyList = new ArrayList<>();
		for(K key:keys)
			keyList.add(key);
		
		return keyList;
	}
	
	/**
	 * This method returns the list of values in the dictionary.
	 * <pre>
	 * <b>example:</b>
	 * 
	 * String tabpeugeot[] = {"1007","1008","2008","3008"};
	 * String tabrenault[] = {"clio","megane","espace"};
	 * List&lt;String&gt; peugeot = new ArrayList&lt;&gt;();
	 * 
	 * for(String s:tabpeugeot)
	 * 		peugeot.add(s);
	 * 
	 * List&lt;String&gt; renault = new ArrayList&lt;&gt;();
	 * for(String s:tabrenault) {
	 * 		renault.add(s);
	 * 
	 * Dico&lt;String, String&gt; dico = new Dico("Peugeot",tabpeugeot);
	 * dico.put("Renault", tabrenault);

	 * List&lt;String&gt; values= dico.getValues();
	 * 
	 * System.out.println(values.toString());
	 * 
	 * <b>Result:</b>
	 * 
	 * [[clio, megane, espace], [1007, 1008, 2008, 3008]]
	 * </pre>
	 * @author Barois Stephane
	 * date   2023-12-12
	 * @version 1.0  
	 * @return type List&lt;V&gt; - Returns the list of values for each key contained in the dictionary
	 */
	@SuppressWarnings({ "unchecked" })
	public List<V> getValues(){
		List<V> values = new ArrayList<>();
		for (K key : this.hashMap.keySet()) 
			values.add((V) this.hashMap.get(key));
		
		return  values;
		
	}
	
	/**
	 * This method returns the list of values corresponding to the key passed as a parameter.
	 * <pre>
	 * <b>example:</b>
	 * 
	 * String tabpeugeot[] = {"1007","1008","2008","3008"};
	 * String tabrenault[] = {"clio","megane","espace"};
	 * List&lt;String&gt; peugeot = new ArrayList&lt;&gt;();
	 * 
	 * for(String s:tabpeugeot)
	 * 		peugeot.add(s);
	 * 
	 * List&lt;String&gt; renault = new ArrayList&lt;&gt;();
	 * for(String s:tabrenault) {
	 * 		renault.add(s);
	 * 
	 * Dico&lt;String, String&gt; dico = new Dico("Peugeot",tabpeugeot);
	 * dico.put("Renault", tabrenault);
	 *
	 * System.out.println(dico.getValue("Renault"));
	 * System.out.println(dico.getValue("Peugeot"));
	 * 
	 * <b>Result:</b>
	 * 
	 * [clio, megane, espace]
	 * [1007, 1008, 2008, 3008]
	 * </pre>
	 * 
	 * @author Barois Stephane
	 * date   2023-12-12
	 * @version 1.0   
	 * @param key - key with which the specified value is to be associated 
	 * @return  - array values to be associated with the specified key
	 */
	public List<V> getValue(K key){
		return this.hashMap.get(key);
	}

	/**
	 * This method returns the dictionary.
	 * <pre>
	 * <b>example:</b>
	 * 
	 * String tabpeugeot[] = {"1007","1008","2008","3008"};
	 * String tabrenault[] = {"clio","megane","espace"};
	 * List&lt;String&gt; peugeot = new ArrayList&lt;&gt;();
	 * 
	 * for(String s:tabpeugeot)
	 * 		peugeot.add(s);
	 * 
	 * List&lt;String&gt; renault = new ArrayList&lt;&gt;();
	 * for(String s:tabrenault) {
	 * 		renault.add(s);
	 * 
	 * Dico&lt;String, String&gt; dico = new Dico("Peugeot",tabpeugeot);
	 * dico.put("Renault", tabrenault);
	 * 
	 * System.out.println(dico.getDico());
	 * 
	 * <b>Result:</b>
	 * 
	 * {Renault=[clio, megane, espace], Peugeot=[1007, 1008, 2008, 3008]}
	 * </pre>
	 * @author Barois Stephane
	 * date   2023-12-12
	 * @version 1.0  
	 * @return - Returns the dictionary
	 */
	public HashMap<K, List<V>> getDico() {
		return this.hashMap;
	}
	
	/**
	 * Deletes from this dictionary the mapping corresponding to the specified key, if present.
	 * 
	 * @param  key key whose mapping is to be removed from the map
	 * @return the value associated with key is deleted and returns the value 1 ,
	 *         if there is a mapping for key, otherwise returns -1
	 */
	public int remove(K key) {
		if(this.keyExist(key)) {
			this.hashMap.remove(key);
			return 1;
		}
		return -1;
	}
	
	/**
	 * Deletes all matches in this dictionary. The dictionary will be empty after this call.
	 */
	public void removeAll() {
		this.hashMap.clear();
	}
	
}
