# Cofrinho (piggy bank)

A console-based piggy bank application built with Java, developed to practice Object-Oriented Programming concepts.

## About

The app simulates a piggy bank that stores different currencies (BRL, USD, EUR). The user can add or remove coins, list all stored values, and see the total converted to Brazilian Reais.

## Concepts Applied

- **Abstract class** — `Moeda` defines the contract for all currency types
- **Inheritance** — `Real`, `Dolar`, and `Euro` extend `Moeda`
- **Polymorphism** — `info()` and `converterParaReal()` behave differently per currency
- **ArrayList** — dynamic list to manage stored coins in `Cofrinho`

## Project Structure

```
src/
├── Moeda.java        # Abstract base class
├── Real.java         # BRL currency
├── Dolar.java        # USD currency (rate: 5.40)
├── Euro.java         # EUR currency (rate: 6.17)
├── Cofrinho.java     # Manages the coin list
└── Principal.java    # Entry point / menu
```

## How to Run

Make sure you have the [JDK](https://www.oracle.com/java/technologies/downloads/) installed.

```bash
# 1. Clone the repository
git clone https://github.com/guilhermeseckler/cofrinho-poo-java.git
cd cofrinho-poo-java

# 2. Create the output folder
mkdir out

# 3. Compile
javac src/*.java -d out/

# 4. Run
java -cp out/ Principal
```

## Menu Options

```
1 - Add coin
2 - Remove coin
3 - List coins
4 - Total converted to BRL
0 - Exit
```

## Notes

Exchange rates used are based on 2025 averages (USD: R$5.40 / EUR: R$6.17).

---

Developed as a coursework project at [Uninter](https://www.uninter.com/) — ADS (Systems Analysis and Development).
