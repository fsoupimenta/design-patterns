```mermaid
classDiagram
Strategy <|-- NoteE1
Strategy <|-- NoteE2
Strategy <|-- NoteE3

    Musician --> App
    App --> Strategy
```