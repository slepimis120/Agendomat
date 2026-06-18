# Agendomat

![Screenshot 1](https://i.imgur.com/gCydvBA.png)

![Eclipse](https://img.shields.io/badge/Eclipse-FE7A16.svg?style=for-the-badge&logo=Eclipse&logoColor=white)

Agendomat is a tool for modeling and managing conference and event schedules, developed as part of the **Domain-Specific Modeling and Languages (DOMIJ)** course at the Faculty of Technical Sciences, University of Novi Sad.

The project covers the complete development lifecycle of a domain-specific language, from the metamodel and abstract syntax, through graphical and textual concrete syntaxes, to HTML code generation from model instances.

---

## Project Structure

```
Agendomat/
├── agendomat.model/       # EMF metamodel (Ecore + genmodel)
├── agendomat.design/      # Sirius graphical syntax (.odesign)
├── agendomat.generator/   # Xtend generator (HTML izlaz)
└── test/                  # Test model instance (test.xmi)
```

---

## Metamodel

The metamodel is defined in `agendomat.model` using Ecore. The main concepts are:

- **Agenda** - the root element of the model, containing one or more events
- **Event** - a conference or gathering with dates, participants, and locations
- **Session** - a program block held in a specific room, containing talks and technical support staff
- **Break** - a break period (coffee break, lunch break, etc.) with assigned animators
- **Talk** - an individual presentation within a session, with one or more presenters
- **Person** - a participant with a role (Presenter, TechSupport, Animator)
- **Location** - a room or area (Room or BreakArea)
- **Equipment** - equipment associated with a session (temporary or permanent)

OCL constraints are defined directly in the Ecore model. Examples include requiring sessions to be held in locations of type `Room`, breaks in locations of type `BreakArea`, and presenters to have the `Presenter` role.

---

## Graphical Syntax (Sirius)

The graphical syntax is defined in `agendomat.design` through a Sirius viewpoint called `AgendomatViewpoint`. The diagram visually represents the structure of events:

- Event as a blue container
- Session as a blue sub-container containing talks
- Break as an orange sub-container
- Person and Location as oval nodes (green and yellow)
- Edges connecting sessions and breaks to locations, and talks to presenters

The tool palette allows users to create all model elements directly within the diagram. Tool-level restrictions are implemented (for example, a Talk can only be created inside a Session). Element names can be edited directly via double-click.

---

## Generator (Xtend → HTML)

The generator is located in `agendomat.generator`. The `AgendaGenerator` class traverses a model instance and generates an HTML file containing a structured event schedule.

To run the generator:

1. Open `Main.java` in the `agendomat.generator` project
2. Select **Run As → Java Application**
3. The generated HTML file will be placed in the `result/` folder inside the project

The output contains a tabular overview of the program organized by time slots, a list of participants with their roles and organizations, as well as a list of locations and equipment assigned to each session.

---

## Running the Project

The project requires Eclipse IDE with the following components installed:
- EMF (Eclipse Modeling Framework)
- Sirius
- Xtend

To test the graphical and textual syntaxes, launch a Runtime Eclipse instance from `agendomat.design` project using: **Run As → Eclipse Application**.

---

## Author

Developed as a student project at the Faculty of Technical Sciences, University of Novi Sad, 2026.
