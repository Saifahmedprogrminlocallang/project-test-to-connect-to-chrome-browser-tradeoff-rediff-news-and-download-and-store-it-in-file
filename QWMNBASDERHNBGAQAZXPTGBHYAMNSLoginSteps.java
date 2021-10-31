package StepDefinition;

import java.io.*;
import java.lang.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import NewutilityStepDefinitions.CommonHBDSQAXCVBwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import java.util.concurrent.*;

public class QWMNBASDERHNBGAQAZXPTGBHYAMNSLoginSteps{

        WebDriver DDDDCatxcdemnacxvtbrowserfilechrometabdriver;
        
public int connectsocketfileopenbrowser() throws InterruptedException {

        int icntrrqmnabk;
        icntrrqmnabk=11;
        
        CommonHBDSQAXCVBwebdriver VBRPJYTRAQWERBVGHYUOJSDFGHYUIONMPDriver = new CommonHBDSQAXCVBwebdriver();
        DDDDCatxcdemnacxvtbrowserfilechrometabdriver=VBRPJYTRAQWERBVGHYUOJSDFGHYUIONMPDriver.driver();
        
        DDDDCatxcdemnacxvtbrowserfilechrometabdriver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
        
        WebElement fivesixsevenelement1 = DDDDCatxcdemnacxvtbrowserfilechrometabdriver.findElement(By.xpath("//span[@class='news_container']"));
        
        String descriptionfivesixsevenelementonetwothree1 = fivesixsevenelement1.getText();
        System.out.println("descriptionfivesixsevenelement"+descriptionfivesixsevenelementonetwothree1);

        
        if (descriptionfivesixsevenelementonetwothree1!=null) {
                icntrrqmnabk=917101;    
        }
        
        int descriptionfivesixsevenelementonetwothree1intcounter;
        descriptionfivesixsevenelementonetwothree1intcounter=0;

       while(descriptionfivesixsevenelementonetwothree1intcounter<=4) {
        
                fivesixsevenelement1 = DDDDCatxcdemnacxvtbrowserfilechrometabdriver.findElement(By.xpath("//span[@class='news_container']"));
                
                descriptionfivesixsevenelementonetwothree1 = fivesixsevenelement1.getText() + "\n" + descriptionfivesixsevenelementonetwothree1;
                descriptionfivesixsevenelementonetwothree1intcounter=descriptionfivesixsevenelementonetwothree1intcounter+1;
                                
        }
                
        if (descriptionfivesixsevenelementonetwothree1.equals("rediffmail")) {
                System.out.println("descriptionfivesixsevenelement"+"class element cell topicons sample found  :/ #-"+descriptionfivesixsevenelementonetwothree1);
        }
        
        System.out.println("descriptionfivesixsevenelement"+descriptionfivesixsevenelementonetwothree1);
  
        try {
            String trqwerpomndescriptionfivesixsevenelementworkoutputfilestr = "D:\\FSBBWbServerEnterDatadescriptionfivesixsevenelementtadakatouttestratkada2Outputfileexcelsheetnew947119429741144254119\\tarapadakayetiyameyamiposoOutputfilesheetnew9471194297411442875319876199531.tad";

                  int strheaderdbflag=0;
                          try {
                                  
                                BufferedWriter descriptionfivesixsevenelementtadakatouttestratkada2 = null;
                                descriptionfivesixsevenelementtadakatouttestratkada2 = new BufferedWriter(new FileWriter(trqwerpomndescriptionfivesixsevenelementworkoutputfilestr));
                                descriptionfivesixsevenelementtadakatouttestratkada2.append("news :/");
                                descriptionfivesixsevenelementtadakatouttestratkada2.append(descriptionfivesixsevenelementonetwothree1);
                                descriptionfivesixsevenelementtadakatouttestratkada2.close();
                          }
                          catch (FileNotFoundException dsdfthgrqwerse) {
                                  dsdfthgrqwerse.printStackTrace();
                          }
                  }
                  catch (Exception sdpoqazmnsef) {
                          sdpoqazmnsef.printStackTrace();
                  }

        return icntrrqmnabk;
}       
}

