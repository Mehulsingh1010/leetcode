class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> studque = new LinkedList<>();
        for (int student : students) {
            studque.add(student);
        }

        int index = 0;
        int attempts = 0;
        while (!studque.isEmpty() && attempts < studque.size()) {
            if (studque.peek() == sandwiches[index]) {
                studque.remove();
                index++;
                attempts = 0;
            } else {
                studque.add(studque.remove());
                attempts++;
            }
        }
        return studque.size();

    }
}