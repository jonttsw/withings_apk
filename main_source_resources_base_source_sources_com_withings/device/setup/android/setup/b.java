package com.withings.device.setup.android.setup;

import com.withings.device.setup.android.setup.handcalibration.HandsCalibrationConversation;
import com.withings.user.core.models.User;
import nm0.y;
/* compiled from: SetupState.kt */
/* loaded from: classes3.dex */
public interface b<T> {

    /* compiled from: SetupState.kt */
    /* loaded from: classes3.dex */
    public static final class a implements b<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f37400a = new a();

        private a() {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return true;
        }

        public final int hashCode() {
            return 1670034767;
        }

        public final String toString() {
            return "CalibrationShallEnd";
        }
    }

    /* compiled from: SetupState.kt */
    /* renamed from: com.withings.device.setup.android.setup.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0489b implements b<y> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0489b f37401a = new C0489b();

        private C0489b() {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0489b)) {
                return false;
            }
            C0489b c0489b = (C0489b) obj;
            return true;
        }

        public final int hashCode() {
            return -2018866600;
        }

        public final String toString() {
            return "ConfirmBondingProcessFinished";
        }
    }

    /* compiled from: SetupState.kt */
    /* loaded from: classes3.dex */
    public static final class c implements b<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f37402a = new c();

        private c() {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return true;
        }

        public final int hashCode() {
            return -831252958;
        }

        public final String toString() {
            return "LaunchBondingProcessConfirmation";
        }
    }

    /* compiled from: SetupState.kt */
    /* loaded from: classes3.dex */
    public static final class d implements b<nm0.j<? extends yp.a, ? extends User>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f37403a = new d();

        private d() {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return true;
        }

        public final int hashCode() {
            return 1381485633;
        }

        public final String toString() {
            return "NeedAssociation";
        }
    }

    /* compiled from: SetupState.kt */
    /* loaded from: classes3.dex */
    public static final class e implements b<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f37404a = new e();

        private e() {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return true;
        }

        public final int hashCode() {
            return 1389537097;
        }

        public final String toString() {
            return "ShouldTriggerManualCalibration";
        }
    }

    /* compiled from: SetupState.kt */
    /* loaded from: classes3.dex */
    public static final class f implements b<nm0.j<? extends HandsCalibrationConversation.Action, ? extends Object>> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f37405a = new f();

        private f() {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return true;
        }

        public final int hashCode() {
            return -1622991535;
        }

        public final String toString() {
            return "WaitForHandCalibration";
        }
    }

    /* compiled from: SetupState.kt */
    /* loaded from: classes3.dex */
    public static final class g implements b<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f37406a = new g();

        private g() {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return true;
        }

        public final int hashCode() {
            return -1694346592;
        }

        public final String toString() {
            return "WaitForInput";
        }
    }
}
