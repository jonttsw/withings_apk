package com.withings.device.setup.ui.activity;

import kotlin.jvm.internal.u;
/* compiled from: SetupActivityContract.kt */
/* loaded from: classes3.dex */
public interface a {

    /* compiled from: SetupActivityContract.kt */
    /* renamed from: com.withings.device.setup.ui.activity.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0490a implements a {

        /* renamed from: a  reason: collision with root package name */
        private final xi.b f37507a;

        public C0490a(xi.b remoteDevice) {
            u.j(remoteDevice, "remoteDevice");
            this.f37507a = remoteDevice;
        }

        public final xi.b a() {
            return this.f37507a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C0490a) && u.e(this.f37507a, ((C0490a) obj).f37507a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f37507a.hashCode();
        }

        public final String toString() {
            return "StartConfiguration(remoteDevice=" + this.f37507a + ")";
        }
    }

    /* compiled from: SetupActivityContract.kt */
    /* loaded from: classes3.dex */
    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        private final int f37508a;

        public b(int i11) {
            this.f37508a = i11;
        }

        public final int a() {
            return this.f37508a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && this.f37508a == ((b) obj).f37508a) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f37508a);
        }

        public final String toString() {
            return androidx.camera.camera2.internal.e.c(new StringBuilder("StartSearch(deviceModel="), this.f37508a, ")");
        }
    }
}
