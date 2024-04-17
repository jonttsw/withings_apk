package com.withings.fever.ui;

import androidx.camera.core.y1;
import com.withings.graph.GraphPeriod;
import com.withings.learnmore.adapter.LearnMoreEntryTranslations;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.Interval;
/* compiled from: TemperatureState.kt */
/* loaded from: classes3.dex */
public interface e0 {

    /* compiled from: TemperatureState.kt */
    /* loaded from: classes3.dex */
    public static final class a implements e0 {

        /* renamed from: a  reason: collision with root package name */
        public static final a f39227a = new a();

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
            return 18956083;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: TemperatureState.kt */
    /* loaded from: classes3.dex */
    public static final class b implements e0 {

        /* renamed from: a  reason: collision with root package name */
        private final List<as.h> f39228a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f39229b;

        /* renamed from: c  reason: collision with root package name */
        private final List<GraphPeriod> f39230c;

        /* renamed from: d  reason: collision with root package name */
        private final Interval f39231d;

        /* renamed from: e  reason: collision with root package name */
        private final at.a f39232e;

        /* renamed from: f  reason: collision with root package name */
        private final List<LearnMoreEntryTranslations> f39233f;

        /* renamed from: g  reason: collision with root package name */
        private final bs.b f39234g;

        public b(List list, boolean z5, ArrayList arrayList, Interval viewPortInterval, at.a viewPort, List article, bs.b bVar) {
            kotlin.jvm.internal.u.j(viewPortInterval, "viewPortInterval");
            kotlin.jvm.internal.u.j(viewPort, "viewPort");
            kotlin.jvm.internal.u.j(article, "article");
            this.f39228a = list;
            this.f39229b = z5;
            this.f39230c = arrayList;
            this.f39231d = viewPortInterval;
            this.f39232e = viewPort;
            this.f39233f = article;
            this.f39234g = bVar;
        }

        public final List<LearnMoreEntryTranslations> a() {
            return this.f39233f;
        }

        public final List<as.h> b() {
            return this.f39228a;
        }

        public final List<GraphPeriod> c() {
            return this.f39230c;
        }

        public final bs.b d() {
            return this.f39234g;
        }

        public final boolean e() {
            return this.f39229b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (kotlin.jvm.internal.u.e(this.f39228a, bVar.f39228a) && this.f39229b == bVar.f39229b && kotlin.jvm.internal.u.e(this.f39230c, bVar.f39230c) && kotlin.jvm.internal.u.e(this.f39231d, bVar.f39231d) && kotlin.jvm.internal.u.e(this.f39232e, bVar.f39232e) && kotlin.jvm.internal.u.e(this.f39233f, bVar.f39233f) && kotlin.jvm.internal.u.e(this.f39234g, bVar.f39234g)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int b10 = defpackage.e.b(this.f39230c, y1.a(this.f39229b, this.f39228a.hashCode() * 31, 31), 31);
            int hashCode2 = this.f39232e.hashCode();
            int b11 = defpackage.e.b(this.f39233f, (hashCode2 + ((this.f39231d.hashCode() + b10) * 31)) * 31, 31);
            bs.b bVar = this.f39234g;
            if (bVar == null) {
                hashCode = 0;
            } else {
                hashCode = bVar.hashCode();
            }
            return b11 + hashCode;
        }

        public final String toString() {
            return "Ready(data=" + this.f39228a + ", isSharedUser=" + this.f39229b + ", periods=" + this.f39230c + ", viewPortInterval=" + this.f39231d + ", viewPort=" + this.f39232e + ", article=" + this.f39233f + ", symptoms=" + this.f39234g + ")";
        }
    }
}
