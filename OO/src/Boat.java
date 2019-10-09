public class Boat {
	private String name;
        public  String getName() {
	    return name;
	}
        public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "Boat [name=" + name + "]";
	}

	public Boat(String name) {
		this.name = name;
	}
}
