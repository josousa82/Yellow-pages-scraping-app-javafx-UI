package com.lastjavafxtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.ArrayList;

public class ScrapingBarClass implements Runnable {


    String local;
    String name;
    WebDriver webDriverChrome;
    ArrayList<String> results;

    public ScrapingBarClass(String local, String name) {
        this.local = local;
        this.name = name;

//        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
//        webDriverChrome = new ChromeDriver();
//        webDriverChrome.get("http://www.pbi.pai.pt/q/name/where/" + this.local + "/who/"
//                + this.name + "/?customerType=ALL&contentErrorLinkEnabled=false");

    }

    @Override
    public void run() {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments();
        webDriverChrome = new ChromeDriver(chromeOptions);

        try {
            webDriverChrome.get("http://www.pbi.pai.pt/q/name/where/" + this.name + "/who/"
                    + this.local + "/?customerType=ALL&contentErrorLinkEnabled=false");


            Thread.sleep(5000);

            System.out.println("task complete");

            webDriverChrome.close();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

//    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
//
//        WebDriver webDriverChrome = new ChromeDriver();
//
//       // ScrapingBarClass scrapingBarClass = new ScrapingBarClass("gondomar", "jose");
//
//        webDriverChrome.get("http://www.pbi.pai.pt/q/name/where/" + "gondomar" + "/who/"
//                + "jose" + "/?customerType=ALL&contentErrorLinkEnabled=false");
//    }
}
