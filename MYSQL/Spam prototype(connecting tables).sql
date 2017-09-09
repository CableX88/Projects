#customer id, name(first and last), mailing address

SELECT
	customer.customer_id, customer.first_name, customer.last_name, address.address
FROM
	customer, address

WHERE
	customer.address_id = address.address_id

#film name, category, language
SELECT
	film.title, category.name, language.name
FROM
	film, language, film_category, category
WHERE
	film.film_id = film_category.film_id
	and
	category.category_id = film_category.category_id
	and
	film.language_id = language.language_id
;