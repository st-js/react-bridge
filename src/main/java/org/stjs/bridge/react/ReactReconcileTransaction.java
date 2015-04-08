package org.stjs.bridge.react;

/**
 * Currently:
 * - The order that these are listed in the transaction is critical:
 * - Suppresses events.
 * - Restores selection range.
 *
 * Future:
 * - Restore document/overflow scroll positions that were unintentionally
 * modified via DOM insertions above the top viewport boundary.
 * - Implement/integrate with customized constraint based layout system and keep
 * track of which dimensions must be remeasured.
 */
public class ReactReconcileTransaction extends Transaction {

    public enum TRANSACTION_WRAPPERS {
        PUT_LISTENER_QUEUEING, SELECTION_RESTORATION, EVENT_SUPPRESSION, ON_DOM_READY_QUEUEING
    }

    /**
     * @return {array<object>} List of operation wrap proceedures.
     * TODO: convert to array<TransactionWrapper>
     */
    public native TRANSACTION_WRAPPERS getTransactionWrappers();

    /**
     * @return {object} The queue to collect `onDOMReady` callbacks with.
     */
    //TODO :: finish signature
    public native Object getReactMountReady();

    //TODO :: finish signature
    public native Object getPutListenerQueue();

    /**
     * `PooledClass` looks for this, and will invoke this before allowing this
     * instance to be reused.
     */
    public native void destructor();
}
