public class TerraformFacade implements Terraform{
    //Due to lack of interest, programmed to implementations instead of interfaces. Shabd pe mat jao, bhavnao ko samjho
    private InternalModules internalModules;
    private InternalProviders internalProviders;
    private SecretVariables secretVariables;

    public TerraformFacade(InternalProviders internalProviders, InternalModules internalModules, SecretVariables secretVariables) {
        this.internalModules = internalModules;
        this.internalProviders = internalProviders;
        this.secretVariables = secretVariables;
    }


    @Override
    public String plan() {
        String internalProviders = this.internalProviders.fetch();
        String internalModules = this.internalModules.fetch();
        String secretVariables = this.secretVariables.fetch();
        return "plan with " +
                "\ninternal modules: "  + internalModules +
                "\ninternal providers: "  + internalProviders +
                "\nsecret variables: " + secretVariables;
    }

    @Override
    public void apply(String plan) {
        System.out.println("Applied plan: \n" + plan);

    }
}
