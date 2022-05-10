package resources.testdata;

import org.testng.annotations.DataProvider;

/**
 * Created by Jay
 */
public class TestData {


    @DataProvider(name = "Job criteria")
    public Object [][] getData (){

        Object [][] data = new Object[][]{

                {"Tester","Harrow","up to 5 miles","30000","50000","Per annum","Permanent","Permanent Tester jobs in Harrow on the Hill"},
                {"Receptionist","Watford","up to 7 miles","20000","23000","Per annum","contract","Temporary jobs in Watford"},
                {"Electrician","Wembley","up to 5 miles","500","1000","Per day","Temporary","Temporary jobs in Brent Area"},
                {"Data Specialist","Birmingham","up to 15 miles","40000","55000","Per annum","Permanent","Permanent jobs in West Midlands"},
                {"Credit Controller","Bromsgrove","up to 20 miles","23000","25000","Per annum","Permanent","Permanent banking jobs in Worchestershire"},
                {"Mortgage Advisor","Dartford","up to 25 miles","30000","80000","Per annum","Permanent","Permanent Tester jobs in Kent"},
                {"Pensions Manager","Milton Keynes","up to 35 miles","450000","60000","Per annum","Permanent","Permanent jobs in Buckinghamshire"},
        };
        return data;
    }

}
