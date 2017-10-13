DROP PROCEDURE CountProductsBySupplier;

CREATE PROCEDURE CountProductsBySupplier(
         IN suppId INT,
         OUT total INT)
BEGIN
    SELECT count(*) INTO total FROM products WHERE supplierId = suppId;
END