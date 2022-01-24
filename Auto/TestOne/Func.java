package Auto.TestOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class Func {

    public static ChromeDriver driver;
    public static WebDriverWait wait;

    // 初始化浏览器
    public static void initBroeser() {
        System.setProperty("webdriver.chrome.driver", "D://JetBrains//IntelliJ IDEA 2021.3//chromedriver.exe");
        driver.get("http://dd.yixx.cn/respj_fz/h5pj/index.html#/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
    }

    // 登录
    public static void login() {
        initBroeser();
        driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).sendKeys("999901016002M");
        driver.findElement(By.cssSelector(".el-form-item:nth-child(2) .el-input__inner")).sendKeys("16002M");
        driver.findElement(By.cssSelector(".button")).click();
    }


    // 等待元素可被点击
    public static void waitFor(WebElement element) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    // 判断元素是否存在
    public static boolean isExist(WebElement element) {
        try {
            waitFor(element);
            element.isDisplayed();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static CharSequence shijian() {
        // 创建一个data format对象
        DateFormat dateFormat = new SimpleDateFormat("yyMMdd_HHmmss");
        Date date = new Date(); // 获取当前时间
        String date1 = dateFormat.format(date);
        System.out.println(date1);
        return date1;
    }

}
