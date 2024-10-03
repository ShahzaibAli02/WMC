package no.wmc.utils.ext

/**
 * Use it when Lazy instance is guaranteed to be initialized from one thread.
 */
fun <T> lazyUnsafe(initializer:() -> T): Lazy<T> = lazy(LazyThreadSafetyMode.NONE, initializer)
