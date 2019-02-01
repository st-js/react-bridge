package org.stjs.bridge.react.internal;

import org.stjs.bridge.proptypes.TypeChecker;
import org.stjs.javascript.Map;
import org.stjs.javascript.functions.Function2;

public abstract class StatelessComponent<P> implements Function2<P, Object, ReactElement<?>> {
	public static Map<String, TypeChecker> propTypes;
	public static Map<String, TypeChecker> contextTypes;
	public P defaultProps;
	public String displayName;
}