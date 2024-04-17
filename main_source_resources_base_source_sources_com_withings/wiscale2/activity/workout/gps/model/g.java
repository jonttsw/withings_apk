package com.withings.wiscale2.activity.workout.gps.model;

import com.withings.liveworkout.model.LiveWorkout;
import kotlin.jvm.internal.u;
import ui.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GpsTrackingServiceStarter.kt */
/* loaded from: classes4.dex */
public interface g {

    /* compiled from: GpsTrackingServiceStarter.kt */
    /* loaded from: classes4.dex */
    public static final class a implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final a f48756a = new a();

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
            return 1714539988;
        }

        public final String toString() {
            return "Idle";
        }
    }

    /* compiled from: GpsTrackingServiceStarter.kt */
    /* loaded from: classes4.dex */
    public static final class b implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final b f48757a = new b();

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
            return 1996212159;
        }

        public final String toString() {
            return "Running";
        }
    }

    /* compiled from: GpsTrackingServiceStarter.kt */
    /* loaded from: classes4.dex */
    public static final class c implements g {

        /* renamed from: a  reason: collision with root package name */
        private final LiveWorkout f48758a;

        public c(LiveWorkout liveWorkout) {
            u.j(liveWorkout, "liveWorkout");
            this.f48758a = liveWorkout;
        }

        public final LiveWorkout a() {
            return this.f48758a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && u.e(this.f48758a, ((c) obj).f48758a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f48758a.hashCode();
        }

        public final String toString() {
            return "WaitingForeground(liveWorkout=" + this.f48758a + ")";
        }
    }

    /* compiled from: GpsTrackingServiceStarter.kt */
    /* loaded from: classes4.dex */
    public static final class d implements g {

        /* renamed from: a  reason: collision with root package name */
        private final d.InterfaceC1716d f48759a;

        public d(e eVar) {
            this.f48759a = eVar;
        }

        public final d.InterfaceC1716d a() {
            return this.f48759a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof d) && u.e(this.f48759a, ((d) obj).f48759a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f48759a.hashCode();
        }

        public final String toString() {
            return "WaitingPermission(locationStateListener=" + this.f48759a + ")";
        }
    }
}
