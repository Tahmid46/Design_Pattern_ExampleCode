# Design Pattern Example Code

A collection of classic software design pattern implementations written in **Kotlin**. This project is intended as a learning resource demonstrating how each pattern works through small, self-contained examples.

## Design Patterns Covered

| Pattern | Category | Directory |
|---|---|---|
| Singleton | Creational | `src/Singleton.kt` |
| Factory Object | Creational | `src/factoryobject/` |
| Factory Method | Creational | `src/factory_method_pattern/` |
| Adapter | Structural | `src/adapter_design_pattern/` |
| Composite | Structural | `src/composite_design_pattern/` |
| Decorator | Structural | `src/decorator_design_pattern/` |
| Facade | Structural | `src/facade_design_pattern/` |
| Proxy | Structural | `src/proxy_pattern/` |
| Chain of Responsibility | Behavioral | `src/chain_of_responsibility/` |
| Observer | Behavioral | `src/observer_pattern/` |
| Template Method | Behavioral | `src/template_method_pattern/` |

## Pattern Descriptions

### Singleton
Ensures a class has only one instance. `Singleton.kt` demonstrates lazy initialization via a companion object.

### Factory Object
Uses a dedicated factory class (`KnifeFactory`) to create `Knife` objects (`SteakKnife`, `ChefKnife`) without coupling the client (`KnifeStore`) to concrete types.

### Factory Method
Defines an abstract `CarStore` with a `carFactory()` method that subclasses override to create specific `Car` objects (`Toyota`, `BMW`).

### Adapter
Wraps a `WebService` (incompatible interface) inside a `WebAdapter` that implements `WebRequester`, allowing `WebClient` to use it without modification.

### Composite
Builds tree structures of `Housing` (composite) and `Room` (leaf) objects, both implementing the `IStructure` interface, to represent part-whole hierarchies.

### Decorator
Dynamically adds responsibilities to a `BasicWebPage` by wrapping it with `AuthenticatedWebPage` and `AuthorizedWebPage` decorators, all implementing the `WebPage` interface.

### Facade
Provides a simple `BankService` interface that hides the complexity of managing different account types (`Saving`, `Chequing`, `Investment`).

### Proxy
`Order` acts as a proxy for `Warehouse`, controlling access to the real `fulFillOrder` operation through the shared `IOrder` interface.

### Chain of Responsibility
Routes arithmetic operations through a chain of handlers (`AddNumbers`, `SubtractNumbers`, `MultiplyNumbers`, `DevideNumbers`), each deciding whether to handle a `Number` request or pass it along.

### Observer
A `Blog` (subject) notifies registered `Subscriber` (observer) objects whenever new content is published, using the `Subject` / `Observer` interfaces.

### Template Method
`PastaDish` defines the skeleton of a recipe in `makeRecipe()`, delegating the individual steps (`addPasta`, `addSauce`, `addProtein`, `addGarnish`) to concrete subclasses like `SpaghettiMeatBalls` and `PenneAlfredo`.

## Prerequisites

- **JDK 8+** — [Download](https://adoptium.net/)
- **Kotlin** — bundled with IntelliJ IDEA, or install via [kotlinlang.org](https://kotlinlang.org/docs/command-line.html)
- **IntelliJ IDEA** (recommended) — [Download Community Edition](https://www.jetbrains.com/idea/download/)

## Running the Project

### Option 1 — IntelliJ IDEA (recommended)

1. Open IntelliJ IDEA and choose **File → Open**, then select the repository root folder.
2. Wait for the IDE to index the project (the `Design_Pattern.iml` module file will be picked up automatically).
3. Open `src/Main.kt`.
4. Uncomment the function call you want to run inside the `main()` function, for example:
   ```kotlin
   fun main() {
       singletonFunction()
       // factoryObject()
       // factoryMethodPattern()
       // adapterPattern()
   }
   ```
5. Click the green **Run** button next to `fun main()` or press **Shift+F10**.

To run a pattern that has its own `Main.kt` (e.g. `chain_of_responsibility`, `composite_design_pattern`, `decorator_design_pattern`, `template_method_pattern`), open that file and run it the same way.

### Option 2 — Command Line (kotlinc)

Compile and run a single pattern from the repository root:

```bash
# Example: run the root Main.kt (adapter pattern demo)
kotlinc src -include-runtime -d out/design_patterns.jar
java -jar out/design_patterns.jar

# Example: run the Chain of Responsibility demo directly
kotlinc src/chain_of_responsibility -include-runtime -d /tmp/chain.jar
java -cp /tmp/chain.jar MainKt
```

> **Note:** Each pattern directory with its own `Main.kt` compiles independently. Adjust the source path accordingly.

## Project Structure

```
Design_Pattern_ExampleCode/
├── src/
│   ├── Main.kt                        ← Root entry point (calls individual demos)
│   ├── Singleton.kt
│   ├── adapter_design_pattern/
│   ├── chain_of_responsibility/
│   ├── composite_design_pattern/
│   ├── decorator_design_pattern/
│   ├── facade_design_pattern/
│   ├── factory_method_pattern/
│   ├── factoryobject/
│   ├── observer_pattern/
│   ├── proxy_pattern/
│   └── template_method_pattern/
└── Design_Pattern.iml                 ← IntelliJ IDEA module file
```

## License

This project is provided for educational purposes.