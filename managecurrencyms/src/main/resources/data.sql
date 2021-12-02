DROP TABLE IF EXISTS currency;

CREATE TABLE currency(
  id INT AUTO_INCREMENT  PRIMARY KEY,
  country_code VARCHAR(10) NOT NULL,
  conversion_factor DECIMAL(25) NOT NULL
);

INSERT INTO currency (country_code,conversion_factor) VALUES
  ('USD', '75'),
  ('EURO', '80');
 