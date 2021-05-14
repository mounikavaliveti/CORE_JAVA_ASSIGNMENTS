
public class PersistanceTest {

	public static void main(String[] args) {
		Persistance p = new FilePersistance();
		p.persist();
		Persistance p1 = new DatabasePersistance();
		p1.persist();
		

	}

}
