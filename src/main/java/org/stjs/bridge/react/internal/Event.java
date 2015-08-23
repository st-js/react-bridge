package org.stjs.bridge.react.internal;

import org.stjs.javascript.dom.DOMEvent;
import org.stjs.javascript.dom.Element;

public class Event {
	public boolean bubbles;
	public boolean cancelable;
	public Element currentTarget;
	public boolean defaultPrevented;
	public Object eventPhase;
	public boolean isTrusted;

	/**
	 * The native browser event
	 */
	public DOMEvent nativeEvent;

	/**
	 * The DOM element that initiated the event.
	 */
	public Element target;

	/**
	 * The difference in milliseconds between the time the browser created the event and January 1, 1970.
	 */
	public long timeStamp;

	/**
	 * Describes the nature of the event.
	 */
	public String type;

	/**
	 * Returns whether event.preventDefault() was ever called on this event object.
	 */
	public native boolean isDefaultPrevented();


	/**
	 * Returns whether event.stopPropagation() was ever called on this event object.
	 */
	public native boolean isPropagationStopped();

	/**
	 * If this method is called, the default action of the event will not be triggered.
	 */
	public native void preventDefault();

	/**
	 * Prevents the event from bubbling up the DOM tree, preventing any parent handlers from being notified of the event.
	 */
	public native void stopPropagation();

	// Clipboard events BEGIN
	public Object clipboardData; //DOMDataTransfer
	// Clipboard events END

	// Keyboard / Mouse / Touch input BEGIN
	public boolean altKey;
	public boolean ctrlKey;
	public boolean shiftKey;
	public boolean metaKey;
	public native boolean getModifierState(String key);
	// Keyboard / Mouse / Touch input END

    // Keyboard input BEGIN
	public int charCode;
	public int keyCode;
	public String key;
	public String locale;
	public int location;
	public boolean repeat;
	public int which;
	// Keyboard input END

	// Focus / Mouse event BEGIN
	public Element relatedTarget;
	// Focus / Mouse Focus event END

	// Mouse input BEGIN
	public Object button;
	public Number buttons;
	public int clientX;
	public int clientY;

	/**
	 * The mouse position relative to the left edge of the document.
	 */
	public int pageX;

	/**
	 * The mouse position relative to the top edge of the document.
	 */
	public int pageY;
	public int screenX;
	public int screenY;
	// Mouse input END

    // Touch input BEGIN
	public Object changedTouches; //DOMTouchList
	public Object targetTouches; //DOMTouchList
	public Object touches; //DOMTouchList
	// Touch input END

	// onScroll BEGIN
	public Object detail;
	public Object view; // DOMAbstractView
	// onScroll END

	// onWheel BEGIN
	public Object deltaMode;
	public int deltaX;
	public int deltaY;
	public int deltaZ;
	// onWheel END
}
