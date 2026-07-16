class MedianFinder {
    PriorityQueue<Double> maxHeap;
    PriorityQueue<Double> minHeap;

    public MedianFinder() {
        maxHeap=new PriorityQueue<>(
            (b,a)->Double.compare(a,b));
        minHeap=new PriorityQueue<>(
            (a,b)->Double.compare(a,b));
    }
    
    public void addNum(int num) {

        maxHeap.offer((double)num);

        minHeap.offer(maxHeap.poll());

        if (minHeap.size() > maxHeap.size()) {
            maxHeap.offer(minHeap.poll());
        }
    }
    
    public double findMedian() {

        if(minHeap.size() == maxHeap.size())
            return ((maxHeap.peek()+minHeap.peek())/(double)2);
        return maxHeap.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */