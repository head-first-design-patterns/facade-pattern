public class TerraformCI {
    public static void main(String[] args) {
        InternalModules internalModules = new InternalModules();
        InternalProviders internalProviders = new InternalProviders();
        SecretVariables secretVariables = new SecretVariables();

        TerraformFacade terraformFacade = new TerraformFacade(internalProviders, internalModules, secretVariables);

        Client client = new Client(terraformFacade);

        System.out.println("Client will now use terraform to apply infra level changes\n");
        client.useTerraform();
    }
}
