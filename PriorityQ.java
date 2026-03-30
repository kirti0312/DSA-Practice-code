import java.util.PriorityQueue;
class PriorityQ{
    static class Student implements Comparable<Student>{
        String name;
        int rank;
        Student(String name,int rank){
            this.name=name;
            this.rank=rank;
        }
        @Override
        public int compareTo(Student s2){
            return this.rank-s2.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
       // PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());    in order to reverse the priority
        pq.add(3);  //O(logn)
        pq.add(4);
        pq.add(1);
        pq.add(7);
        while(!pq.isEmpty()){
            System.out.println(pq.peek());  //O(1)
            pq.remove();  //O(logn)
        }
        PriorityQueue<Student> p=new PriorityQueue<>();
        p.add(new Student("A",4));
        p.add(new Student("B",5));
        p.add(new Student("C",2));
        p.add(new Student("D",12));
        while(!p.isEmpty()){
            System.out.println(p.peek().name+"->"+p.peek().rank);
            p.remove();
        }
    }}
