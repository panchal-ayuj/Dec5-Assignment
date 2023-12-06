public class Main2 {
    public static void main(String[] args) {
        InefficientHashMap mp = new InefficientHashMap();
        mp.put("Name", "Ayuj");
        mp.put("City", "Ahmedabad");
        mp.put("DOB", "27th Nov");
        System.out.println(mp.get("Name"));
        System.out.println(mp.get("City"));
        System.out.println(mp.get("DOB"));
    }
}
