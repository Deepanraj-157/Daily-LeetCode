class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class MyLinkedList {
    ListNode head;

    public MyLinkedList() {
        head = null;
    }

    public int get(int index) {
        ListNode tmp = head;

        while (tmp != null) {
            if (index == 0) {
                return tmp.val;
            }

            index--;
            tmp = tmp.next;
        }

        return -1;
    }

    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);

        newNode.next = head;
        head = newNode;
    }

    public void addAtTail(int val) {
        ListNode newNode = new ListNode(val);

        if (head == null) {
            head = newNode;
            return;
        }

        ListNode tmp = head;

        while (tmp.next != null) {
            tmp = tmp.next;
        }

        tmp.next = newNode;
    }

    public void addAtIndex(int index, int val) {

        // Add at head
        if (index == 0) {
            addAtHead(val);
            return;
        }

        ListNode tmp = head;

        // Move to node before required index
        for (int i = 0; i < index - 1 && tmp != null; i++) {
            tmp = tmp.next;
        }

        // Invalid index
        if (tmp == null) {
            return;
        }

        ListNode newNode = new ListNode(val);

        newNode.next = tmp.next;
        tmp.next = newNode;
    }

    public void deleteAtIndex(int index) {

        if (head == null) {
            return;
        }

        // Delete head
        if (index == 0) {
            head = head.next;
            return;
        }

        ListNode tmp = head;

        // Move to node before required index
        for (int i = 0; i < index - 1 && tmp.next != null; i++) {
            tmp = tmp.next;
        }

        // Index doesn't exist
        if (tmp.next == null) {
            return;
        }

        tmp.next = tmp.next.next;
    }
}
// class ListNode{
//     int val;
//     ListNode next;
//     ListNode(int val){
//         this.val=val;
//         this.next=null;
//     }
// }
// class MyLinkedList {
//     ListNode head;
//     public MyLinkedList() {
//         head=null;
//     }
    
//     public int get(int index) {
//         if(head==null) return -1;
//         ListNode tmp=head;
//         while(tmp!=null){
//             if(index==0) return tmp.val;
//             tmp=tmp.next;
//             index--;
//         }
//         return -1;
//     }
    
//     public void addAtHead(int val) {
//         if(head==null){
//             head = new ListNode(val);
//             return;
//         }
//         ListNode newNode=new ListNode(val);
//         newNode.next=head;
//         head=newNode;
        
//     }
    
//     public void addAtTail(int val) {
//         if(head==null){
//             head = new ListNode(val);
//             return;
//         }
//         ListNode newNode=new ListNode(val);
//         ListNode tmp=head;
//         while(tmp!=null && tmp.next!=null){
//             tmp=tmp.next;
//         }
//         tmp.next=newNode;
        
//     }
    
//     public void addAtIndex(int index, int val) {
//         if(head==null && index==0){
//             head=new ListNode(val);
//             return;
//         }
//         if(index==0){
//             ListNode newNode=new ListNode(val);
//             newNode.next=head;
//             head=newNode;
//             return;
//         }
//         else{
//             int i=1;
//             ListNode tmp=head;
//             while(tmp!=null && tmp.next!=null){
//                 if(i==index){
//                     ListNode newNode=new ListNode(val);
//                     newNode.next=tmp.next;
//                     tmp.next=newNode;
//                     break;
//                 }
//                 i++;
//                 tmp=tmp.next;
//             }
//         }
        
//     }
    
//     public void deleteAtIndex(int index) {
//         if(head==null) return;
//         if(index==0){
//             head=head.next;
//             return;
//         }
//         else{
//             int i=1;
//             ListNode tmp=head;
//             while(tmp!=null && tmp.next!=null){
//                 if(i==index){
//                     tmp.next=tmp.next.next;
//                     break;
//                 }
//                 i++;
//                 tmp=tmp.next;
//             }

//         }    
        
//     }
// }

// /**
//  * Your MyLinkedList object will be instantiated and called as such:
//  * MyLinkedList obj = new MyLinkedList();
//  * int param_1 = obj.get(index);
//  * obj.addAtHead(val);
//  * obj.addAtTail(val);
//  * obj.addAtIndex(index,val);
//  * obj.deleteAtIndex(index);
//  */