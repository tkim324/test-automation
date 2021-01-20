package webdriver;

        import io.github.bonigarcia.wdm.WebDriverManager;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.edge.EdgeDriver;
        import org.openqa.selenium.firefox.FirefoxDriver;


public abstract class Driver {


    private static String browser = "chore";           //"firefox" and "edge" also supported

    private String domain = "mantis.haeger-consulting.de/";
    protected String URL = String.format("https://%s:%s@%s", "mantis", "likemypet", domain);
    protected WebDriver driver;
    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();
    private static ThreadLocal<String> browserName = new ThreadLocal<>();

    public Driver (){driver = getDriver();}

    public static WebDriver getDriver(){

        if (browserName.get() == null){
            browserName.set(browser);

        }

        if (threadDriver.get() == null){

            switch (browserName.get()){

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    threadDriver.set(new FirefoxDriver());
                    break;

                case "edge":
                    WebDriverManager.edgedriver().setup();
                    threadDriver.set(new EdgeDriver());
                    break;

                default:
                    WebDriverManager.chromedriver().setup();
                    threadDriver.set(new ChromeDriver());
                    break;

            }

        } return threadDriver.get();
    }



    public static void quitDriver(){

        if (threadDriver.get() != null){

            threadDriver.get().quit();
            WebDriver driver = threadDriver.get();
            driver = null;

            threadDriver.set(driver);
        }

    }

}
