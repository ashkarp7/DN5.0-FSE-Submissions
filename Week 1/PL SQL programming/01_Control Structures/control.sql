--add a column isVIP in customers table if not exists
--ALTER TABLE Customers ADD (isVIP VARCHAR2(10));

DECLARE
    v_age NUMBER;
BEGIN

    FOR c IN (SELECT CustomerID, Name, DOB, Balance FROM Customers)
    LOOP

        v_age := FLOOR(MONTHS_BETWEEN(SYSDATE, c.DOB) / 12);

  
        IF v_age > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = c.CustomerID;
        END IF;


        IF c.Balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE CustomerID = c.CustomerID;
        ELSE
            UPDATE Customers
            SET IsVIP = 'FALSE'
            WHERE CustomerID = c.CustomerID;
        END IF;
    END LOOP;


    FOR l IN (
        SELECT c.Name, l.LoanID, l.EndDate
        FROM Customers c
        JOIN Loans l
        ON c.CustomerID = l.CustomerID
        WHERE l.EndDate BETWEEN SYSDATE AND SYSDATE + 30
    )
    LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Dear ' || l.Name ||
            ', your Loan ID ' || l.LoanID ||
            ' is due on ' || TO_CHAR(l.EndDate, 'DD-MON-YYYY')
        );
    END LOOP;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('All operations completed successfully.');
END;
/