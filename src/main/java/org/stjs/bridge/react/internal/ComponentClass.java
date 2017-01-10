package org.stjs.bridge.react.internal;

import org.stjs.bridge.react.Component;
import org.stjs.javascript.annotation.Namespace;

@Namespace("React")
public abstract class ComponentClass<P extends Props> {
	public native <ComponentState extends State> Component<P, ComponentState> _new(P props, Object context);

	public ValidationMap<P> propTypes;
	public ValidationMap<?> contextTypes;
	public ValidationMap<?> childContextTypes;
	public P defaultProps;
	public String displayName;
}