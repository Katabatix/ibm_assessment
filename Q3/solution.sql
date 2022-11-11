SELECT * FROM category_article_mapping
LEFT JOIN article ON category_article_mapping.article_id=article.article_id
LEFT JOIN owner ON article.owner_id=owner.owner_id
SELECT DISTINCT owner_id, owner_name, COUNT(DISTINCT category_id)
