import java.util.Collections;
import java.util.PriorityQueue;

public class median_of_dataStream {
    class MedianFinder {
        private PriorityQueue<Integer> minheap,maxheap;
        public MedianFinder() {
            minheap=new PriorityQueue<>();
            maxheap=new PriorityQueue<>(Collections.reverseOrder());
        }
        
        public void addNum(int num) {
            maxheap.add(num);
            minheap.add(maxheap.poll());
            if(maxheap.size()<minheap.size()){
                maxheap.add(minheap.poll());
            }
        }
        
        public double findMedian() {
            if(maxheap.size()>minheap.size()){
                return maxheap.peek();
            }
            return (minheap.peek()+maxheap.peek())/2.0;
        }
    }

    /**
     * Your MedianFinder object will be instantiated and called as such:
     * MedianFinder obj = new MedianFinder();
     * obj.addNum(num);
     * double param_2 = obj.findMedian();
     */
}
