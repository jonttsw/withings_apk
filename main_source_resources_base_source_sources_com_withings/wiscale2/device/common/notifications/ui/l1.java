package com.withings.wiscale2.device.common.notifications.ui;

import java.util.List;
/* compiled from: DeviceNotificationSettingsFragment.kt */
/* loaded from: classes5.dex */
public abstract class l1 {

    /* compiled from: DeviceNotificationSettingsFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a extends l1 {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f52942a;

        /* renamed from: b  reason: collision with root package name */
        private final h1 f52943b;

        /* renamed from: c  reason: collision with root package name */
        private final List<com.withings.wiscale2.device.common.notifications.ui.b> f52944c;

        /* renamed from: d  reason: collision with root package name */
        private final List<com.withings.wiscale2.device.common.notifications.ui.a> f52945d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z5, h1 healthNotification, List<com.withings.wiscale2.device.common.notifications.ui.b> defaultApps, List<com.withings.wiscale2.device.common.notifications.ui.a> allApps) {
            super(0);
            kotlin.jvm.internal.u.j(healthNotification, "healthNotification");
            kotlin.jvm.internal.u.j(defaultApps, "defaultApps");
            kotlin.jvm.internal.u.j(allApps, "allApps");
            this.f52942a = z5;
            this.f52943b = healthNotification;
            this.f52944c = defaultApps;
            this.f52945d = allApps;
        }

        public final List<com.withings.wiscale2.device.common.notifications.ui.a> a() {
            return this.f52945d;
        }

        public final List<com.withings.wiscale2.device.common.notifications.ui.b> b() {
            return this.f52944c;
        }

        public final boolean c() {
            return this.f52942a;
        }

        public final h1 d() {
            return this.f52943b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f52942a == aVar.f52942a && kotlin.jvm.internal.u.e(this.f52943b, aVar.f52943b) && kotlin.jvm.internal.u.e(this.f52944c, aVar.f52944c) && kotlin.jvm.internal.u.e(this.f52945d, aVar.f52945d)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = this.f52943b.hashCode();
            return this.f52945d.hashCode() + defpackage.e.b(this.f52944c, (hashCode + (Boolean.hashCode(this.f52942a) * 31)) * 31, 31);
        }

        public final String toString() {
            return "DisplayState(deviceGlobalNotifEnabled=" + this.f52942a + ", healthNotification=" + this.f52943b + ", defaultApps=" + this.f52944c + ", allApps=" + this.f52945d + ")";
        }
    }

    /* compiled from: DeviceNotificationSettingsFragment.kt */
    /* loaded from: classes5.dex */
    public static final class b extends l1 {

        /* renamed from: a  reason: collision with root package name */
        public static final b f52946a = new l1(0);
    }

    public /* synthetic */ l1(int i11) {
        this();
    }

    private l1() {
    }
}
