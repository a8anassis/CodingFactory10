-- 1. Create the user with the specified password
-- run one by one
CREATE USER 'bank_user'@'%' IDENTIFIED BY 'bank_user123';

-- 2. Grant all privileges on the bank_db database to this user
GRANT ALL PRIVILEGES ON bank_db.* TO 'bank_user'@'%';

-- 3. Flush privileges to apply the changes immediately
FLUSH PRIVILEGES;