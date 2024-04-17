package com.withings.comm.trace;

import androidx.camera.core.y1;
import androidx.fragment.app.o;
import java.util.Arrays;
import kotlin.jvm.internal.u;
/* compiled from: TraceFilesRepository.kt */
/* loaded from: classes3.dex */
public interface b {

    /* compiled from: TraceFilesRepository.kt */
    /* loaded from: classes3.dex */
    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        private final byte[] f33193a;

        public a(byte[] bArr) {
            this.f33193a = bArr;
        }

        public final byte[] a() {
            return this.f33193a;
        }

        public final boolean equals(Object obj) {
            Class<?> cls;
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (!u.e(a.class, cls)) {
                return false;
            }
            u.h(obj, "null cannot be cast to non-null type com.withings.comm.trace.TraceContent.BYTE");
            return Arrays.equals(this.f33193a, ((a) obj).f33193a);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f33193a);
        }

        public final String toString() {
            return o.d("BYTE(content=", Arrays.toString(this.f33193a), ")");
        }
    }

    /* compiled from: TraceFilesRepository.kt */
    /* renamed from: com.withings.comm.trace.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0448b implements b {

        /* renamed from: a  reason: collision with root package name */
        private final String f33194a;

        public C0448b(String content) {
            u.j(content, "content");
            this.f33194a = content;
        }

        public final String a() {
            return this.f33194a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C0448b) && u.e(this.f33194a, ((C0448b) obj).f33194a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f33194a.hashCode();
        }

        public final String toString() {
            return y1.e(new StringBuilder("JSON(content="), this.f33194a, ")");
        }
    }

    /* compiled from: TraceFilesRepository.kt */
    /* loaded from: classes3.dex */
    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        private final String f33195a;

        public c(String str) {
            this.f33195a = str;
        }

        public final String a() {
            return this.f33195a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && u.e(this.f33195a, ((c) obj).f33195a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f33195a.hashCode();
        }

        public final String toString() {
            return y1.e(new StringBuilder("RAW(content="), this.f33195a, ")");
        }
    }
}
