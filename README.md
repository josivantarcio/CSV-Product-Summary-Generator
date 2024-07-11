# CSV Product Summary Generator

This Java project reads product data from a CSV file, processes the information to calculate the total value for each product, and writes the results to a summary file. The project demonstrates file I/O operations, string manipulation, and basic object-oriented programming in Java.

## Features

- Read product data from a CSV file
- Calculate the total value for each product
- Write the processed data to a new CSV file
- Demonstrates file handling and string manipulation in Java

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 17
- Eclipse IDE
- Linux Ubuntu

### Installation

1. Clone the repository:
   ```sh
   git clone https://github.com/yourusername/CSV-Product-Summary-Generator.git
   ```

2. Navigate to the project directory:
   ```sh
   cd CSV-Product-Summary-Generator
   ```

3. Open the project in Eclipse IDE.

### Running the Project

1. Ensure you have a CSV file named `itens.csv` in the `Downloads/tmp` directory. The file should have the following format:
   ```csv
   product_name,price,quantity
   example_product,12.34,56
   ```

2. Run the `Application` class.

3. The output will be written to `summary.csv` in the `Downloads/tmp/out` directory.

## Example

Given the following input in `itens.csv`:
```csv
product_name,price,quantity
Apple,1.5,10
Banana,0.75,20
Orange,1.2,15
```

The output in `summary.csv` will be:
```csv
Apple, 15.0
Banana, 15.0
Orange, 18.0
```

## Contributing

1. Fork the repository.
2. Create a new branch (`git checkout -b feature/YourFeature`).
3. Commit your changes (`git commit -m 'Add some feature'`).
4. Push to the branch (`git push origin feature/YourFeature`).
5. Open a pull request.

## License

This project is licensed under the MIT License.

## Acknowledgments

- Special thanks to Professor Nelio Alves for his invaluable guidance and support.
