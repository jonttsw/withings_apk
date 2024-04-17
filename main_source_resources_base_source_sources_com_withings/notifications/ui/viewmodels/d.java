package com.withings.notifications.ui.viewmodels;

import kotlin.jvm.internal.u;
/* compiled from: NotificationActivityViewModel.kt */
/* loaded from: classes4.dex */
public interface d {

    /* compiled from: NotificationActivityViewModel.kt */
    /* loaded from: classes4.dex */
    public static final class a implements d {

        /* renamed from: a  reason: collision with root package name */
        private final c10.c<?> f43136a;

        public a(c10.c<?> notification) {
            u.j(notification, "notification");
            this.f43136a = notification;
        }

        public final c10.c<?> a() {
            return this.f43136a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && u.e(this.f43136a, ((a) obj).f43136a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f43136a.hashCode();
        }

        public final String toString() {
            return "DeleteNotification(notification=" + this.f43136a + ")";
        }
    }

    /* compiled from: NotificationActivityViewModel.kt */
    /* loaded from: classes4.dex */
    public static final class b implements d {

        /* renamed from: a  reason: collision with root package name */
        private final NotificationGroup f43137a;

        public b(NotificationGroup notificationGroup) {
            this.f43137a = notificationGroup;
        }

        public final NotificationGroup a() {
            return this.f43137a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && this.f43137a == ((b) obj).f43137a) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f43137a.hashCode();
        }

        public final String toString() {
            return "MarkAsRead(group=" + this.f43137a + ")";
        }
    }
}
