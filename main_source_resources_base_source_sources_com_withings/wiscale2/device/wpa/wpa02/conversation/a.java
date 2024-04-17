package com.withings.wiscale2.device.wpa.wpa02.conversation;

import com.withings.wiscale2.C1987R;
/* compiled from: WpaCleansingModeErrors.kt */
/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private final int f55049a;

    /* renamed from: b  reason: collision with root package name */
    private final int f55050b;

    /* compiled from: WpaCleansingModeErrors.kt */
    /* renamed from: com.withings.wiscale2.device.wpa.wpa02.conversation.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0727a extends a {
        public C0727a() {
            super(C1987R.string.device_error, C1987R.string.scale_connection_title_error);
        }
    }

    /* compiled from: WpaCleansingModeErrors.kt */
    /* loaded from: classes5.dex */
    public static final class b extends a {
    }

    /* compiled from: WpaCleansingModeErrors.kt */
    /* loaded from: classes5.dex */
    public static final class c extends a {

        /* renamed from: c  reason: collision with root package name */
        private final int f55051c;

        public c() {
            this(0);
        }

        public final int c() {
            return this.f55051c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && this.f55051c == ((c) obj).f55051c) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f55051c);
        }

        public final String toString() {
            return androidx.camera.camera2.internal.e.c(new StringBuilder("StatusInCharge(wpaProductName="), this.f55051c, ")");
        }

        public c(int i11) {
            super(C1987R.string.device_error, C1987R.string.notification_device_battery_charging_title);
            this.f55051c = C1987R.string.wpa_product_name;
        }
    }

    /* compiled from: WpaCleansingModeErrors.kt */
    /* loaded from: classes5.dex */
    public static final class d extends a {
    }

    /* compiled from: WpaCleansingModeErrors.kt */
    /* loaded from: classes5.dex */
    public static final class e extends a {
    }

    /* compiled from: WpaCleansingModeErrors.kt */
    /* loaded from: classes5.dex */
    public static final class f extends a {

        /* renamed from: c  reason: collision with root package name */
        private final long f55052c;

        public f(long j5) {
            super(C1987R.string.wpa_error_cleansing_already_started_title, C1987R.string.wpa_error_cleansing_already_started_description);
            this.f55052c = j5;
        }

        public final long c() {
            return this.f55052c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof f) && this.f55052c == ((f) obj).f55052c) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Long.hashCode(this.f55052c);
        }

        public final String toString() {
            return android.support.v4.media.session.c.c(new StringBuilder("StatusOnGoing(timer="), this.f55052c, ")");
        }
    }

    public a(int i11, int i12) {
        this.f55049a = i11;
        this.f55050b = i12;
    }

    public final int a() {
        return this.f55050b;
    }

    public final int b() {
        return this.f55049a;
    }
}
