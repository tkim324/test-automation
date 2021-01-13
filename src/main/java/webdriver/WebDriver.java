package webdriver;

        import org.junit.After;
        import org.junit.Before;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.firefox.FirefoxDriver;

        import java.util.concurrent.TimeUnit;

public abstract class WebDriver {

    protected static org.openqa.selenium.WebDriver driver;
    protected static String browser = "chrome";
    protected static String URL = "https://mantis:likemypet@mantis.haeger-consulting.de/";

    //protected static String browser = "firefox";
    //protected static String domain = "mantis.haeger-consulting.de/";
    //protected static String URL = String.format("https://%s:%s@%s", "mantis", "likemypet", domain);

    @Before
    public void setUp() {
        setProperty();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); //before it throws a "No Such Element Exception".
    }

    @After
    public void tearDown() {
        //driver.quit();
    }

    public static void setProperty() {

        if (browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equals("FF")) {
            System.setProperty("webdriver.gecko.driver", "C:/Drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }
    }

    public void navigateUrl(String URL) {
        driver.get(URL);

    }
}


