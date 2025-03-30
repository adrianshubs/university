-- Sa se afiseze toti studentii care nu au completat campul bursa (bursa este NULL).
-- Sa se afiseze toti studentii care nu au bursa (bursa este 0).

-- Studentii care nu au completat campul bursa (bursa este NULL)
SELECT * 
FROM Student
WHERE bursa IS NULL;

-- Studentii care nu au bursa (bursa este 0)
SELECT * 
FROM Student
WHERE bursa = 0;