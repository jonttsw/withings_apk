package com.withings.nervehealth.ui.guidedscan;

import com.withings.common.device.model.capabilities.DeviceWithVideoMedia;
import org.joda.time.DateTime;
/* compiled from: boundaries.kt */
/* loaded from: classes4.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    private final int f42598a;

    /* compiled from: boundaries.kt */
    /* loaded from: classes4.dex */
    public static final class a extends d {

        /* renamed from: b  reason: collision with root package name */
        public static final a f42599b = new a();

        private a() {
            super(2);
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
            return -1162014597;
        }

        public final String toString() {
            return "Done";
        }
    }

    /* compiled from: boundaries.kt */
    /* loaded from: classes4.dex */
    public static final class b extends d {

        /* renamed from: b  reason: collision with root package name */
        private final DateTime f42600b;

        /* renamed from: c  reason: collision with root package name */
        private final DeviceWithVideoMedia.a f42601c;

        public b() {
            this(null, null, 3);
        }

        public final DeviceWithVideoMedia.a b() {
            return this.f42601c;
        }

        public final DateTime c() {
            return this.f42600b;
        }

        public final boolean d() {
            if (this.f42600b != null) {
                return true;
            }
            return false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (kotlin.jvm.internal.u.e(this.f42600b, bVar.f42600b) && kotlin.jvm.internal.u.e(this.f42601c, bVar.f42601c)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int i11 = 0;
            DateTime dateTime = this.f42600b;
            if (dateTime == null) {
                hashCode = 0;
            } else {
                hashCode = dateTime.hashCode();
            }
            int i12 = hashCode * 31;
            DeviceWithVideoMedia.a aVar = this.f42601c;
            if (aVar != null) {
                i11 = aVar.hashCode();
            }
            return i12 + i11;
        }

        public final String toString() {
            return "InProgress(startDate=" + this.f42600b + ", mediaRes=" + this.f42601c + ")";
        }

        public /* synthetic */ b(DateTime dateTime, DeviceWithVideoMedia.a aVar, int i11) {
            this((i11 & 1) != 0 ? null : dateTime, (i11 & 2) != 0 ? null : aVar);
        }

        public b(DateTime dateTime, DeviceWithVideoMedia.a aVar) {
            super(1);
            this.f42600b = dateTime;
            this.f42601c = aVar;
        }
    }

    /* compiled from: boundaries.kt */
    /* loaded from: classes4.dex */
    public static final class c extends d {

        /* renamed from: b  reason: collision with root package name */
        public static final c f42602b = new c();

        private c() {
            super(0);
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
            return -1658120045;
        }

        public final String toString() {
            return "Intro";
        }
    }

    public d(int i11) {
        this.f42598a = i11;
    }

    public final int a() {
        return this.f42598a;
    }
}
