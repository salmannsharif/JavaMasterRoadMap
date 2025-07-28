package com.training.postgresSQL;

public class AllDataTypesOfPostgres {
    /*
    Here is a list of common PostgreSQL data types:

        Numeric Types :
        SMALLINT - Small-range integer (-32,768 to 32,767, 2 bytes)
        INTEGER (INT) - Typical integer (-2,147,483,648 to 2,147,483,647, 4 bytes)
        BIGINT - Large-range integer (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807, 8 bytes)
        DECIMAL (NUMERIC) - Exact precision (user-defined)
        REAL - Floating-point number (4 bytes, approx precision 6 digits)
        DOUBLE PRECISION - Floating-point number (8 bytes, approx precision 15 digits)
        SERIAL - Auto-incrementing 4-byte integer
        BIGSERIAL - Auto-incrementing 8-byte integer

        Character Types :
        CHAR(n) or CHARACTER(n) - Fixed-length string
        VARCHAR(n) or CHARACTER VARYING(n) - Variable-length string with a limit
        TEXT - Variable-length string with no limit

        Date/Time Types :
        DATE - Calendar date (year, month, day)
        TIME [WITHOUT TIME ZONE] - Time of day (hour, minute, second)
        TIME WITH TIME ZONE - Time of day, including time zone
        TIMESTAMP [WITHOUT TIME ZONE] - Date and time
        TIMESTAMP WITH TIME ZONE (TIMESTAMPTZ) - Date and time with time zone
        INTERVAL - Time span (e.g., 1 day, 2 hours)

        Boolean Type :
        BOOLEAN - True or False

        Geometric Types :
        POINT - (x, y) coordinate
        LINE - Infinite line
        LSEG - Line segment
        BOX - Rectangular box
        PATH - Geometric path
        POLYGON - Closed geometric shape
        CIRCLE - Circle

        Monetary Types :
        MONEY - Currency amounts
        Network Address Types
        INET - IPv4 or IPv6 host/network
        CIDR - IPv4 or IPv6 network
        MACADDR - MAC address
        MACADDR8 - EUI-64 MAC address

        UUID :
        UUID - Universally Unique Identifier

        Array Types :
        Support for all base types (e.g., INTEGER[], TEXT[])

        JSON Types :
        JSON - JSON data without validation
        JSONB - Binary JSON data with validation and indexing

        Range Types :
        INT4RANGE - Range of integers
        NUMRANGE - Range of numerics
        TSRANGE - Range of timestamps (without time zone)
        TSTZRANGE - Range of timestamps (with time zone)
        DATERANGE - Range of dates

        Other Types :
        BYTEA - Binary data
        XML - XML data
        TSVECTOR - Text search vector
        TSQUERY - Text search query
        OID - Object Identifier

     */
}
