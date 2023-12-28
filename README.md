# Spring Framework Concepts

## This is the repository that consists Spring Framework Concepts I learned from Durgesh sir
### Features
###### ->Loose Coupling
###### ->Easy to test
###### ->Lightweight (POJO implementation)
###### ->Fast Development
###### ->Powerful Abstraction
###### ->Provides templates for JDBC Hibernate JPA etc technologies

Spring was developed by Rod Johnson in 2003. 
Spring framework makes the easy development of JavaEE application.
It can be thought of as a framework of frameworks because it provides support to various frameworks such as Struts, Hibernate, Tapestry, EJB, JSF, etc.

#### Inversion Of Control (IOC) and Dependency Injection
It means that we when we use spring framework we just write the business logic... 
Spring has the feature which allows it to create the objects of the class by itself and also apply that object where the user has use of it.
This control given to spring is IOC while proving object in other objects is DI. It allows classes/ objects to become loosely coupled.
We provide metadata to the IOC container either by XML file or annotation.
###### Dependency injection makes code loosely coupled so it is easy to maintain and also make it easy to test

## Spring Modules 
### Test
This layer provides support of testing with JUnit.
### Spring core container
->Core
->Beans
###### core and bean module provides IOC and dependency injection features 
->Context
->Expression Language 
### AOP 
-> Aspect oriented Programming
### Data Access/Integration
->JDBC, ORM, transaction modules that provide support to interact with the database.
### Web 
->provides support to create web application

## Steps to create spring application:

#### Create a maven project
#### Load the spring jar/dependency files
#### (BeanClass) Create the bean class
#### (Configuration) Create the xml file to provide the values 
#### (Main) Create the test class
#### Run the test class
