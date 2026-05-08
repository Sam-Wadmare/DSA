Array.prototype.snail = function(rowsCount, colsCount) {
    
    // Invalid case
    if (rowsCount * colsCount !== this.length) {
        return [];
    }

    // Create empty matrix
    let result = Array.from({ length: rowsCount }, () => Array(colsCount));

    let index = 0;

    // Fill column by column
    for (let col = 0; col < colsCount; col++) {

        // Even column -> top to bottom
        if (col % 2 === 0) {
            for (let row = 0; row < rowsCount; row++) {
                result[row][col] = this[index++];
            }
        }

        // Odd column -> bottom to top
        else {
            for (let row = rowsCount - 1; row >= 0; row--) {
                result[row][col] = this[index++];
            }
        }
    }

    return result;
};