# BRAINBUSTER 2 films by rating
SELECT
	rating, count(film_id)
FROM
	film

GROUP BY 1
;
