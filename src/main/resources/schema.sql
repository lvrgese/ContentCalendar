CREATE TABLE IF NOT EXISTS Content (
    id INTEGER AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    desc TEXT,
    status VARCHAR(20) NOT NULL,
    content_type VARCHAR(50) NOT NULL,
    date_created TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    date_updated TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    url VARCHAR(255)
);

INSERT INTO Content (title, desc, status, content_type, url)
VALUES (
    'Introduction to SQL',
    'A beginner-friendly guide to learning SQL for database management.',
    'IDEA',
    'VIDEO',
    'https://example.com/intro-to-sql'
);