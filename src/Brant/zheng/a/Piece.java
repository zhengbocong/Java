package Brant.zheng.a;

import java.util.List;

public class Piece {
	private static Point source;
	private static Point target;
	
	private Point parent;
	private Point currentPoint;
	private int g;
	private int h;
	private int f;
	
	private List<Piece> nextPieceList;
	
	

	public static Point getSource() {
		return source;
	}

	public static void setSource(Point source) {
		Piece.source = source;
	}

	public static Point getTarget() {
		return target;
	}

	public static void setTarget(Point target) {
		Piece.target = target;
	}

	public Point getParent() {
		return parent;
	}

	public void setParent(Point parent) {
		this.parent = parent;
	}

	public Point getCurrentPoint() {
		return currentPoint;
	}

	public void setCurrentPoint(Point currentPoint) {
		this.currentPoint = currentPoint;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public int getF() {
		return f;
	}

	public void setF(int f) {
		this.f = f;
	}

	public List<Piece> getNextPieceList() {
		return nextPieceList;
	}

	public void setNextPieceList(List<Piece> nextPieceList) {
		this.nextPieceList = nextPieceList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + f;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Piece other = (Piece) obj;
		if (f != other.f)
			return false;
		return true;
	}
	
	
}
