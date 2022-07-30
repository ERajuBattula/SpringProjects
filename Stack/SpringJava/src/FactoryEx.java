public class FactoryEx {
	interface GreetingService {
		void greet(String name);
	}
	static class OdiyaGreetingService implements GreetingService {
		@Override
		public void greet(String name) {
			// TODO Auto-generated method stub
			System.out.println("Juhar " + name);
		}
	}
	static class HindiGreetingService implements GreetingService {
		@Override
		public void greet(String name) {
			// TODO Auto-generated method stub
			System.out.println("Namaste " + name);
		}
	}
	static class GreetFactory {
		GreetingService getGreetingService(String FactoryLang) {
			try {
				if (FactoryLang == "Odiya") {
					return new OdiyaGreetingService();
				} else if (FactoryLang == "Hindi") {
					return new HindiGreetingService();
				}
			} catch (RuntimeException e) {
				throw new RuntimeException("Invalid language");
			}
			return null;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GreetFactory obj = new GreetFactory();
		GreetingService service = obj.getGreetingService("Odiya");
		service.greet("Anuj");
	}
}
