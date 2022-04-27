package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {

	public static WebDriver driver;

	public void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public void loadUrl(String url) {
		driver.get(url);
	}

	public void maximize() {
		driver.manage().window().maximize();
	}

	public void type(WebElement element, String data) {
		element.sendKeys(data);
	}

	public void click(WebElement element) {
		element.click();
	}

	public void quit() {
		driver.quit();
	}

	public WebElement findLocatorById(String data) {
		WebElement element = driver.findElement(By.id(data));
		return element;
	}

	public WebElement findLocatorByName(String data) {
		WebElement element = driver.findElement(By.name(data));
		return element;
	}

	public WebElement findLocatorByXpath(String data) {
		WebElement element = driver.findElement(By.xpath(data));
		return element;
	}
	public void sendKeys(WebElement element) {
		element.sendKeys("data");
		
	}
	

	public String getText(WebElement element) {
		String data = element.getText();
		return data;
	}

	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	public String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public String getAttribute(WebElement element) {
		String data = element.getAttribute("value");
		return data;
	}

	public String getAttribute(WebElement element, String attributeName) {
		String name = element.getAttribute(attributeName);
		return name;
	}

	public void alert() {
		Alert al = driver.switchTo().alert();
		al.accept();

	}

	public void selectoptionByVisible(WebElement element, String data) {

		Select select = new Select(element);
		select.selectByVisibleText(data);
	}

	public void selectoptionByText(WebElement element, String data) {
		Select select = new Select(element);
		select.selectByVisibleText(data);
	}

	public void selectOptionByIndex(WebElement element, int intex) {
		Select select = new Select(element);
		select.selectByIndex(intex);
	}

	public void selectOptionByValue(WebElement element, String data) {
		Select select = new Select(element);
		select.selectByValue(data);
	}

	public void typeJs(WebElement element, String data) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setAttribute('value')'" + data + "')", element);
	}

	public String getData(String sheetName, int rowNo, int cellNo) throws IOException {
		String data = null;
		File file = new File("C:\\Users\\Admin\\eclipse-workspace\\Frameworkday1\\Excel-day2\\Adactin Task.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		org.apache.poi.ss.usermodel.Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		int type = cell.getCellType();

		if (type == 1) {
			data = cell.getStringCellValue();
		}
		if (type == 0) {
			if (DateUtil.isCellDateFormatted(cell)) {
				java.util.Date date = cell.getDateCellValue();
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
				data = dateFormat.format(date);
			} else {
				double d = cell.getNumericCellValue();
				long l = (long) d;
				data = String.valueOf(l);

			}

		}
		return data;

	}

	public String updateData(String sheetName, int rowNo, int cellNo, String newdata) throws IOException {
		String data = null;

		File file = new File("C:\\Users\\Admin\\eclipse-workspace\\Frameworkday1\\Excel-day2\\Adactin Task.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		org.apache.poi.ss.usermodel.Row row = sheet.getRow(rowNo);
		Cell createCell = row.createCell(cellNo);
		createCell.setCellValue(newdata);
		FileOutputStream newData1 = new FileOutputStream(file);
		workbook.write(newData1);

		return data;

	}
	private void abc() {
System.out.println("practice");
	}
	private void bc() {
		System.out.println("8825");

	}
	private void meth() {
System.out.println("lenevo");


	}
	
	private void nwgit() {
System.out.println("git");
	}
	

}
