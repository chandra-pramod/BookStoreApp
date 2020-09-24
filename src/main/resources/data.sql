DELETE FROM book;
INSERT INTO book(book_id, title , year, price, category) VALUES (1, 'Everyday Italian', '2005', 30, 'cooking');
INSERT INTO book(book_id, title , year, price, category) VALUES (2, 'Harry Poter', '2005', 40, 'children');
INSERT INTO book(book_id, title , year, price, category) VALUES (3, 'Learning XML', '2003', 50, 'web');

DELETE FROM author;
INSERT INTO author(auth_id, name) VALUES (11,'Giada De Laurentiis');
INSERT INTO author(auth_id, name) VALUES (12,'Sam T. Bruce');
INSERT INTO author(auth_id, name) VALUES (13,'J K. Rowling');
INSERT INTO author(auth_id, name) VALUES (14,'Erik T. Ray');

DELETE FROM books_authors;
INSERT INTO books_authors(book_id, auth_id) VALUES (1, 11);
INSERT INTO books_authors(book_id, auth_id) VALUES (1, 12);
INSERT INTO books_authors(book_id, auth_id) VALUES (2, 13);
INSERT INTO books_authors(book_id, auth_id) VALUES (2, 14);
INSERT INTO books_authors(book_id, auth_id) VALUES (3, 14);