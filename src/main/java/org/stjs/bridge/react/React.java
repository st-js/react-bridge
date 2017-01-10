package org.stjs.bridge.react;

import org.stjs.bridge.react.internal.ComponentClass;
import org.stjs.bridge.react.internal.Context;
import org.stjs.bridge.react.internal.Props;
import org.stjs.bridge.react.internal.ReactClass;
import org.stjs.bridge.react.internal.ReactClassInterface;
import org.stjs.bridge.react.internal.ReactElement;
import org.stjs.bridge.react.internal.ReactMixin;
import org.stjs.bridge.react.internal.TypeChecker;
import org.stjs.javascript.Array;
import org.stjs.javascript.Map;
import org.stjs.javascript.functions.Callback1;
import org.stjs.javascript.functions.Function1;
import org.stjs.javascript.functions.Function2;

public class React {

	public static String version;

	/**
	 * This is the base class for React Components when they're defined using ES6 classes. See (Reusable Components =>
	 * https://facebook.github.io/react/docs/reusable-components.html#es6-classes) for how to use ES6 classes with
	 * React. For what methods are actually provided by the base class, see the (Component API =>
	 * https://facebook.github.io/react/docs/component-api.html).
	 */
	public static Class<Component> Component;

	/**
	 * Create a component class, given a specification. A component implements a render method which returns one single
	 * child. That child may have an arbitrarily deep child structure. One thing that makes components different than
	 * standard prototypal classes is that you don't need to call new on them. They are convenience wrappers that
	 * construct backing instances (via new) for you.
	 */
	public native static ReactClass<?, ?> createClass(Map<String, Object> description);

	public static native ReactMixin<?, ?> createMixin(Map<String, String> mixin);

	/**
	 * Create and return a new ReactElement of the given type. The type argument can be either an html tag name string
	 * (eg. 'div', 'span', etc), or a ReactClass (created via React.createClass).
	 */
	public static native <P extends Props, C extends ReactClassInterface<P, ?>> ReactElement<C> createElement(Class<C> clazz, P props);

	public static native <P extends Props, C extends ReactClassInterface<P, ?>> ReactElement<C> createElement(Class<C> clazz, P props,
		Object... children);

	public static native <P extends Props, C extends ReactClassInterface<P, ?>> ReactElement<C> createElement(ComponentClass<P> clazz, P props);

	public static native <P extends Props, C extends ReactClassInterface<P, ?>> ReactElement<C> createElement(ComponentClass<P> clazz, P props,
		Object... children);

	public static native ReactElement<?> createElement(String element, Map<String, Object> props);

	public static native ReactElement<?> createElement(String element, Map<String, Object> props, Object... children);

	/**
	 * Clone and return a new ReactElement using element as the starting point. The resulting element will have the
	 * original element's props with the new props merged in shallowly. New children will replace existing children.
	 * Unlike React.addons.cloneWithProps, key and ref from the original element will be preserved. There is no special
	 * behavior for merging any props (unlike cloneWithProps). See the v0.13 RC2 blog post for additional details.
	 */
	public static native <C extends ReactClassInterface<?, ?>> ReactElement<C> cloneElement(ReactElement<C> element);

	public static native <P extends Props, C extends ReactClassInterface<P, ?>> ReactElement<C> cloneElement(ReactElement<C> element, P props);

	public static native <P extends Props, C extends ReactClassInterface<P, ?>> ReactElement<C> cloneElement(ReactElement<C> element, P props,
		Object... children);

	/**
	 * Return a function that produces ReactElements of a given type. Like React.createElement, the type argument can be
	 * either an html tag name string (eg. 'div', 'span', etc), or a ReactClass.
	 */
	public static native <P extends Props, C extends ReactClassInterface<P, ?>> Function2<P, Object, ReactElement<C>> createFactory(
		Class<C> clazz);

	public static native Function2<Map<String, String>, Object, ReactElement<?>> createFactory(String type);

	/**
	 * Verifies the object is a ReactElement.
	 */
	public static native boolean isValidElement(Object object);

	/**
	 * React.DOM provides convenience wrappers around React.createElement for DOM components. These should only be used
	 * when not using JSX. For example, React.DOM.div(null, 'Hello World!')
	 */
	public static class DOM {
		public static native ReactElement<?> a();

		public static native ReactElement<?> a(Map<String, Object> attributes);

