public class Webdriver2  implements Webdriver{

    public Webdriver2(){
        System.out.println("launch chrome browser");

    }

    @Override
    public void get(String url) {
        System.out.println("Launch url " + url);

    }

    @Override
    public void quit() {
        System.out.println("close the browser");

    }
}
