package Auto.TestOne;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static Auto.TestOne.Func.shijian;

public class test {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D://JetBrains//IntelliJ IDEA 2021.3//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://dd1.yixx.cn/respj_fz/h5pj/index.html#/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        // 登录
        driver.findElements(By.className("el-input__inner")).get(0).sendKeys("999901016002M");
        driver.findElements(By.className("el-input__inner")).get(1).sendKeys("16002M");
        driver.findElement(By.className("el-button--primary")).click();
        // 跳转到创建考试页面
        driver.findElement(By.cssSelector("[class=\"f-pr f-toe\"]")).click();
        Thread.sleep(3000);
        // 显示等待，验证元素是否可被点击
        WebElement wait = new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.elementToBeClickable(By.linkText("创建考试")));
        wait.click();
        // 切换到创建考试表单
        driver.switchTo().frame("iframe");
        // 创建考试
//           driver.findElement(By.xpath("//*[@id=\"app\"]/div/form/div[2]/div/div/div/label[1]/span")).click(); // 考试方式
//           driver.findElement(By.xpath("//*[@id=\"app\"]/div/form/div[3]/div/div/div/label[1]/span")).click(); // 阅卷方式
//           driver.findElement(By.xpath("//*[@id=\"app\"]/div/form/div[2]/div/div/div/label[1]/span")).click(); // 考试方式
        WebElement grade = driver.findElement(By.xpath("//*[@id=\"app\"]/div/form/div[4]/div/div/div/div/input")); // 年级
//        grade.click();
        WebElement type = driver.findElement(By.xpath("//*[@id=\"app\"]/div/form/div[5]/div/div/div/div[1]/input"));
        type.click();
        driver.findElements(By.xpath("/html/body/div[3]/div[1]/div[1]/ul/li")).get(1).click();  // 类型
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[1]/div/div[3]/table/tbody/tr[1]/td[1]/div/label/span/span")).click(); // 科目选择语文
        // 下拉页面到底端
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
        driver.findElement(By.cssSelector("body > div.el-dialog__wrapper > div > div.el-dialog__body > div > div.footBtn.el-col.el-col-24 > button")).click(); // 点击“确定”按钮

        driver.findElement(By.cssSelector("[placeholder=\"请输入内容\"]")).sendKeys(shijian() + grade.getText() + type.getText());
        driver.findElement(By.cssSelector("#app > div > form > div.footBtn.el-col.el-col-24 > button")).click(); // 点击“提交”按钮
        System.out.println("脚本运行成功");

        Thread.sleep(3000);
        driver.quit();

        }

    }



