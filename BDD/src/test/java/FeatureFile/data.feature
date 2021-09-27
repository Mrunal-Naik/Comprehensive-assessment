Feature: Check functionality of UrbanLadder website 

Scenario Outline: Check User Login 
Given User opens the Browser 
And Navigated to "https://www.urbanladder.com/" 
And Click on Login Button 
When User login into account using valid and invalid <username> and <password>
Then Check if the user is logged in the account
And Close the Browser
Examples:
|username                 | password     |
|datatesting288@gmail.com | Testing@288  |
|invalidusername@gmail.com| Testing      |

Scenario: Check the wishlist of the website 
Given User opens the Browser 
And Navigated to "https://www.urbanladder.com/" 
And Login with valid "datatesting288@gmail.com" and "Testing@288" 
When user navigate to the product 
And add to wishlist 
Then product is displayed in wishlist
And check if we can remove the product again
Then See the product is removed 
And Close the Browser 

Scenario: Check the Shopping Cart of the website
Given User opens the Browser 
And Navigated to "https://www.urbanladder.com/"
When user navigate to the glassware
And add in the cart
Then product is displayed in the cart
And Close the Browser 

Scenario: Check the compare funtion is working in website
Given User opens the Browser
And Navigated to "https://www.urbanladder.com/"
When user is navigate to the bookshelf 
And compare the product 
Then product is compared
And Close the Browser 

Scenario: Check the all the filter works for Bed 
Given User opens the Browser
And Navigated to "https://www.urbanladder.com/"
When user is navigate to the DoubleBed 
And check the filter 
Then only product with that specification is displayed
And Close the Browser

Scenario: Check all the expensive Gaming Chair on the Website
Given User opens the Browser
And Navigated to "https://www.urbanladder.com/"
When user navigate to the gaming chairs
And check the highest price range 
Then product with that price range is displayed
And Close the Browser

Scenario: Check the address of store in mumbai 
Given User opens the Browser
And Navigated to "https://www.urbanladder.com/"
When user navigate to the stores and select mumbai 
Then correct address and email ID is displayed 
And Close the Browser

Scenario: Check WoodenSofa on the Website 
Given User opens the Browser
And Navigated to "https://www.urbanladder.com/"
When user is navigate to the woodensofa 
And filter to Low to high 
Then grab the name and price of the sofa
And Close the Browser

Scenario: Check WoodenSofa on the Website 
Given User opens the Browser
And Navigated to "https://www.urbanladder.com/"
When user navigate to multiple page
Then note the number of product at the end
And Close the Browser

Scenario: Check WoodenSofa on the Website 
Given User opens the Browser
And Navigated to "https://www.urbanladder.com/"
When user is navigate to kidsbookshelf
And click on one product
Then grab the name and price of product
And Close the Browser







 
