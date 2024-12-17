public class Classroom {
  public static void main(String[] args) {
    Wilders jc = new Wilders("Jean-Claude", true);
    Wilders henry = new Wilders("Henry", false);

    System.out.println(jc.whoAmI());
    System.out.println(henry.whoAmI());
  }

}
