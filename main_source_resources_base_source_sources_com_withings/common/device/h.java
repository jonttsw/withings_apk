package com.withings.common.device;

import com.withings.wiscale2.h1;
/* compiled from: CommonDeviceModule.kt */
/* loaded from: classes3.dex */
public interface h {

    /* compiled from: CommonDeviceModule.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private static h f35192a;

        public static h a() {
            h hVar = f35192a;
            if (hVar != null) {
                return hVar;
            }
            throw new IllegalArgumentException("You must call init before using get".toString());
        }

        public static void b(h1 h1Var) {
            f35192a = h1Var;
        }
    }
}
