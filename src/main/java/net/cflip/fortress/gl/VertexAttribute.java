package net.cflip.fortress.gl;

public class VertexAttribute {
	public VertexAttributeFormat format;
	public int byteCount;
	public int elementCount;
	public boolean normalized;

	public VertexAttribute(int elementCount, VertexAttributeFormat format, boolean normalized) {
		this.format = format;
		this.byteCount = elementCount * format.bytes;
		this.elementCount = elementCount;
		this.normalized = normalized;
	}
}
