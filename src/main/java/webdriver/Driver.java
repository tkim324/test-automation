package webdriver;

        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.edge.EdgeDriver;
        import org.openqa.selenium.firefox.FirefoxDriver;


public class Driver {

    private static WebDriver driver;
    private static String domain = "mantis.haeger-consulting.de/";
    public static String URL = String.format("https://%s:%s@%s", "mantis", "likemypet", domain);
    public static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();
    public static ThreadLocal<String> browserName = new ThreadLocal<>();



    public static WebDriver getDriver(){

        if (browserName.get()==null){
            browserName.set("chrome");
        }

        if (threadDriver.get()==null){

            switch (browserName.get()){

                case "firefox":
                    System.setProperty("webdriver.gecko.driver", "C:/Drivers/geckodriver.exe");
                    threadDriver.set(new FirefoxDriver());

                    break;
              /*  case "edge":
                    System.setProperty("webdriver.edge.driver", "C:/Drivers/msedgedriver.exe");
                    threadDriver.set(new EdgeDriver());
                    break;*/
                default:
                    System.setProperty("webdriver.chrome.driver","C:/Drivers/chromedriver.exe");
                    threadDriver.set(new ChromeDriver());
                    break;

            }

        } return threadDriver.get();
    }



    public static void quitDriver(){


        if (threadDriver.get()!=null){

            threadDriver.get().quit();
            WebDriver driver = threadDriver.get();
            driver=null;

            threadDriver.set(driver);
        }

    }

}
