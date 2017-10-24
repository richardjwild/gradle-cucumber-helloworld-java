import cucumber.api.java8.En;

public class HelloWorldStepDefs implements En {

    public HelloWorldStepDefs() {
        Given("I have a cucumber file", () -> {
            System.out.format("Given I have a cucumber file");
        });

        When("I execute it", () -> {
            System.out.println("When I execute it");
        });

        Then("It prints hello world", () -> {
            System.out.println("Then it prints hello world. Here it comes:");
            System.out.println("Hello world!");
        });
    }
}
