  Feature: Filtering UI and extracting data for comparison successfully
 Scenario:data comparison
   Given a user navigates on the URL
   When a user clicks on sets row
   And a user select rows to 20
   And a user clicks on filter
   And a user clicks on Algorith
   And a user clicks on PoW
   And a user clicks on + Add Filter
   And a user clicks on toggle Mineable
   And a user selects All cryptocurrencies
   And a user selects Coins
   And a user selects price and set min value 100 and max value to 10000
   Then a user can conpare page content to the content in step 3


