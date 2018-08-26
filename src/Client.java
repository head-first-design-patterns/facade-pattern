public class Client {
    Terraform terraform;
    public Client(Terraform terraform){
        this.terraform = terraform;
    }

    public void useTerraform() {
        //Client is decoupled from the complexities of underlying subsystems. It only interacts with plan and apply methods
        System.out.println("Creating plan\n");
        String plan = terraform.plan();

        System.out.println("Applying plan\n");
        terraform.apply(plan);
    }
}
