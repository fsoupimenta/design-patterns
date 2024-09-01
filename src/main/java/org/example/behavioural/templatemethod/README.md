```mermaid
classDiagram
    class Musician {
    }
    
    class Violinist {
    }

    class Pianist {
    }

    class Drummer {
    }
    
    Musician <|-- Violinist
    Musician <|-- Pianist
    Musician <|-- Drummer
    
    class enumRole {
    }
```