package com.seanponeil.kotlinmethodcounttest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import java.util.concurrent.locks.Lock

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this, "Hello World!", Toast.LENGTH_LONG).show()
    }
}

fun toIntOrNull(intString: String): Int {
    return toIntOrNull(intString)
}

fun <T> lock(lock: Lock, body: () -> T): T {
    lock.lock()
    try {
        return body()
    }
    finally {
        lock.unlock()
    }
}

fun <T> max(collection: Collection<T>, less: (T, T) -> Boolean): T? {
    var max: T? = null
    for (it in collection)
        if (max == null || less(max, it))
            max = it
    return max
}
