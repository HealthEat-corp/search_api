curl -X PUT "localhost:9200/product?pretty" -H 'Content-Type: application/json' -d @./product-mapping.json

curl -X GET "localhost:9200/product/_search"
