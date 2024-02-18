# Disk Allocation System

This project implements a disk allocation system using the Worst Fit algorithm in Java. The system efficiently allocates files to disks based on their sizes and calculates the remaining space on each disk.

## Table of Contents

- [Overview](#overview)
- [How to Use](#how-to-use)
- [File Descriptions](#file-descriptions)
- [Contributing](#contributing)
- [License](#license)

## Overview

The project consists of two main Java classes:

1. `WorstFit.java`: This class contains the main method and implements the disk allocation system using the Worst Fit algorithm. It reads file sizes from an input file, allocates them to disks, and prints the disk allocation information.

2. `Disk.java`: This class represents a disk in the disk allocation system. It contains methods to calculate remaining space, add files to the disk, and compare disks based on remaining space.

## How to Use

To use this disk allocation system:

1. Clone the repository to your local machine:

```
git clone https://github.com/Blueturboguy07/BinPacking.git
```

2. Compile the Java files:

```
javac WorstFit.java Disk.java
```

3. Run the `WorstFit` class with an input file containing file sizes:

```
java WorstFit
```

4. View the output to see the disk allocation information.

## File Descriptions

- `WorstFit.java`: Contains the main method and implements the disk allocation system using the Worst Fit algorithm.
- `Disk.java`: Represents a disk in the disk allocation system and contains methods to manage disk allocation.

## Contributing

Contributions to improve the functionality or documentation of this project are welcome! To contribute, follow these steps:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature/improvement`).
3. Make your changes.
4. Commit your changes (`git commit -am 'Add new feature'`).
5. Push to the branch (`git push origin feature/improvement`).
6. Create a new Pull Request.

## License

This project is licensed under the [MIT License](LICENSE).
