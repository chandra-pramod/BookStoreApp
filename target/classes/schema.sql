DROP TABLE IF EXISTS book;
 
CREATE TABLE book(
  book_id INT PRIMARY KEY,
  title VARCHAR(250) NOT NULL,
  year VARCHAR(50) NOT NULL,
  price DECIMAL(20, 2) NOT NULL,
  category VARCHAR(50) NOT NULL
);

DROP TABLE IF EXISTS author;
 
CREATE TABLE author(
  auth_id INT PRIMARY KEY,
  name VARCHAR(250) NOT NULL
);

DROP TABLE IF EXISTS books_authors;

CREATE TABLE books_authors(
book_id INT,
auth_id INT
)

