package com.withings.notifications.ui;
/* compiled from: NotificationSectionViewModel.kt */
/* loaded from: classes4.dex */
public abstract class k {

    /* compiled from: NotificationSectionViewModel.kt */
    /* loaded from: classes4.dex */
    public static final class a extends k {

        /* renamed from: a  reason: collision with root package name */
        private final long f42964a;

        /* renamed from: b  reason: collision with root package name */
        private final c10.c<?> f42965b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j5, c10.c<?> notification) {
            super(0);
            kotlin.jvm.internal.u.j(notification, "notification");
            this.f42964a = j5;
            this.f42965b = notification;
        }

        public final c10.c<?> a() {
            return this.f42965b;
        }

        public final long b() {
            return this.f42964a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f42964a == aVar.f42964a && kotlin.jvm.internal.u.e(this.f42965b, aVar.f42965b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f42965b.hashCode() + (Long.hashCode(this.f42964a) * 31);
        }

        public final String toString() {
            return "SetAsRead(userId=" + this.f42964a + ", notification=" + this.f42965b + ")";
        }
    }

    public /* synthetic */ k(int i11) {
        this();
    }

    private k() {
    }
}
