package Other;

public class CustomHashMap {
	private static final int SIZE = 50;
	Data hashtable[] = new Data[50];
	
	String put(String key, String value) {
		int hashvalue = key.hashCode() % SIZE;
		Data bucket = hashtable[hashvalue];
		if (bucket!=null) {
			Data prev_bucket = null;
			while(bucket!=null) {
				if (bucket.getKey().equals(key)) {
					String old_value = bucket.getValue();
					bucket.setValue(value);
					return old_value;
				}
				prev_bucket = bucket;
				bucket = bucket.next;
			}
			Data new_bucket = new Data(key,value);
			prev_bucket.next = new_bucket;
			return null;
		}
		else {
			Data new_bucket = new Data(key,value);
			hashtable[hashvalue] = new_bucket;
			return null;
		}
	}
	
	String get(String key) {
		int hashvalue = key.hashCode() % SIZE;
		Data bucket = hashtable[hashvalue];
		if (bucket==null) {
			return null;
		}
		else {
			while(bucket!=null) {
				if (bucket.getKey().equals(key)) {
					return bucket.getValue();
				}
				bucket = bucket.next;
			}
			return null;
		}
	}
}


class Data {
	String value;
	final String key;
	Data next;
	
	Data(String k, String v) {
		this.value = v;
		this.key = k;
		this.next = null;
	}
	
	public String getValue() {
		return this.value;
	}
	
	public String getKey() {
		return this.key;
	}
	
	public void setValue(String val){
		this.value = val;
	}
}
