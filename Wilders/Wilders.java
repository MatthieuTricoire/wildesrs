class Wilders {
  private String firstname;
  private boolean aware;

  public Wilders(String firstname, boolean aware) {
    this.firstname = firstname;
    this.aware = aware;
  }

  public String getName() {
    return this.firstname;
  }

  public boolean isAware() {
    return this.aware;
  }

  public String whoAmI() {
    return "Je m'appelle " + this.firstname + " et je suis " + (this.aware ? " aware." : " not aware.");
  }
}
