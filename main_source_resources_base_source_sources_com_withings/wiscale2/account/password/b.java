package com.withings.wiscale2.account.password;

import androidx.camera.camera2.internal.o0;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.load.kotlin.b0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.d0;
/* compiled from: ChangePasswordViewModel_HiltModules.java */
/* loaded from: classes4.dex */
public final class b implements ak0.b {
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0103, code lost:
        c(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0106, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01da, code lost:
        c(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01dd, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01de, code lost:
        r0 = (short) (r6 - r21);
        r1 = (short) (r5 - r23);
        r2 = 65535;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int a(java.nio.ByteBuffer r19, java.lang.CharSequence r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.account.password.b.a(java.nio.ByteBuffer, java.lang.CharSequence, int, int, int, int):int");
    }

    public static final int b(kotlin.reflect.jvm.internal.calls.a aVar) {
        u.j(aVar, "<this>");
        return aVar.a().size();
    }

    public static final void c(int i11) {
        throw new IllegalArgumentException(o0.a("Malformed code-point ", i11, " found"));
    }

    public static final String d(nn0.b classDescriptor, String jvmDescriptor) {
        String e11;
        u.j(classDescriptor, "classDescriptor");
        u.j(jvmDescriptor, "jvmDescriptor");
        int i11 = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.f76496o;
        kotlin.reflect.jvm.internal.impl.name.d j5 = lo0.c.g(classDescriptor).j();
        u.i(j5, "fqNameSafe.toUnsafe()");
        kotlin.reflect.jvm.internal.impl.name.b k11 = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.k(j5);
        if (k11 != null) {
            e11 = mo0.c.b(k11).f();
            u.i(e11, "byClassId(it).internalName");
        } else {
            e11 = ah.m.e(classDescriptor, d0.f76694a);
        }
        return b0.g(e11, jvmDescriptor);
    }
}
