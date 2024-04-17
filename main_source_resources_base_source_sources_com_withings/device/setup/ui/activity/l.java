package com.withings.device.setup.ui.activity;

import kotlin.jvm.internal.u;
/* compiled from: SetupActivityContract.kt */
/* loaded from: classes3.dex */
public interface l {

    /* compiled from: SetupActivityContract.kt */
    /* loaded from: classes3.dex */
    public static final class a implements l {

        /* renamed from: a  reason: collision with root package name */
        private final xi.b f37527a;

        public a(xi.b remoteDevice) {
            u.j(remoteDevice, "remoteDevice");
            this.f37527a = remoteDevice;
        }

        public final xi.b a() {
            return this.f37527a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && u.e(this.f37527a, ((a) obj).f37527a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f37527a.hashCode();
        }

        public final String toString() {
            return "Configure(remoteDevice=" + this.f37527a + ")";
        }
    }

    /* compiled from: SetupActivityContract.kt */
    /* loaded from: classes3.dex */
    public static final class b implements l {

        /* renamed from: a  reason: collision with root package name */
        public static final b f37528a = new b();

        private b() {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return true;
        }

        public final int hashCode() {
            return 1346391034;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: SetupActivityContract.kt */
    /* loaded from: classes3.dex */
    public static final class c implements l {

        /* renamed from: a  reason: collision with root package name */
        private final int f37529a;

        public c(int i11) {
            this.f37529a = i11;
        }

        public final int a() {
            return this.f37529a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && this.f37529a == ((c) obj).f37529a) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f37529a);
        }

        public final String toString() {
            return androidx.camera.camera2.internal.e.c(new StringBuilder("Search(deviceModel="), this.f37529a, ")");
        }
    }
}
