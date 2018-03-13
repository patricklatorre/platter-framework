# Platter Framework (JavaFX)

## Introduction
**Platter** is a JavaFX framework that aims to help developers quickly develop JavaFX programs while maintaining scalability and the _SOLID_ principles of OOP.  

The framework focuses on building and installing *section* objects which are independent modules that contains its own:
* Layout (Parent)
* Controller
* Screen (Scene)

Each section object contains it's own *internal screen* which allows developers to instantiate scenes within separate sections instead of grouping scenes in one class. Using the internal screen is optional, but is still recommended for screens that only contain a single section to prevent bloat.

A section object references a single FXML via URL which in turn references a single controller via URL as well, this allows developers to create identical controller and fxml file names without any inconsistencies. Therefore a Default.fxml and Default.java in a _login_ section is distinct from a Default.fxml and Default.java in a _messenger_ section. 

These sections are encapsulated by a facade object called a *platter*, which is a module that manages the data flow of the sections and binds services to these sections. Sections and services are installed inside a platter. Additionally, multiple platters can exist in a single application.

## Features
