package ru.skillfactory;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    public ChromeDriver driver;


    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/ekuri/Downloads/chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("test start");
    }

    @Test
    public void firstTest() {
        driver.get("https://skillfactory.ru/");
        String title = driver.getTitle();
        Assert.assertFalse(title.equals("SkillFactory — ваш прямой путь в IT-профессии"));}

    @Test
    public void firstTest2() {
        driver.get("https://skillfactory.ru/");
        String title = driver.getTitle();
        Assert.assertFalse(title.equals("Преподаватели и менторы — сотрудники ведущих компаний"));
    }

    @Test
    public void firstTest4() {
        driver.get("https://skillfactory.ru/");
        String title = driver.getTitle();
        Assert.assertFalse(title.equals("Выберите направление в IT"));
    }

    @Test
    public void firstTest3() {
        driver.get("https://skillfactory.ru/");

    }

    @After
    public void close() {
        System.out.println("test closed");
        driver.quit();
    }











}
