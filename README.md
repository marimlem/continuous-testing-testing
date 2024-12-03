# Continuous Testing using GitHub Actions

This document contains hands-on assignments that should help you learn how to implement **Continuous Testing** using **GitHub Actions**.

> [!IMPORTANT]
> For each assignment we'll use separate github workflow.

## Assignment 1: Hello world

⭐ **Goal**: learn how to use github workflows

🚀 **Steps**:
##### 1.1 one-line scripts

> 1.1.1 print "Hello world"</br>

##### 1.2 multi-line scripts

> 1.2.1 print current directory path</br>
> 1.2.2 print the file structure of the current directory</br>

##### 1.3 github actions

> 1.3.1 checkout the repository</br>
> 1.3.2 print current directory path</br>
> 1.3.3 print the file structure of the current directory</br>

##### 1.4 triggers

> 1.4.1 run on PR to the main branch</br>
> 1.4.2 run on push to the main branch</br>
> 1.4.3 run on schedule</br>
> 1.4.4 run on button click (manually)</br>

# Assignment 2: Test execution environment

⭐ **Goal**: learn how to prepare test execution environment

🚀 **Steps**:
##### 2.1 verify installation

> 2.1.1 verify Java installation</br>

##### 2.2 install needed tools

> 2.2.1 install Java (version: 17)</br>

##### 2.3 verify installation

> 2.3.1 verify Java installation</br>

# Assignment 3: Run tests

⭐ **Goal**: learn how to run your tests</br>

🚀 **Steps**:
##### 3.1 run tests

> 3.1.1 run tests</br>

```shell
# hint
./gradlew test --tests "ApiTests" --info
```

# Assignment 4: Test reports

⭐ **Goal**: learn how to deal with test reports

🚀 **Steps**:
##### 4.1 verify test report is generated

> 4.1.1 verify test report is generated</br>

```shell
# hint
Where is it?
```

##### 4.2 upload test report to the job summary 

> 4.2.1 upload test report to the job summary</br>

##### 4.3 status check functions

> 4.3.1 ensure test report is uploaded (even if there are failed tests)</br>
 
# Assignment 5: Configuration & test data

⭐ **Goal**: learn how to deal with configuration & test data

🚀 **Steps**:

##### 5.1 secrets
> 5.1.1 create a secret "API_EMAIL"</br>
> 5.1.2 create a secret "API_PASSWORD"</br>
> 5.1.3 pass these secrets to the test cases</br>

**Note**: Settings -> Secrets and variables -> Actions -> Secrets

##### 5.2 variables
> 5.2.1 create a variable "BASE_URI"</br>
> 5.2.2 pass these variable to the test cases</br>

**Note**: Settings -> Secrets and variables -> Actions -> Variables

##### 5.3 environment variables
> 5.3.1 pass secrets from the environment variables</br>
> 5.3.2 pass variables from the environment variables</br>

# Discussion: Do we have a pipeline?

⭐ **Goal**: learn how to deal with testing in a pipeline

🚀 **Last Steps**: what are we missing?
