package study.lei;
//package study.lei;
//
//public class UndirectedGraphNode {
//	int label;
//	ArrayList<UndirectedGraphNode> neighbors;
//
//	class UndirectedGraphNode(int x) {
//    	label = x;
//	neighbors = new ArrayList<UndirectedGraphNode>();
//    }
//}
//
//	public class TrackNode {
//		UndirectedGraphNode pre;
//		UndirectedGraphNode curr;
//	}
//
//	public class Solution {
//	public ArrayList<UndirectedGraphNode> findUndrectedGraphPath(UndirectedGraphNode A, UndirectedGraphNode B) {
//    	ArrayList<UndirectedGraphNode> result = new ArrayList<>();
//	Map<UndirectedGraphNode, boolean> visited = new HashMap<UndirectedGraphNode, boolean>();
//	Queue<UndirectedGraphNode> queue = new Queue<>();
//	Stack<TrackNode> stack = new Stack<>();
//	boolean isFind = false;
//	// Offer the first GraphNode in the queue
//	queue.offer(A);
//	// Push the first track Node to stack
//	TrackNode trackNode = new TrackNode();
//	trackNode.pre = null;
//	trackNode.curr = A;
//	stack.push(trackNode);
//	while (!queue.empty() && !isFind) {
//	    int k = queue.size();
//	    for (int i = 0; i < k; i++) {
//	    	UndirectedGraphNode node = queue.poll();
//		visited.put(node, true);
//		if (node == B) {
//		    generateTrack(node, result, stack);
//		    return result;
//		}
//		else {
//		    for (UndirectedGraphNode neighbor : node.neighbors) {
//		    	if (!visited.contains(neighbor)) {
//			    queue.offer(neighbor);
//			    trackNode = new TrackNode();
//			    trackNode.pre = node;
//			    trackNode.curr = neighbor;
//			    stack.push(trackNode);
//			}
//		    }
//		}
//	    }
//	}
//	return null;
//    }
//
//		public void generateTrack(UndirectedGraphNode node, ArrayList<UndirectedGraphNode> result,
//				Stack<TrackNode> stack) {
//			Stack<UndirectedGraphNode> backTrackResult = new Stack<>();
//			while (!stack.empty()) {
//				TrackNode trackNode = stack.peek();
//				while (trackNode.curr != node) {
//					trackNode = stack.pop();
//				}
//				backTrackResult.push(node);
//				node = trackNode.pre;
//			}
//			while (!backTrackResult.empty()) {
//				result.add(stack.pop());
//			}
//		}
//}
