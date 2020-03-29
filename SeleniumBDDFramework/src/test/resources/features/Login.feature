Feature: Login Featuer
    
    Background:
    Given the user is on URL"https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"


@Positave:
  Scenario: User is entering the valid value 
    Given the user is on Admin area demo Page
    When the user enter valued value in username"admin@yourstore.com" 
    And  the user enter valid value in password "admin"
    And  the user clicks on enter key
    Then the user succefully login on dashbordPage





# This Scenario should take the data from property file

  #@Nigative:
  #Scenario Outline: user is entering invalid value
    #Given the user is on Admin area demo Page
    #When  the user enter invalid in following fields
    #|userName | <userName> |
    #And   the user enter invalid in following fields
    #| password | <password> | 
    #Then  the following message display
#
    #Examples: 
      #| userName  | password | 
      #| name1		  |   235    | 
      #| name2     |   457    | 
      
      
      
      
      
 #Negative This Scenario should take data from Excel Sheet 
       
    #Scenario: User is entering the valid value 
    #Given the user is on Admin area demo Page
    #When the user enter valued value in username"admin@yourstore.com" 
    #And  the user enter valid value in password "admin"
    #And  the user clicks on enter key
    #Then the user succefully login on dashbordPage