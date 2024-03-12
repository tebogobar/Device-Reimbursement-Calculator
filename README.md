# MTN - DEVICE REIMBURSEMENT CALCULATOR

#####We're building an application that allows users to register/login into a system and allows the user to calculate contract repayments for devices taken over the following periods 12, 24 and 36 months. The user should be able to enter the device amount and be shown the different offerings based on the amount over the 3 periods on offer with an interest rate of 6.5%

### How to initialize the application and to run on your local machine
 - After cloning the project to your laptop please ensure Docker daemon is running.

##1. Start with the backend service
Navigate to ../Device Reimbursement Calculator/device-reimbursement-calculator/ and run the below commands.

```bash

	mvn clean install

	docker build -t Device Reimbursement Calculator .
	
```

###2. Now for the User interface:

Navigate to back to the root directrory of the project and then into the UI module ../Device Reimbursement Calculator/device-reimbursement-calculator-ui/ and run the below commands.

```bash

	npm run build

	docker build -t Device Reimbursement Calculator-ui . 
	
```

#####Now that we have both the backend and frontend images built we can startup the project along with other dependecies defined in the docker-compose.yml file.
Run the below command to startup the project.

```bash
	docker compose up
```


Administration console:
> [Application Metrics](http://localhost:8081/applications)

device-reimbursement-calculator:
> [Device Calculator Application](http://localhost:8081/applications)

API-Documentation
> [API Documentation](http://localhost:8088/v3/api-docs)

Swagger
> [ SWAGGER ](http://localhost:8088/swagger-ui/index.html#/)

User-Interface
> [React App](http://localhost:3000/)



## Author
- [Tebogo Bareetseng](http://tebogobareetseng.s3-website-us-east-1.amazonaws.com/)