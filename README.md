# test-jdbc-driver
Utilitary to test JDBC driver

## Compile the class
1. `git clone https://github.com/dovikos/test-jdbc-driver.git`

2. `cd test-jdbc-driver`

3. `javac TestJDBCDriver.java`

## Test a driver
This project demonstrates the test with **ojdbc8**.

Example testing connection to an Oracle database :

`java -cp ".;.\ojdbc8.jar" TestJDBCDriver jdbc:oracle:thin:@localhost:1521/mydb oracle.driver.OracleDriver scott tiger`

    URL = jdbc:oracle:thin:@localhost:1521/mydb
    DRIVER = oracle.driver.OracleDriver
    USER = scott
    PASSWORD = tiger
    Connection OK
