SELECT * FROM category_article_mapping 

SELECT owner_id FROM article
LEFT JOIN owner ON article.owner_id=owner.owner_id
SELECT 
