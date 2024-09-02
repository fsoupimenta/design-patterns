```mermaid
classDiagram
LightControlInterpreter --> Interpreter 

    class Interpreter {
        <<abstract>>
    }

    class TurnOnLight {
    }

    class TurnOffLight {
    }

    TurnOnLight ..|> Interpreter
    TurnOffLight ..|> Interpreter
```