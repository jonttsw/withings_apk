package com.withings.wiscale2.vascularage;

import com.withings.learnmore.adapter.LearnMoreEntryTranslations;
import java.util.List;
/* compiled from: VascularAgeActivity.kt */
/* loaded from: classes5.dex */
public interface i {

    /* compiled from: VascularAgeActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a implements i {

        /* renamed from: a  reason: collision with root package name */
        public static final a f62319a = new a();

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
            return 1837892835;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: VascularAgeActivity.kt */
    /* loaded from: classes5.dex */
    public static final class b implements i {

        /* renamed from: a  reason: collision with root package name */
        private final d f62320a;

        /* renamed from: b  reason: collision with root package name */
        private final List<LearnMoreEntryTranslations> f62321b;

        /* renamed from: c  reason: collision with root package name */
        private final int f62322c;

        /* renamed from: d  reason: collision with root package name */
        private final w f62323d;

        /* renamed from: e  reason: collision with root package name */
        private final h f62324e;

        public b(d graphConfiguration, List<LearnMoreEntryTranslations> article, int i11, w vascularAgeData, h hVar) {
            kotlin.jvm.internal.u.j(graphConfiguration, "graphConfiguration");
            kotlin.jvm.internal.u.j(article, "article");
            kotlin.jvm.internal.u.j(vascularAgeData, "vascularAgeData");
            this.f62320a = graphConfiguration;
            this.f62321b = article;
            this.f62322c = i11;
            this.f62323d = vascularAgeData;
            this.f62324e = hVar;
        }

        public final List<LearnMoreEntryTranslations> a() {
            return this.f62321b;
        }

        public final d b() {
            return this.f62320a;
        }

        public final int c() {
            return this.f62322c;
        }

        public final h d() {
            return this.f62324e;
        }

        public final w e() {
            return this.f62323d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (kotlin.jvm.internal.u.e(this.f62320a, bVar.f62320a) && kotlin.jvm.internal.u.e(this.f62321b, bVar.f62321b) && this.f62322c == bVar.f62322c && kotlin.jvm.internal.u.e(this.f62323d, bVar.f62323d) && kotlin.jvm.internal.u.e(this.f62324e, bVar.f62324e)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2 = (this.f62323d.hashCode() + androidx.appcompat.app.h.a(this.f62322c, defpackage.e.b(this.f62321b, this.f62320a.hashCode() * 31, 31), 31)) * 31;
            h hVar = this.f62324e;
            if (hVar == null) {
                hashCode = 0;
            } else {
                hashCode = hVar.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public final String toString() {
            return "Ready(graphConfiguration=" + this.f62320a + ", article=" + this.f62321b + ", missingMeasurements=" + this.f62322c + ", vascularAgeData=" + this.f62323d + ", pwvData=" + this.f62324e + ")";
        }
    }
}
