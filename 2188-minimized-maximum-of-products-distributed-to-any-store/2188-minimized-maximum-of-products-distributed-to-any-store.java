class Solution {
    public int minimizedMaximum(int stores, int[] products) {
        // Initial search space: the lowest possible maximum is 1 (each store can have at least one of any product),
        // and the highest possible maximum is assumed to be 100000
        // (based on the problem constraints if given in the problem description).
        int left = 1, right = 100000;

        // Using binary search to find the minimized maximum value
        while (left < right) {
            // Midpoint of the current search space
            int mid = (left + right) / 2;

            // Counter for the number of stores needed
            int count = 0;

            // Distribute products among stores
            for (int quantity : products) {
                // Each store can take 'mid' amount, calculate how many stores are required
                // for this particular product, rounding up
                count += (quantity + mid - 1) / mid;
            }

            // If we can distribute all products to 'stores' or less with 'mid' maximum product per store,
            // we are possibly too high in the product capacity (or just right) so we try a lower capacity
            if (count <= stores) {
                right = mid;
            } else {
                // If we are too low and need more than 'stores' to distribute all products,
                // we need to increase the product capacity per store
                left = mid + 1;
            }
        }

        // 'left' will be our minimized maximum product per store that fits all products into 'stores' stores.
        return left;
    }
}