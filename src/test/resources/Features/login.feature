Feature: verify to test login functionality

  Scenario: Verify to check user loggedin with correct credentials
    Given User enter URL and redirect on login page
    When User enters username and password
    And click on login button
    Then User nevigated to dasboard page of Admin

 # Scenario Outline: Verify to check user loggedin with correct credentials
 #   Given User enter URL redirected on logged in page
 #   When User enters <username> and <password>
 #   And click on login button
 #   Then User nevigated to dasboard page of Admin

#    Examples: 
 #     | username   | password  |
 #     | slashadmin | Slash@123 |
#      | user2      | pass2     |
