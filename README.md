## Facade Pattern

Facade pattern provides a unified interface to a set of interfaces in a subsystem.
Facade defines a higher-level interface that makes the subsystem easier to use.

Use case of facades: Make the job of a client easier by hiding the unnecessary complexity of a subsystem

### Key principles:

- Facade pattern helps us implement the `principle of least knowledge` (law of demeter)
- A facade simplifies an interface for a client
- A facade decouples a client from a subsystem of components

### Understanding the code

- This is a simulation of implementing Terraform plan and apply in CI
- Most companies using TF internally run into a plethora of setup for running it in CI
- The setup includes fetching modules; fetching internal providers; setting up ssh for remote execution; and fetching secret variables
- The facade takes care of interacting with all these subsystems, in turn simplifying the interface
- Now the client only needs to call plan and execute

### Running the code

```
cd src/
javac TerraformCI.java
java TerraformCI

```