# Verify CEP

## 📄 Description

Verify CEP is a Java program that allows the user to provide a Brazilian CEP (Postal Address Code) and retrieve information about it. The program will continue to prompt for CEPs until the user inputs "0" to terminate the execution.
Project Structure

## 📕 The project consists of the following classes:

**Main**: Contains the main method that handles user input and calls the CEP consultation. <br>
**AddressClass**: Models the address returned by the CEP consultation. <br>
**ConsultCep**: Contains the consultCep method that performs the CEP consultation and returns the relevant information. <br>
**AddressRecord**: Contain the parameters to receive a Address correctly from API.

### ☕ Prerequisites

To compile and run this project, you will need the following installed:

**Java Development Kit (JDK) (version 11 or higher)**

## ▶️ How to Run

1 - Clone the repository to your local machine.

    git clone https://github.com/leonardorscarpitta/verifyCep.git

2 - Navigate to the project directory.

    cd verify-cep

3 - Compile the project using a IDE: Eclipse, IntelliJ...

    javac -d bin -sourcepath src src/com/verifyCep/main/Main.java

When started, enter a valid CEP. To terminate the program, enter "0".

## 💻 Usages Examples

```
=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
Provide a valid Brazilian CEP to check information about it:
=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
01001000
=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
Address Searched - Street: Praça da Sé | Neighborhood Name: Sé | Federative Unit: SP
```

```
=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
Provide a valid Brazilian CEP to check information about it:
=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
0
Program finished with success!

```
## 👋 Contributions

Contributions are welcome! Feel free to open an issue or submit a pull request.
License

This project is licensed under the MIT [License](https://opensource.org/license/mit) - see the LICENSE file for details.
