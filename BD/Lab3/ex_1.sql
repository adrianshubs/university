-- Sa se listeze toti studentii a caror nume de familie se termina cu litera 'u'.

SELECT *
FROM Student
WHERE nume LIKE '%u';