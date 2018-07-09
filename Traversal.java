package com.chance.base;

import java.util.Stack;

public class Traversal {
	/**
	 * 先序遍历-递归
	 * @param root
	 */
	public static void preorder(TreeNode root){
		if(root == null){
			return;
		}
		System.out.println(root.val);
		preorder(root.left);
		preorder(root.right);
	}
	
	/**
	 * 先序遍历-非递归
	 * @param args
	 */
	public static void preorder2(TreeNode root){
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode node = root;
		while(node!=null || !stack.isEmpty()){
			while(node!=null){
				System.out.println(node.val);
				stack.push(node);
				node = node.left;
			}
			
			if(!stack.isEmpty()){
				node = stack.pop();
				node = node.right;
			}
		}
	}
	/**
	 * 中序遍历-递归
	 * @param root
	 */
	public static void midorder(TreeNode root){
		if(root == null){
			return;
		}		
		preorder(root.left);
		System.out.println(root.val);
		preorder(root.right);
	}
	
	/**
	 * 中序遍历-非递归
	 * @param args
	 */
	public static void midorder2(TreeNode root){
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode node = root;
		while(node!=null || !stack.isEmpty()){
			while(node!=null){
				stack.push(node);
				node = node.left;
			}
			
			if(!stack.isEmpty()){
				node = stack.pop();
				System.out.println(node.val);
				node = node.right;
			}
		}
	}
	/**
	 * 中序遍历-递归
	 * @param root
	 */
	public static void postorder(TreeNode root){
		if(root == null){
			return;
		}		
		preorder(root.left);
		preorder(root.right);
		System.out.println(root.val);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(0);
		TreeNode n11 = new TreeNode(1);
		TreeNode n12 = new TreeNode(2);
		root.left = n11;
		root.right = n12;
		TreeNode n21 = new TreeNode(3);
		n11.left = n21;
		TreeNode n22 = new TreeNode(4);
		n11.right = n22;
		TreeNode n23 = new TreeNode(5);
		n12.right = n23;
		System.out.println("先序遍历-递归");
		preorder(root);
		System.out.println("中序遍历");
		midorder(root);
		
		System.out.println("后序遍历");
		postorder(root);
		
		System.out.println("先序遍历-非递归");
		preorder2(root);
		
		
	}

}

class TreeNode{
	int val ;
	TreeNode left;
	TreeNode right;
	public TreeNode(int value) {
		// TODO Auto-generated constructor stub
		val = value;
	}
}
