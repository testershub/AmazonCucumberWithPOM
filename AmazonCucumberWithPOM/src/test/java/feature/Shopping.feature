Feature: Shopping at amazon

  @Books_shopping
  Scenario: Add three book into cart and do cart operations
    Given user is on amazon page
    When user search Experiences of Test Automation: Case Studies of Software Test Automation book name
    And click on search icon
    And click on Experiences of Test Automation: Case Studies of Software Test Automation book name
    And click on add to cart button
    And user searched for Agile Testing: A Practical Guide for Testers and Agile Teams book name
    And click on search icon
    And click on paperback option and click on All Buying option button for agile book
    And click on add to cart button for agile
    And user searched for Selenium WebDriver 3 Practical Guide: End-to-end automation testing for web and mobile browsers with Selenium WebDriver, 2nd Edition book name
    And click on search icon
    And click on paperback option and click on All Buying option button for selenium webdriver book
    And click on add to cart button for selenium webdriver
    And click on cart icon
    And click on Delete option for Agile Testing: A Practical Guide for Testers and Agile Teams book
    And click on Save For Later option for Experiences of Test Automation: Case Studies of Software Test Automation book
    And increse the quantity to three for Selenium WebDriver 3 Practical Guide: End-to-end automation testing for web and mobile browsers with Selenium WebDriver, 2nd Edition book
    And click on gift checkox for Selenium WebDriver 3 Practical Guide: End-to-end automation testing for web and mobile browsers with Selenium WebDriver, 2nd Edition book
    Then user should be able to see the appropriate books added with selected quantity
