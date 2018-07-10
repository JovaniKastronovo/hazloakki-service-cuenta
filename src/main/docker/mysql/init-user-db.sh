#!/bin/bash
set -e

psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" <<-EOSQL
    CREATE USER admin PASSWORD 'admin';
    CREATE DATABASE gs_ordenes OWNER admin;
    GRANT ALL PRIVILEGES ON DATABASE gs_ordenes TO admin;
EOSQL