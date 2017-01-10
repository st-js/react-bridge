package org.stjs.bridge.react.internal;

import org.stjs.javascript.functions.Function2;

public abstract class StatelessComponent<P> implements Function2<P, Object, ReactElement<?>> {
	public ValidationMap<P> propTypes;
	public ValidationMap<?> contextTypes;
	public P defaultProps;
	public String displayName;
}