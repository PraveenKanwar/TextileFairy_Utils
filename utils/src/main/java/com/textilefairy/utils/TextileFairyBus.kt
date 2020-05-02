package com.textilefairy.utils

import io.reactivex.Observable
import io.reactivex.subjects.PublishSubject

/**
 * Publish Data On Subscribe Base
 *
 * Created by Praveen Kanwar.
 */
@Suppress("unused")
object TextileFairyBus {
    private val publisher = PublishSubject.create<Any>()

    /**
     * Object [Any] To Be Published.
     */
    fun publish(event: Any) {
        publisher.onNext(event)
    }

    /**
     * Object [Class<T>] Is Filter To Listen All Publish Events Of This Class Type
     */
    fun <T> listen(eventType: Class<T>): Observable<T> = publisher.ofType(eventType)
}