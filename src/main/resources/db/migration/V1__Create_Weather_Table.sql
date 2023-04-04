CREATE TABLE weather
(
    id                         SERIAL      PRIMARY KEY NOT NULL,
    location                   VARCHAR(30)             NOT NULL,
    lat                        VARCHAR(30)             NOT NULL,
    lng                        VARCHAR(30)             NOT NULL,
    degree                     VARCHAR(30)             NOT NULL,
    time                       TIMESTAMP               NOT NULL
)