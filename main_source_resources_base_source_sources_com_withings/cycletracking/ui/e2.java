package com.withings.cycletracking.ui;

import com.withings.cycletracking.ui.viewmodel.PredictionState;
import com.withings.graph.GraphPeriod;
import com.withings.learnmore.adapter.LearnMoreEntryTranslations;
import dn.b;
import java.util.List;
/* compiled from: CycleTrackingUiState.kt */
/* loaded from: classes3.dex */
public interface e2 {

    /* compiled from: CycleTrackingUiState.kt */
    /* loaded from: classes3.dex */
    public interface a {

        /* compiled from: CycleTrackingUiState.kt */
        /* renamed from: com.withings.cycletracking.ui.e2$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0469a implements a {

            /* renamed from: a  reason: collision with root package name */
            public static final C0469a f35532a = new C0469a();

            private C0469a() {
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0469a)) {
                    return false;
                }
                C0469a c0469a = (C0469a) obj;
                return true;
            }

            public final int hashCode() {
                return -1361020449;
            }

            public final String toString() {
                return "Default";
            }
        }

        /* compiled from: CycleTrackingUiState.kt */
        /* loaded from: classes3.dex */
        public static final class b implements a {

            /* renamed from: a  reason: collision with root package name */
            private final boolean f35533a;

            public b(boolean z5) {
                this.f35533a = z5;
            }

            public final boolean a() {
                return this.f35533a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof b) && this.f35533a == ((b) obj).f35533a) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f35533a);
            }

            public final String toString() {
                return androidx.appcompat.app.h.d(new StringBuilder("FactorWithPeriod(hasPeriod="), this.f35533a, ")");
            }
        }

        /* compiled from: CycleTrackingUiState.kt */
        /* loaded from: classes3.dex */
        public static final class c implements a {

            /* renamed from: a  reason: collision with root package name */
            public static final c f35534a = new c();

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
                return -63682204;
            }

            public final String toString() {
                return "FactorWithPhase";
            }
        }
    }

    /* compiled from: CycleTrackingUiState.kt */
    /* loaded from: classes3.dex */
    public static final class b implements e2 {

        /* renamed from: a  reason: collision with root package name */
        public static final b f35535a = new b();

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
            return -80335891;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: CycleTrackingUiState.kt */
    /* loaded from: classes3.dex */
    public static final class c implements e2 {

        /* renamed from: a  reason: collision with root package name */
        private final C0470c f35536a;

        /* renamed from: b  reason: collision with root package name */
        private final List<b.InterfaceC0847b> f35537b;

        /* renamed from: c  reason: collision with root package name */
        private final List<wm.f> f35538c;

        /* renamed from: d  reason: collision with root package name */
        private final PredictionState f35539d;

        /* renamed from: e  reason: collision with root package name */
        private final List<GraphPeriod> f35540e;

        /* compiled from: CycleTrackingUiState.kt */
        /* loaded from: classes3.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private final List<LearnMoreEntryTranslations> f35541a;

            public a(List<LearnMoreEntryTranslations> list) {
                this.f35541a = list;
            }

            public final List<LearnMoreEntryTranslations> a() {
                return this.f35541a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof a) && kotlin.jvm.internal.u.e(this.f35541a, ((a) obj).f35541a)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return this.f35541a.hashCode();
            }

            public final String toString() {
                return defpackage.d.i(new StringBuilder("LearnMoreState(entries="), this.f35541a, ")");
            }
        }

        /* compiled from: CycleTrackingUiState.kt */
        /* loaded from: classes3.dex */
        public static final class b {

            /* renamed from: a  reason: collision with root package name */
            private final boolean f35542a;

            /* renamed from: b  reason: collision with root package name */
            private final boolean f35543b;

            /* renamed from: c  reason: collision with root package name */
            private final Integer f35544c;

            public b(Integer num, boolean z5, boolean z11) {
                this.f35542a = z5;
                this.f35543b = z11;
                this.f35544c = num;
            }

            public final Integer a() {
                return this.f35544c;
            }

            public final boolean b() {
                return this.f35543b;
            }

            public final boolean c() {
                return this.f35542a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                if (this.f35542a == bVar.f35542a && this.f35543b == bVar.f35543b && kotlin.jvm.internal.u.e(this.f35544c, bVar.f35544c)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                int hashCode;
                int a11 = androidx.camera.core.y1.a(this.f35543b, Boolean.hashCode(this.f35542a) * 31, 31);
                Integer num = this.f35544c;
                if (num == null) {
                    hashCode = 0;
                } else {
                    hashCode = num.hashCode();
                }
                return a11 + hashCode;
            }

            public final String toString() {
                return "OptionState(isPredictionsSwitchedOn=" + this.f35542a + ", isPinOnTopSwitchedOn=" + this.f35543b + ", factorNameRes=" + this.f35544c + ")";
            }
        }

        /* compiled from: CycleTrackingUiState.kt */
        /* renamed from: com.withings.cycletracking.ui.e2$c$c  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0470c {

            /* renamed from: a  reason: collision with root package name */
            private final a f35545a;

            /* renamed from: b  reason: collision with root package name */
            private final a f35546b;

            /* renamed from: c  reason: collision with root package name */
            private final b f35547c;

            /* renamed from: d  reason: collision with root package name */
            private final en.l f35548d;

            /* renamed from: e  reason: collision with root package name */
            private final en.m f35549e;

            public C0470c(a learnMore, a graphHeader, b optionState, en.l lVar, en.m upcomingEventsUiModel) {
                kotlin.jvm.internal.u.j(learnMore, "learnMore");
                kotlin.jvm.internal.u.j(graphHeader, "graphHeader");
                kotlin.jvm.internal.u.j(optionState, "optionState");
                kotlin.jvm.internal.u.j(upcomingEventsUiModel, "upcomingEventsUiModel");
                this.f35545a = learnMore;
                this.f35546b = graphHeader;
                this.f35547c = optionState;
                this.f35548d = lVar;
                this.f35549e = upcomingEventsUiModel;
            }

            public final a a() {
                return this.f35546b;
            }

            public final en.l b() {
                return this.f35548d;
            }

            public final a c() {
                return this.f35545a;
            }

            public final b d() {
                return this.f35547c;
            }

            public final en.m e() {
                return this.f35549e;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0470c)) {
                    return false;
                }
                C0470c c0470c = (C0470c) obj;
                if (kotlin.jvm.internal.u.e(this.f35545a, c0470c.f35545a) && kotlin.jvm.internal.u.e(this.f35546b, c0470c.f35546b) && kotlin.jvm.internal.u.e(this.f35547c, c0470c.f35547c) && kotlin.jvm.internal.u.e(this.f35548d, c0470c.f35548d) && kotlin.jvm.internal.u.e(this.f35549e, c0470c.f35549e)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                int hashCode;
                int hashCode2 = this.f35546b.hashCode();
                int hashCode3 = (this.f35547c.hashCode() + ((hashCode2 + (this.f35545a.hashCode() * 31)) * 31)) * 31;
                en.l lVar = this.f35548d;
                if (lVar == null) {
                    hashCode = 0;
                } else {
                    hashCode = lVar.hashCode();
                }
                return this.f35549e.hashCode() + ((hashCode3 + hashCode) * 31);
            }

            public final String toString() {
                return "SectionsState(learnMore=" + this.f35545a + ", graphHeader=" + this.f35546b + ", optionState=" + this.f35547c + ", inDepthUiModel=" + this.f35548d + ", upcomingEventsUiModel=" + this.f35549e + ")";
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(C0470c sections, List<? extends b.InterfaceC0847b> data, List<wm.f> cycleDaysList, PredictionState predictionState, List<? extends GraphPeriod> list) {
            kotlin.jvm.internal.u.j(sections, "sections");
            kotlin.jvm.internal.u.j(data, "data");
            kotlin.jvm.internal.u.j(cycleDaysList, "cycleDaysList");
            kotlin.jvm.internal.u.j(predictionState, "predictionState");
            this.f35536a = sections;
            this.f35537b = data;
            this.f35538c = cycleDaysList;
            this.f35539d = predictionState;
            this.f35540e = list;
        }

        public final List<b.InterfaceC0847b> a() {
            return this.f35537b;
        }

        public final List<GraphPeriod> b() {
            return this.f35540e;
        }

        public final PredictionState c() {
            return this.f35539d;
        }

        public final C0470c d() {
            return this.f35536a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (kotlin.jvm.internal.u.e(this.f35536a, cVar.f35536a) && kotlin.jvm.internal.u.e(this.f35537b, cVar.f35537b) && kotlin.jvm.internal.u.e(this.f35538c, cVar.f35538c) && this.f35539d == cVar.f35539d && kotlin.jvm.internal.u.e(this.f35540e, cVar.f35540e)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int b10 = defpackage.e.b(this.f35538c, defpackage.e.b(this.f35537b, this.f35536a.hashCode() * 31, 31), 31);
            return this.f35540e.hashCode() + ((this.f35539d.hashCode() + b10) * 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Ready(sections=");
            sb2.append(this.f35536a);
            sb2.append(", data=");
            sb2.append(this.f35537b);
            sb2.append(", cycleDaysList=");
            sb2.append(this.f35538c);
            sb2.append(", predictionState=");
            sb2.append(this.f35539d);
            sb2.append(", periods=");
            return defpackage.d.i(sb2, this.f35540e, ")");
        }
    }
}
