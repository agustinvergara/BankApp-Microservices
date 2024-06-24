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

CREATE TABLE account_type(
    account_type_id INTEGER NOT NULL UNIQUE AUTO_INCREMENT,
    type_name VARCHAR(20) NOT NULL UNIQUE
);

CREATE TABLE saving_account(
    saving_account_id INTEGER NOT NULL UNIQUE AUTO_INCREMENT,
    account_id INTEGER NOT NULL,
    account_type_id INTEGER NOT NULL,
    is_christmas_account BOOLEAN NOT NULL,
    FOREIGN KEY (account_id) REFERENCES accounts(account_id),
    FOREIGN KEY (account_type_id) REFERENCES account_type(account_type_id)
);

CREATE TABLE current_account(
    current_account_id INTEGER NOT NULL UNIQUE AUTO_INCREMENT,
    account_id INTEGER NOT NULL,
    account_type_id INTEGER NOT NULL,
    is_money_market BOOLEAN NOT NULL,
    FOREIGN KEY (account_id) REFERENCES accounts(account_id),
    FOREIGN KEY (account_type_id) REFERENCES account_type(account_type_id)
);