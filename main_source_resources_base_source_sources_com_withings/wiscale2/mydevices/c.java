package com.withings.wiscale2.mydevices;

import java.util.List;
import kotlin.jvm.internal.u;
/* compiled from: MyDevicesViewModel.kt */
/* loaded from: classes5.dex */
public interface c {

    /* compiled from: MyDevicesViewModel.kt */
    /* loaded from: classes5.dex */
    public static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        private final List<ph0.a> f58645a;

        public a(List<ph0.a> list) {
            this.f58645a = list;
        }

        public final List<ph0.a> a() {
            return this.f58645a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && u.e(this.f58645a, ((a) obj).f58645a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f58645a.hashCode();
        }

        public final String toString() {
            return defpackage.d.i(new StringBuilder("Loaded(deviceList="), this.f58645a, ")");
        }
    }

    /* compiled from: MyDevicesViewModel.kt */
    /* loaded from: classes5.dex */
    public static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        public static final b f58646a = new b();

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
            return 1814696450;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: MyDevicesViewModel.kt */
    /* renamed from: com.withings.wiscale2.mydevices.c$c  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0759c implements c {

        /* renamed from: a  reason: collision with root package name */
        public static final C0759c f58647a = new C0759c();

        private C0759c() {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0759c)) {
                return false;
            }
            C0759c c0759c = (C0759c) obj;
            return true;
        }

        public final int hashCode() {
            return 919307042;
        }

        public final String toString() {
            return "NoDevices";
        }
    }
}
