# Write your MySQL query statement below
SELECT
    p1.category AS category1,
    p2.category AS category2,
    COUNT(DISTINCT p1.user_id) AS customer_count
FROM
(
    SELECT DISTINCT pp.user_id, pi.category
    FROM ProductPurchases pp
    JOIN ProductInfo pi
    ON pp.product_id = pi.product_id
) p1
JOIN
(
    SELECT DISTINCT pp.user_id, pi.category
    FROM ProductPurchases pp
    JOIN ProductInfo pi
    ON pp.product_id = pi.product_id
) p2
ON p1.user_id = p2.user_id
AND p1.category < p2.category
GROUP BY
    p1.category,
    p2.category
HAVING COUNT(DISTINCT p1.user_id) >= 3
ORDER BY
    customer_count DESC,
    category1,
    category2;