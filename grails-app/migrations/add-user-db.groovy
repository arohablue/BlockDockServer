databaseChangeLog = {

    changeSet(author: "Rohan (generated)", id: "1540268969254-1") {
        createSequence(sequenceName: "hibernate_sequence")
    }

    changeSet(author: "Rohan (generated)", id: "1540268969254-2") {
        createTable(tableName: "blockdock_user") {
            column(autoIncrement: "true", name: "id", type: "INT") {
                constraints(primaryKey: "true", primaryKeyName: "blockdock_userPK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "first_name", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "password", type: "VARCHAR(15)") {
                constraints(nullable: "false")
            }

            column(name: "last_name", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "phone_number", type: "INT") {
                constraints(nullable: "false")
            }

            column(name: "email_id", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "Rohan (generated)", id: "1540268969254-3") {
        addUniqueConstraint(columnNames: "email_id", constraintName: "UC_BLOCKDOCK_USEREMAIL_ID_COL", tableName: "blockdock_user")
    }

    changeSet(author: "Rohan (generated)", id: "1540268969254-4") {
        addUniqueConstraint(columnNames: "id", constraintName: "UC_BLOCKDOCK_USERID_COL", tableName: "blockdock_user")
    }

    changeSet(author: "Rohan (generated)", id: "1540268969254-5") {
        addUniqueConstraint(columnNames: "phone_number", constraintName: "UC_BLOCKDOCK_USERPHONE_NUMBER_COL", tableName: "blockdock_user")
    }
}
