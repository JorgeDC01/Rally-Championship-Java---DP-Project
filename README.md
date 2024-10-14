# Rally Championship - Java Project

This repository contains the implementation of the **Rally Championship** project, developed for the **Program Development** course during the 2020/2021 academic year. The project simulates a rally competition between drivers, teams, and cars across various circuits, applying object-oriented programming concepts.

## Project Overview

The goal of this project is to create a system that simulates a rally competition. The competition involves multiple **circuits**, **drivers**, and **cars**, where drivers aim to complete each race in the shortest possible time to earn points and win the driver’s championship, while teams compete for the constructor’s championship.

The system includes:
- **Circuits**: Different racing tracks with varying complexity and distance.
- **Cars**: Vehicles with unique characteristics such as speed and fuel capacity.
- **Drivers**: Participants with different levels of concentration, influencing their performance during races.
- **Teams (Escuderías)**: Racing teams managing drivers and cars.
- **The Organization**: Manages the championship, including circuits, teams, and race results.

## Main Classes

### 1. **Circuit**
Represents the racing tracks where the drivers compete. Circuits differ in terms of complexity and distance, which directly affects the performance of drivers and their cars.

- **Attributes**:
  - `name`: Circuit name.
  - `complexity`: Circuit difficulty, affecting the driver’s real speed.
  - `distance`: The distance to be covered in the race (measured in kilometers).
  - `ComplicacionExtra`: Additional factors (Night, Wet, Cold, Gravel) that modify the complexity and distance.

### 2. **Car**
Represents the cars used by drivers in races. Cars differ by theoretical speed and fuel capacity, which impacts the race performance.

- **Attributes**:
  - `name`: Car name.
  - `speed`: Theoretical speed in km/h (Tortoise, Slow, Normal, Fast, or Cheetah).
  - `fuel`: Remaining fuel in the car, depleted by the time spent racing.
  
- **Special Car Types**:
  - **CocheRapido**: Has an additional 80 liters of nitro that boosts speed by up to 20%.
  - **CocheResistente**: Has an extra 100 liters of reserve fuel for a single race.

### 3. **Driver**
Represents the drivers competing in the championship. Drivers vary in their level of concentration, which affects their ability to complete races.

- **Attributes**:
  - `name`: Driver name.
  - `car`: The car assigned by the team.
  - `concentration`: Maximum time a driver can stay focused before abandoning the race.
  
- **Driver Types**:
  - **PilotoNovato**: Beginner driver with lower skills.
  - **PilotoExperimentado**: Experienced driver with balanced skills.
  - **PilotoEstrella**: Star driver with superior performance.

### 4. **Team (Escudería)**
Manages a team of drivers and cars. The team’s goal is to win the constructors' championship by assigning the best drivers and cars for each race.

- **Attributes**:
  - `name`: Team name.
  - `drivers`: List of drivers.
  - `cars`: List of cars.
  
### 5. **Organization**
Manages the overall rally championship, including races, teams, and circuits.

- **Attributes**:
  - `limitAbandonos`: Maximum number of race abandonments allowed for drivers.
  - `circuitos`: List of circuits in the championship.
  - `escuderias`: List of teams registered for the championship.

## Functionality

The system provides the following functionality:
- Simulation of races with real-time calculation of race times based on car performance, driver concentration, and circuit complexity.
- Automatic handling of car fuel depletion and driver abandonments.
- Scoring system to determine the winner of both the drivers' and constructors' championships.
- Management of team decisions for assigning drivers and cars to races.

## Project Requirements

- Each class includes constructors, getters, setters, and other necessary methods (e.g., `toString`, `equals`).
- The system must correctly simulate a championship using a class called `RallyDemo` to initialize data and run the simulation.
- The program generates output in a predefined format, detailing race results, driver standings, and team performance.

## How to Run the Project

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/rally-championship.git
   cd rally-championship

2. Compile and run the project using your preferred Java IDE (e.g., BlueJ, IntelliJ), or from the command line with:
   ```bash
   javac *.java
   java RallyDemo

3. The RallyDemo class will read the initial data and run the simulation, producing results based on the current dataset.

## Additional Features
The project includes optional features:

Unit tests using JUnit for each class (Circuit, Car, Driver, Team, Organization).
Design patterns like Singleton applied where appropriate.
Handling of edge cases, such as driver disqualification and car fuel depletion.

## Conclusion
This project applies object-oriented programming concepts to simulate a realistic rally championship. It demonstrates effective use of inheritance, polymorphism, encapsulation, and collections in Java, while also incorporating advanced design patterns and testing methods.
