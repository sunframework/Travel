Feature: Book the flight

  @SystemTest
  Scenario Outline: Book the flight from Portland to Rome using Lufthansa Airlines
    Given user selects the "<departure>" and the "<destination>" location using "<Browser>"
    When user enters the details and chooses the flight
    Then order id should be generated

    Examples:
    |departure|destination|Browser|
    |Portland    |Rome    |Chrome |