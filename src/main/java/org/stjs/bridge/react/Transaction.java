package org.stjs.bridge.react;

import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.functions.Function;
import org.stjs.javascript.functions.Function0;

/**
 * `Transaction` creates a black box that is able to wrap any method such that
 * certain invariants are maintained before and after the method is invoked
 * (Even if an exception is thrown while invoking the wrapped method). Whoever
 * instantiates a transaction can provide enforcers of the invariants at
 * creation time. The `Transaction` class itself will supply one additional
 * automatic invariant for you - the invariant that any transaction instance
 * should not be run while it is already being run. You would typically create a
 * single instance of a `Transaction` for reuse multiple times, that potentially
 * is used to wrap several different methods. Wrappers are extremely simple -
 * they only require implementing two methods.
 *
 * <pre>
 * wrappers (injected at creation time)
 * + +
 * | |
 * +-----------------|--------|--------------+
 * | v | |
 * | +---------------+ | |
 * | +--| wrapper1 |---|----+ |
 * | | +---------------+ v | |
 * | | +-------------+ | |
 * | | +----| wrapper2 |--------+ |
 * | | | +-------------+ | | |
 * | | | | | |
 * | v v v v | wrapper
 * | +---+ +---+ +---------+ +---+ +---+ | invariants
 * perform(anyMethod) | | | | | | | | | | | | maintained
 * +----------------->|-|---|-|---|-->|anyMethod|---|---|-|---|-|-------->
 * | | | | | | | | | | | |
 * | | | | | | | | | | | |
 * | | | | | | | | | | | |
 * | +---+ +---+ +---------+ +---+ +---+ |
 * | initialize close |
 * +-----------------------------------------+
 * </pre>
 *
 * Use cases:
 * - Preserving the input selection ranges before/after reconciliation.
 * Restoring selection even in the event of an unexpected error.
 * - Deactivating events while rearranging the DOM, preventing blurs/focuses,
 * while guaranteeing that afterwards, the event system is reactivated.
 * - Flushing a queue of collected DOM mutations to the main UI thread after a
 * reconciliation takes place in a worker thread.
 * - Invoking any collected `componentDidUpdate` callbacks after rendering new
 * content.
 * - (Future use case): Wrapping particular flushes of the `ReactWorker` queue
 * to preserve the `scrollTop` (an automatic scroll aware DOM).
 * - (Future use case): Layout calculations before and after DOM updates.
 *
 * Transactional plugin API:
 * - A module that has an `initialize` method that returns any precomputation.
 * - and a `close` method that accepts the precomputation. `close` is invoked
 * when the wrapped process is completed, or has failed.
 */
@SyntheticType
public abstract class Transaction {
    /**
     * @return {array<object>} List of operation wrap proceedures.
     * TODO: convert to array<TransactionWrapper>
     */
    public abstract Enum getTransactionWrappers();

    /**
     * Sets up this instance so that it is prepared for collecting metrics. Does
     * so such that this setup method may be used on an instance that is already
     * initialized, in a way that does not consume additional memory upon reuse.
     * That can be useful if you decide to make your subclass of this mixin a
     * "PooledClass".
     */
    public native void reinitializeTransaction();

    public native boolean isInTransaction();

    /**
     * Executes the function within a safety window. Use this for the top level
     * methods that result in large amounts of computation/mutations that would
     * need to be safety checked.
     *
     * @param method Member of scope to call.
     * @param scope Scope to invoke from.
     * @param args Arguments to pass to the method (optional).
     * Helps prevent need to bind in many cases.
     * @return Return value from `method`.
     */
    //TODO :: fix generics
    //public native <T extends Function<R>> R perform(T method, Object scope, Object... args);
    public native <T> T perform(Function0<T> method, Object scope);

    public native void initializeAll(Integer startIndex);

    /**
     * Invokes each of `this.transactionWrappers.close[i]` functions, passing into
     * them the respective return values of `this.transactionWrappers.init[i]`
     * (`close`rs that correspond to initializers that failed will not be
     * invoked).
     */
    public native void closeAll(Integer startIndex);
}
