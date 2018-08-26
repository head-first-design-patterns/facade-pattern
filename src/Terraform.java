public interface Terraform {
    public String plan();

    public void apply(String plan);
}
