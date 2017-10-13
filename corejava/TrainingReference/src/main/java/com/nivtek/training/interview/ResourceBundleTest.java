package com.nivtek.training.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import junit.framework.Assert;

public class ResourceBundleTest {
         public static void main(String[] args) {
           ResourceBundle rb1 = ResourceBundle.getBundle("ApplicationResources", Locale.UK);
           System.out.println(rb1.getString("save.button"));
           System.out.println(rb1.getString("delete.button"));
           System.out.println(rb1.getString("reset.button"));
     
           ResourceBundle rb2 = 
               ResourceBundle.getBundle("ApplicationResources", Locale.CANADA_FRENCH);
          System.out.println(rb2.getString("save.button"));
          System.out.println(rb2.getString("reset.button"));
          
          Assert.assertEquals(true, true);
          Assert.assertTrue("will not come here", true);
        }
    }