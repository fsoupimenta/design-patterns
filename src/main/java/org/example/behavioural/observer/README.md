```mermaid
classDiagram
    class MusicApp {
    }

    class MusicTrack {
    }

    class Device {
    }

    class Observable {
    }

    class Observer {
    }

    MusicApp ..|> Observable
    Device ..|> Observer

    MusicApp  -->  Device
    Device  --> MusicTrack 

    Observable --> Observer
```