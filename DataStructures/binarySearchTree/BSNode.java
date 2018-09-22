package binarySearchTree;

public class BSNode<K extends Comparable<K>, V> {
	
	private BSNode<K, V> left;
	
	private BSNode<K, V> rigth;
	
	private BSNode<K, V> parent;
	
	private V value;
	
	private K key;
	
	public BSNode(K key,V value) {
		this.key = key;
		this.value = value;
	}

	public BSNode<K, V> getLeft() {
		return left;
	}

	public void setLeft(BSNode<K, V> left) {
		this.left = left;
	}

	public BSNode<K, V> getRigth() {
		return rigth;
	}

	public void setRigth(BSNode<K, V> rigth) {
		this.rigth = rigth;
	}

	public V getValue() {
		return value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public BSNode<K, V> getParent() {
		return parent;
	}

	public void setParent(BSNode<K, V> patern) {
		this.parent = patern;
	}
}
