package com.aptana.editor.js.parsing.ast;

import java.util.List;

import com.aptana.parsing.Scope;

import beaver.Symbol;

public class JSTrueNode extends JSPrimitiveNode
{
	/**
	 * JSTrueNode
	 * 
	 * @param identifier
	 */
	public JSTrueNode(Symbol identifier)
	{
		this(identifier.getStart(), identifier.getEnd());
	}
	
	/**
	 * JSTrueNode
	 * 
	 * @param start
	 * @param end
	 */
	public JSTrueNode(int start, int end)
	{
		super(JSNodeTypes.TRUE, start, end, "true");
	}

	/* (non-Javadoc)
	 * @see com.aptana.editor.js.parsing.ast.JSNode#addReturnTypes(java.util.List)
	 */
	@Override
	protected void addTypes(List<String> types, Scope<JSNode> scope)
	{
		types.add("Boolean");
	}
}
