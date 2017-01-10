package org.stjs.bridge.react.internal;

import org.stjs.javascript.dom.Element;

@IsReactMixin
public abstract class ReactMixin<P extends Props, S extends State> extends ReactClassStatefulInterface<P, S>
		implements ReactClassLifecycleInterface<P, S> {

	@Override
	public void componentWillMount() {

	}

	@Override
	public void componentDidMount() {

	}

	@Override
	public void componentWillReceiveProps(P nextProps) {

	}

	@Override
	public boolean shouldComponentUpdate(P nextProps, S nextState, Context nextContext) {
		return false;
	}

	@Override
	public boolean componentWillUpdate(P nextProps, S nextState, Context nextContext, ReactReconcileTransaction transaction) {
		return false;
	}

	@Override
	public void componentDidUpdate(P prevProps, S prevState, Context prevContext, Element rootNode) {

	}

	@Override
	public void componentWillUnmount() {

	}
}
