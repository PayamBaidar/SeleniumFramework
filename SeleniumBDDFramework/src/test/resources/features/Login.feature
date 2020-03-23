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


  #@Nigative:
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
