DROP DATABASE IF EXISTS account_management_db;

DROP USER IF EXISTS 'dbmanager'@'localhost' ;

CREATE DATABASE account_management_db;

CREATE USER  'dbmanager'@'localhost' IDENTIFIED BY 'wfF445..-36';

GRANT ALL PRIVILEGES ON account_management_db.* TO 'dbmanager'@'localhost';

FLUSH PRIVILEGES;

USE account_management_db;

CREATE TABLE accounts(
    account_id INTEGER NOT NULL UNIQUE AUTO_INCREMENT,
    account_name VARCHAR(36) NOT NULL UNIQUE,
    account_number NCHAR(17) NOT NULL,
    balance DECIMAL(15, 2) NOT NULL,
    PRIMARY KEY (account_id)
);


INSERT INTO `accounts` VALUES (1, 'agustin_ahorro', '04-18-55-384793-4', 24.30), (2, 'agustin_corriente', '03-15-65-467582-3', 100.30),(3, 'pedro_ahorro', '04-29-59-445633-4', 3000.50), (4, 'andres_corriente', '03-87-98-223793-3', 100000.70);

CREATE TABLE account_type(
    account_type_id INTEGER NOT NULL UNIQUE AUTO_INCREMENT,
    type_name VARCHAR(20) NOT NULL UNIQUE
);


INSERT INTO `account_type` VALUES (1, 'saving_account'), (2, 'current_account');

CREATE TABLE saving_account(
    saving_account_id INTEGER NOT NULL UNIQUE AUTO_INCREMENT,
    account_id INTEGER NOT NULL,
    account_type_id INTEGER NOT NULL,
    is_christmas_account BOOLEAN NOT NULL,
    FOREIGN KEY (account_id) REFERENCES accounts(account_id),
    FOREIGN KEY (account_type_id) REFERENCES account_type(account_type_id)
);


INSERT INTO `saving_account` VALUES (1, 1, 1, 0),(2, 3, 1, 1);

CREATE TABLE current_account(
    current_account_id INTEGER NOT NULL UNIQUE AUTO_INCREMENT,
    account_id INTEGER NOT NULL,
    account_type_id INTEGER NOT NULL,
    is_money_market BOOLEAN NOT NULL,
    FOREIGN KEY (account_id) REFERENCES accounts(account_id),
    FOREIGN KEY (account_type_id) REFERENCES account_type(account_type_id)
);

INSERT INTO `current_account` VALUES (1, 2, 2, 0), (2, 4, 2, 1);

DELIMITER $$
CREATE PROCEDURE get_savings_accounts()
BEGIN
    SELECT accounts.account_id, account_name, account_number, balance, is_christmas_account, type_name FROM saving_account
            LEFT JOIN accounts ON saving_account.account_id = accounts.account_id
            LEFT JOIN account_type ON saving_account.account_type_id = account_type.account_type_id;
END $$
DELIMITER ;


DELIMITER $$
CREATE PROCEDURE get_currents_accounts()
BEGIN
	SELECT accounts.account_id, account_name, account_number, balance, is_money_market, type_name FROM current_account
            LEFT JOIN accounts ON current_account.account_id = accounts.account_id
            LEFT JOIN account_type ON current_account.account_type_id = account_type.account_type_id;
END $$
DELIMITER ;