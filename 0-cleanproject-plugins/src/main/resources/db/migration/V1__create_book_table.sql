CREATE TABLE book (
    id          uuid          not null,
    isbn       varchar    not null,
    title    varchar    not null,
    author    varchar    not null,
    year_of_publication date not null,
    constraint pk_book primary key (id)
);