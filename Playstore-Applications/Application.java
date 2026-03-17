class Application {
    int appId;
    String appName;
    String appCategory;

     public Application(int appId, String appName, String appCategory) {
        this.appId = appId;
        this.appName = appName;
        this.appCategory = appCategory;
    }

    public void displayAppInfo() {
        System.out.println("Application Id : " + this.appId);
        System.out.println("Application Name : " + this.appName);
        System.out.println("Application Category : " + this.appCategory);
    }
}