		public static native ReactElement<?> a(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> abbr();

		public static native ReactElement<?> abbr(Map<String, Object> attributes);

		public static native ReactElement<?> abbr(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> address();

		public static native ReactElement<?> address(Map<String, Object> attributes);

		public static native ReactElement<?> address(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> area();

		public static native ReactElement<?> area(Map<String, Object> attributes);

		public static native ReactElement<?> area(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> article();

		public static native ReactElement<?> article(Map<String, Object> attributes);

		public static native ReactElement<?> article(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> aside();

		public static native ReactElement<?> aside(Map<String, Object> attributes);

		public static native ReactElement<?> aside(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> audio();

		public static native ReactElement<?> audio(Map<String, Object> attributes);

		public static native ReactElement<?> audio(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> b();

		public static native ReactElement<?> b(Map<String, Object> attributes);

		public static native ReactElement<?> b(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> base();

		public static native ReactElement<?> base(Map<String, Object> attributes);

		public static native ReactElement<?> base(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> bdi();

		public static native ReactElement<?> bdi(Map<String, Object> attributes);

		public static native ReactElement<?> bdi(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> bdo();

		public static native ReactElement<?> bdo(Map<String, Object> attributes);

		public static native ReactElement<?> bdo(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> big();

		public static native ReactElement<?> big(Map<String, Object> attributes);

		public static native ReactElement<?> big(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> blockquote();

		public static native ReactElement<?> blockquote(Map<String, Object> attributes);

		public static native ReactElement<?> blockquote(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> body();

		public static native ReactElement<?> body(Map<String, Object> attributes);

		public static native ReactElement<?> body(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> br();

		public static native ReactElement<?> br(Map<String, Object> attributes);

		public static native ReactElement<?> br(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> button();

		public static native ReactElement<?> button(Map<String, Object> attributes);

		public static native ReactElement<?> button(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> canvas();

		public static native ReactElement<?> canvas(Map<String, Object> attributes);

		public static native ReactElement<?> canvas(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> caption();

		public static native ReactElement<?> caption(Map<String, Object> attributes);

		public static native ReactElement<?> caption(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> cite();

		public static native ReactElement<?> cite(Map<String, Object> attributes);

		public static native ReactElement<?> cite(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> code();

		public static native ReactElement<?> code(Map<String, Object> attributes);

		public static native ReactElement<?> code(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> col();

		public static native ReactElement<?> col(Map<String, Object> attributes);

		public static native ReactElement<?> col(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> colgroup();

		public static native ReactElement<?> colgroup(Map<String, Object> attributes);

		public static native ReactElement<?> colgroup(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> data();

		public static native ReactElement<?> data(Map<String, Object> attributes);

		public static native ReactElement<?> data(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> datalist();

		public static native ReactElement<?> datalist(Map<String, Object> attributes);

		public static native ReactElement<?> datalist(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> dd();

		public static native ReactElement<?> dd(Map<String, Object> attributes);

		public static native ReactElement<?> dd(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> del();

		public static native ReactElement<?> del(Map<String, Object> attributes);

		public static native ReactElement<?> del(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> details();

		public static native ReactElement<?> details(Map<String, Object> attributes);

		public static native ReactElement<?> details(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> dfn();

		public static native ReactElement<?> dfn(Map<String, Object> attributes);

		public static native ReactElement<?> dfn(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> dialog();

		public static native ReactElement<?> dialog(Map<String, Object> attributes);

		public static native ReactElement<?> dialog(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> div();

		public static native ReactElement<?> div(Map<String, Object> attributes);

		public static native ReactElement<?> div(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> dl();

		public static native ReactElement<?> dl(Map<String, Object> attributes);

		public static native ReactElement<?> dl(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> dt();

		public static native ReactElement<?> dt(Map<String, Object> attributes);

		public static native ReactElement<?> dt(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> em();

		public static native ReactElement<?> em(Map<String, Object> attributes);

		public static native ReactElement<?> em(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> embed();

		public static native ReactElement<?> embed(Map<String, Object> attributes);

		public static native ReactElement<?> embed(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> fieldset();

		public static native ReactElement<?> fieldset(Map<String, Object> attributes);

		public static native ReactElement<?> fieldset(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> figcaption();

		public static native ReactElement<?> figcaption(Map<String, Object> attributes);

		public static native ReactElement<?> figcaption(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> figure();

		public static native ReactElement<?> figure(Map<String, Object> attributes);

		public static native ReactElement<?> figure(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> footer();

		public static native ReactElement<?> footer(Map<String, Object> attributes);

		public static native ReactElement<?> footer(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> form();

		public static native ReactElement<?> form(Map<String, Object> attributes);

		public static native ReactElement<?> form(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> h1();

		public static native ReactElement<?> h1(Map<String, Object> attributes);

		public static native ReactElement<?> h1(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> h2();

		public static native ReactElement<?> h2(Map<String, Object> attributes);

		public static native ReactElement<?> h2(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> h3();

		public static native ReactElement<?> h3(Map<String, Object> attributes);

		public static native ReactElement<?> h3(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> h4();

		public static native ReactElement<?> h4(Map<String, Object> attributes);

		public static native ReactElement<?> h4(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> h5();

		public static native ReactElement<?> h5(Map<String, Object> attributes);

		public static native ReactElement<?> h5(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> h6();

		public static native ReactElement<?> h6(Map<String, Object> attributes);

		public static native ReactElement<?> h6(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> head();

		public static native ReactElement<?> head(Map<String, Object> attributes);

		public static native ReactElement<?> head(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> header();

		public static native ReactElement<?> header(Map<String, Object> attributes);

		public static native ReactElement<?> header(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> hr();

		public static native ReactElement<?> hr(Map<String, Object> attributes);

		public static native ReactElement<?> hr(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> html();

		public static native ReactElement<?> html(Map<String, Object> attributes);

		public static native ReactElement<?> html(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> i();

		public static native ReactElement<?> i(Map<String, Object> attributes);

		public static native ReactElement<?> i(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> iframe();

		public static native ReactElement<?> iframe(Map<String, Object> attributes);

		public static native ReactElement<?> iframe(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> img();

		public static native ReactElement<?> img(Map<String, Object> attributes);

		public static native ReactElement<?> img(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> input();

		public static native ReactElement<?> input(Map<String, Object> attributes);

		public static native ReactElement<?> input(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> ins();

		public static native ReactElement<?> ins(Map<String, Object> attributes);

		public static native ReactElement<?> ins(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> kbd();

		public static native ReactElement<?> kbd(Map<String, Object> attributes);

		public static native ReactElement<?> kbd(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> keygen();

		public static native ReactElement<?> keygen(Map<String, Object> attributes);

		public static native ReactElement<?> keygen(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> label();

		public static native ReactElement<?> label(Map<String, Object> attributes);

		public static native ReactElement<?> label(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> legend();

		public static native ReactElement<?> legend(Map<String, Object> attributes);

		public static native ReactElement<?> legend(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> li();

		public static native ReactElement<?> li(Map<String, Object> attributes);

		public static native ReactElement<?> li(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> link();

		public static native ReactElement<?> link(Map<String, Object> attributes);

		public static native ReactElement<?> link(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> main();

		public static native ReactElement<?> main(Map<String, Object> attributes);

		public static native ReactElement<?> main(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> map();

		public static native ReactElement<?> map(Map<String, Object> attributes);

		public static native ReactElement<?> map(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> mark();

		public static native ReactElement<?> mark(Map<String, Object> attributes);

		public static native ReactElement<?> mark(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> menu();

		public static native ReactElement<?> menu(Map<String, Object> attributes);

		public static native ReactElement<?> menu(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> menuitem();

		public static native ReactElement<?> menuitem(Map<String, Object> attributes);

		public static native ReactElement<?> menuitem(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> meta();

		public static native ReactElement<?> meta(Map<String, Object> attributes);

		public static native ReactElement<?> meta(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> meter();

		public static native ReactElement<?> meter(Map<String, Object> attributes);

		public static native ReactElement<?> meter(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> nav();

		public static native ReactElement<?> nav(Map<String, Object> attributes);

		public static native ReactElement<?> nav(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> noscript();

		public static native ReactElement<?> noscript(Map<String, Object> attributes);

		public static native ReactElement<?> noscript(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> object();

		public static native ReactElement<?> object(Map<String, Object> attributes);

		public static native ReactElement<?> object(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> ol();

		public static native ReactElement<?> ol(Map<String, Object> attributes);

		public static native ReactElement<?> ol(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> optgroup();

		public static native ReactElement<?> optgroup(Map<String, Object> attributes);

		public static native ReactElement<?> optgroup(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> option();

		public static native ReactElement<?> option(Map<String, Object> attributes);

		public static native ReactElement<?> option(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> output();

		public static native ReactElement<?> output(Map<String, Object> attributes);

		public static native ReactElement<?> output(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> p();

		public static native ReactElement<?> p(Map<String, Object> attributes);

		public static native ReactElement<?> p(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> param();

		public static native ReactElement<?> param(Map<String, Object> attributes);

		public static native ReactElement<?> param(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> picture();

		public static native ReactElement<?> picture(Map<String, Object> attributes);

		public static native ReactElement<?> picture(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> pre();

		public static native ReactElement<?> pre(Map<String, Object> attributes);

		public static native ReactElement<?> pre(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> progress();

		public static native ReactElement<?> progress(Map<String, Object> attributes);

		public static native ReactElement<?> progress(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> q();

		public static native ReactElement<?> q(Map<String, Object> attributes);

		public static native ReactElement<?> q(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> rp();

		public static native ReactElement<?> rp(Map<String, Object> attributes);

		public static native ReactElement<?> rp(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> rt();

		public static native ReactElement<?> rt(Map<String, Object> attributes);

		public static native ReactElement<?> rt(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> ruby();

		public static native ReactElement<?> ruby(Map<String, Object> attributes);

		public static native ReactElement<?> ruby(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> s();

		public static native ReactElement<?> s(Map<String, Object> attributes);

		public static native ReactElement<?> s(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> samp();

		public static native ReactElement<?> samp(Map<String, Object> attributes);

		public static native ReactElement<?> samp(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> script();

		public static native ReactElement<?> script(Map<String, Object> attributes);

		public static native ReactElement<?> script(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> section();

		public static native ReactElement<?> section(Map<String, Object> attributes);

		public static native ReactElement<?> section(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> select();

		public static native ReactElement<?> select(Map<String, Object> attributes);

		public static native ReactElement<?> select(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> small();

		public static native ReactElement<?> small(Map<String, Object> attributes);

		public static native ReactElement<?> small(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> source();

		public static native ReactElement<?> source(Map<String, Object> attributes);

		public static native ReactElement<?> source(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> span();

		public static native ReactElement<?> span(Map<String, Object> attributes);

		public static native ReactElement<?> span(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> strong();

		public static native ReactElement<?> strong(Map<String, Object> attributes);

		public static native ReactElement<?> strong(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> style();

		public static native ReactElement<?> style(Map<String, Object> attributes);

		public static native ReactElement<?> style(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> sub();

		public static native ReactElement<?> sub(Map<String, Object> attributes);

		public static native ReactElement<?> sub(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> summary();

		public static native ReactElement<?> summary(Map<String, Object> attributes);

		public static native ReactElement<?> summary(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> sup();

		public static native ReactElement<?> sup(Map<String, Object> attributes);

		public static native ReactElement<?> sup(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> table();

		public static native ReactElement<?> table(Map<String, Object> attributes);

		public static native ReactElement<?> table(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> tbody();

		public static native ReactElement<?> tbody(Map<String, Object> attributes);

		public static native ReactElement<?> tbody(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> td();

		public static native ReactElement<?> td(Map<String, Object> attributes);

		public static native ReactElement<?> td(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> textarea();

		public static native ReactElement<?> textarea(Map<String, Object> attributes);

		public static native ReactElement<?> textarea(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> tfoot();

		public static native ReactElement<?> tfoot(Map<String, Object> attributes);

		public static native ReactElement<?> tfoot(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> th();

		public static native ReactElement<?> th(Map<String, Object> attributes);

		public static native ReactElement<?> th(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> thead();

		public static native ReactElement<?> thead(Map<String, Object> attributes);

		public static native ReactElement<?> thead(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> time();

		public static native ReactElement<?> time(Map<String, Object> attributes);

		public static native ReactElement<?> time(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> title();

		public static native ReactElement<?> title(Map<String, Object> attributes);

		public static native ReactElement<?> title(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> tr();

		public static native ReactElement<?> tr(Map<String, Object> attributes);

		public static native ReactElement<?> tr(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> track();

		public static native ReactElement<?> track(Map<String, Object> attributes);

		public static native ReactElement<?> track(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> u();

		public static native ReactElement<?> u(Map<String, Object> attributes);

		public static native ReactElement<?> u(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> ul();

		public static native ReactElement<?> ul(Map<String, Object> attributes);

		public static native ReactElement<?> ul(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> var();

		public static native ReactElement<?> var(Map<String, Object> attributes);

		public static native ReactElement<?> var(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> video();

		public static native ReactElement<?> video(Map<String, Object> attributes);

		public static native ReactElement<?> video(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> wbr();

		public static native ReactElement<?> wbr(Map<String, Object> attributes);

		public static native ReactElement<?> wbr(Map<String, Object> attributes, Object... children);

		// SVG Tags

		public static native ReactElement<?> circle();

		public static native ReactElement<?> circle(Map<String, Object> attributes);

		public static native ReactElement<?> circle(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> defs();

		public static native ReactElement<?> defs(Map<String, Object> attributes);

		public static native ReactElement<?> defs(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> ellipse();

		public static native ReactElement<?> ellipse(Map<String, Object> attributes);

		public static native ReactElement<?> ellipse(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> g();

		public static native ReactElement<?> g(Map<String, Object> attributes);

		public static native ReactElement<?> g(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> image();

		public static native ReactElement<?> image(Map<String, Object> attributes);

		public static native ReactElement<?> image(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> line();

		public static native ReactElement<?> line(Map<String, Object> attributes);

		public static native ReactElement<?> line(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> linearGradient();

		public static native ReactElement<?> linearGradient(Map<String, Object> attributes);

		public static native ReactElement<?> linearGradient(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> mask();

		public static native ReactElement<?> mask(Map<String, Object> attributes);

		public static native ReactElement<?> mask(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> path();

		public static native ReactElement<?> path(Map<String, Object> attributes);

		public static native ReactElement<?> path(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> pattern();

		public static native ReactElement<?> pattern(Map<String, Object> attributes);

		public static native ReactElement<?> pattern(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> polygon();

		public static native ReactElement<?> polygon(Map<String, Object> attributes);

		public static native ReactElement<?> polygon(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> polyline();

		public static native ReactElement<?> polyline(Map<String, Object> attributes);

		public static native ReactElement<?> polyline(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> radialGradient();

		public static native ReactElement<?> radialGradient(Map<String, Object> attributes);

		public static native ReactElement<?> radialGradient(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> rect();

		public static native ReactElement<?> rect(Map<String, Object> attributes);

		public static native ReactElement<?> rect(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> stop();

		public static native ReactElement<?> stop(Map<String, Object> attributes);

		public static native ReactElement<?> stop(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> svg();

		public static native ReactElement<?> svg(Map<String, Object> attributes);

		public static native ReactElement<?> svg(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> text();

		public static native ReactElement<?> text(Map<String, Object> attributes);

		public static native ReactElement<?> text(Map<String, Object> attributes, Object... children);

		public static native ReactElement<?> tspan();

		public static native ReactElement<?> tspan(Map<String, Object> attributes);

		public static native ReactElement<?> tspan(Map<String, Object> attributes, Object... children);
	}

	/**
	 * React.PropTypes includes types that can be used with a component's propTypes object to validate props being
	 * passed to your components. For more information about propTypes, see Reusable Components.
	 */
	public static class PropTypes {
		public static TypeChecker array;
		public static TypeChecker bool;
		public static TypeChecker func;
		public static TypeChecker number;
		public static TypeChecker object;
		public static TypeChecker string;

		public static TypeChecker any;
		public static TypeChecker node;
		public static TypeChecker element;

		public static native TypeChecker arrayOf(Array<TypeChecker> types);

		public static native TypeChecker instanceOf(Class<?> cl);

		public static native TypeChecker objectOf(Array<TypeChecker> types);

		public static native TypeChecker oneOf(Array<String> values);

		public static native TypeChecker oneOfType(Array<TypeChecker> types);

		public static native TypeChecker shape(Map<String, TypeChecker> shape);
	}

	/**
	 * React.Children provides utilities for dealing with the this.props.children opaque data structure.
	 */
	public static class Children {
		/**
		 * Invoke fn on every immediate child contained within children with this set to context. If children is a
		 * nested object or array it will be traversed: fn will never be passed the container objects. If children is
		 * null or undefined returns null or undefined rather than an empty object.
		 */
		public static native <V> Map<?, V> map(Map<?, V> children, Function1<V, V> callback);

		public static native <V> Map<?, V> map(Map<?, V> children, Function1<V, V> callback, Context context);

		/**
		 * Like React.Children.map() but does not return an object.
		 */
		public static native <V> void forEach(Map<?, V> children, Callback1<V> callback);

		public static native <V> void forEach(Map<?, V> children, Callback1<V> callback, Context context);

		/**
		 * Return the total number of components in children, equal to the number of times that a callback passed to map
		 * or forEach would be invoked.
		 */
		public static native Integer count(Object children);

		/**
		 * Return the only child in children. Throws otherwise.
		 */
		public static native <T> T only(Object children);

		/**
		 * Return the children opaque data structure as a flat array with keys assigned to each child. Useful if you
		 * want to manipulate collections of children in your render methods, especially if you want to reorder or slice
		 * this.props.children before passing it down.
		 */
		public static native <V> Map<?, V> toArray(Object children);
	}

	// TODO :: finish signature
	public static native void __spread();
}
