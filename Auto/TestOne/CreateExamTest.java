package Auto.TestOne;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CreateExamTest {

  private WebDriver driver;
  JavascriptExecutor js;

  @Before
  public void setUp() throws InterruptedException {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    // 登录
    login();
    System.out.println("登录成功了");
    Thread.sleep(5000);
    System.out.println("开始创建考试");

  }

  @After
  public void tearDown() {

    driver.quit();

  }

  @Test
  public void testCreateExam() throws InterruptedException {

    driver.findElement(By.linkText("创建考试")).click();
    // 切换到创建考试表单
    driver.switchTo().frame(0);
    // 选择年级
    WebElement SlctGrade = driver.findElement(By.cssSelector(".el-col:nth-child(4) .el-input__inner"));
    isExist(SlctGrade);
    SlctGrade.click();
    WebElement gradeElemt = driver.findElement(By.cssSelector("body > div.el-select-dropdown.el-popper > div.el-scrollbar > div.el-select-dropdown__wrap.el-scrollbar__wrap > ul > li"));
    isExist(gradeElemt);
    String grade = gradeElemt.getText();
    gradeElemt.click();
    // 选择类型
    driver.findElement(By.cssSelector(".el-col:nth-child(5) .el-input__inner")).click();
    Thread.sleep(2000);
    WebElement typeElemt = driver.findElement(By.cssSelector(".el-select-dropdown__item:nth-child(3) > span"));
    String type = typeElemt.getText();
    typeElemt.click();
    // 选择科目
    driver.findElement(By.cssSelector(".el-form-item__content > .el-button > span")).click();
    driver.findElement(By.cssSelector(".el-table__row:nth-child(1) .el-checkbox__inner")).click();
    driver.findElement(By.cssSelector(".el-table__row:nth-child(2) .el-checkbox__inner")).click();
    driver.findElement(By.cssSelector(".el-table__row:nth-child(3) .el-checkbox__inner")).click();
    driver.findElement(By.cssSelector(".footBtn:nth-child(2) span")).click();
//    driver.findElement(By.cssSelector(".footBtn > .el-button")).click();
    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//    driver.findElement(By.cssSelector(".el-form-item__content > .el-input > .el-input__inner")).click();
    // 输入考试名称
    WebElement testName = driver.findElement(By.cssSelector(".el-form-item__content > .el-input > .el-input__inner"));
    testName.clear();
    testName.sendKeys(Func.shijian() + grade + type);
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".footBtn span")).click();
    System.out.println("考试创建成功");

  }

  // 初始化浏览器
  public void initBrowser() {
    System.setProperty("webdriver.chrome.driver", "D://JetBrains//IntelliJ IDEA 2021.3//chromedriver.exe");
    driver.get("http://dd1.yixx.cn/respj_fz/h5pj/index.html#/login");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.manage().window().maximize();
  }

  // 登录
  public void login() {
    initBrowser();
    driver.findElement(By.cssSelector(".el-form-item:nth-child(1) .el-input__inner")).sendKeys("998888887002M");
    driver.findElement(By.cssSelector(".el-form-item:nth-child(2) .el-input__inner")).sendKeys("87002M");
    driver.findElement(By.cssSelector(".button")).click();
  }

  // 等待元素可被点击
  public void waitFor(WebElement element) {
    WebDriverWait wait;
    wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    wait.until(ExpectedConditions.elementToBeClickable(element));
  }

  // 判断元素是否存在
  public boolean isExist(WebElement element) {
    try {
      waitFor(element);
      element.isDisplayed();
      System.out.println("元素存在哦");
      return true;
    } catch (Exception e) {
      System.out.println("找不到元素");
      return false;
    }
  }
}