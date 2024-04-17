package com.withings.util.log;

import android.os.Looper;
import x70.b;
/* loaded from: classes4.dex */
public final class Fail {

    /* loaded from: classes4.dex */
    public static class FailedException extends RuntimeException {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Throwable, com.withings.util.log.Fail$FailedException, java.lang.RuntimeException] */
    private static FailedException a(String str) {
        if (str == null) {
            str = "";
        }
        ?? runtimeException = new RuntimeException(str);
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i11 = 0;
        while (i11 < length && stackTrace[i11].getClassName().equals(Fail.class.getName())) {
            i11++;
        }
        int i12 = length - i11;
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i12];
        System.arraycopy(stackTrace, i11, stackTraceElementArr, 0, i12);
        runtimeException.setStackTrace(stackTraceElementArr);
        return runtimeException;
    }

    public static void b(String str, Object obj, Object obj2) {
        if (obj.equals(obj2)) {
            if (str == null) {
                str = obj + " and " + obj2 + " must not be equal";
            }
            b.p(a(str));
        }
    }

    public static void c(String str, boolean z5) {
        if (!z5) {
            if (str == null) {
                str = "The condition must be true";
            }
            b.p(a(str));
        }
    }

    public static void d() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            b.p(a("Must be called in the main thread"));
        }
    }

    public static void e() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            b.p(a("Must be called in a background thread"));
        }
    }

    public static void f(String str, Number number, Number number2) {
        if (!number.equals(number2)) {
            b.p(a(str));
        }
    }

    public static void g(Object obj, String str) {
        if (obj != null) {
            if (str == null) {
                str = obj.toString() + " must be null";
            }
            b.p(a(str));
        }
    }

    public static void h(Object obj, String str) {
        if (obj == null) {
            if (str == null) {
                str = "The parameter must not be null";
            }
            b.p(a(str));
        }
    }

    public static void i(String str, boolean z5) {
        if (z5) {
            if (str == null) {
                str = "The condition must be false";
            }
            b.p(a(str));
        }
    }

    public static void j(String str) {
        b.p(a(str));
    }
}
