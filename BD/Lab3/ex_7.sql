-- Se va afisa toti studentii din anul 2. 
-- Se vor afisa numele, anul si CNP-ul.
-- Pentru studentii care nu au completat CNP-ul se va afisa 'CNP necompletat'.

SELECT 
    nume,
    an,
    CASE 
        WHEN CNP IS NULL THEN 'CNP necompletat'
        ELSE CNP
    END AS CNP
FROM Student
WHERE an = 2;