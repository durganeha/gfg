class Solution {
    public int orangesRot(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;

        // Step 1: Add all rotten oranges & count fresh
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 2) {
                    q.add(new int[]{i, j});
                } else if (mat[i][j] == 1) {
                    fresh++;
                }
            }
        }

        // If no fresh oranges
        if (fresh == 0) return 0;

        int time = 0;

        int[][] directions = {{-1,0},{1,0},{0,-1},{0,1}};

        // Step 2: BFS
        while (!q.isEmpty()) {
            int size = q.size();
            boolean spread = false;

            for (int k = 0; k < size; k++) {
                int[] curr = q.poll();
                int x = curr[0];
                int y = curr[1];

                for (int[] dir : directions) {
                    int nx = x + dir[0];
                    int ny = y + dir[1];

                    if (nx >= 0 && ny >= 0 && nx < n && ny < m && mat[nx][ny] == 1) {
                        mat[nx][ny] = 2; // rot it
                        q.add(new int[]{nx, ny});
                        fresh--;
                        spread = true;
                    }
                }
            }

            // Only increase time if something rotted
            if (spread) time++;
        }

        return fresh == 0 ? time : -1;
    }
}