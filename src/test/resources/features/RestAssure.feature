
Feature: Site is working?
  Everybody wants to know site is working

  @Smoke
  Scenario: Site is working
    Given user has site url "https://www.pravda.com.ua/"
    When get query by this link
    Then The site should receive a response with a status code equal to 200

