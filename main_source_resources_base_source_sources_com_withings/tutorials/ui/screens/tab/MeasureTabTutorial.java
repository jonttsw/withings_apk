package com.withings.tutorials.ui.screens.tab;

import androidx.compose.runtime.v;
import b70.t0;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: MeasureTabTutorial.kt */
/* loaded from: classes4.dex */
public final class MeasureTabTutorial {

    /* renamed from: a  reason: collision with root package name */
    public static final MeasureTabTutorial f46231a = new Object();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MeasureTabTutorial.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/tutorials/ui/screens/tab/MeasureTabTutorial$MeasureTabTutorialScreen;", "", "ui_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class MeasureTabTutorialScreen {

        /* renamed from: c  reason: collision with root package name */
        private static final /* synthetic */ MeasureTabTutorialScreen[] f46232c;

        /* renamed from: d  reason: collision with root package name */
        private static final /* synthetic */ sm0.a f46233d;

        /* renamed from: a  reason: collision with root package name */
        private final int f46234a;

        /* renamed from: b  reason: collision with root package name */
        private final p f46235b;

        static {
            MeasureTabTutorialScreen[] measureTabTutorialScreenArr = {new MeasureTabTutorialScreen("Root", 0, 0, new p(2131232769, C1987R.string.tutorial_paid_measure_tab_intro_body, "measureTabTutorialRoot", e.f46267a, "measureTabTutorialHis")), new MeasureTabTutorialScreen("His", 1, 1, new p(2131232768, C1987R.string.tutorial_paid_measure_tab_his_body, "measureTabTutorialHis", e.f46268b, "measureTabTutorialHc")), new MeasureTabTutorialScreen("Hc", 2, 2, new p(2131232767, C1987R.string.tutorial_paid_measure_tab_hc_body, "measureTabTutorialHc", e.f46269c, "measureTabTutorialAhd")), new MeasureTabTutorialScreen("Ahd", 3, 3, new p(2131232765, C1987R.string.tutorial_paid_measure_tab_ahd_body, "measureTabTutorialAhd", e.f46270d, "measureTabTutorialFamily")), new MeasureTabTutorialScreen("Family", 4, 4, new p(2131232766, C1987R.string.tutorial_paid_measure_tab_family_body, "measureTabTutorialFamily", e.f46271e, null))};
            f46232c = measureTabTutorialScreenArr;
            f46233d = sm0.b.a(measureTabTutorialScreenArr);
        }

        private MeasureTabTutorialScreen(String str, int i11, int i12, p pVar) {
            this.f46234a = i12;
            this.f46235b = pVar;
        }

        public static sm0.a<MeasureTabTutorialScreen> a() {
            return f46233d;
        }

        public static MeasureTabTutorialScreen valueOf(String str) {
            return (MeasureTabTutorialScreen) Enum.valueOf(MeasureTabTutorialScreen.class, str);
        }

        public static MeasureTabTutorialScreen[] values() {
            return (MeasureTabTutorialScreen[]) f46232c.clone();
        }

        public final int b() {
            return this.f46234a;
        }

        public final p d() {
            return this.f46235b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MeasureTabTutorial.kt */
    /* loaded from: classes4.dex */
    public static final class a extends w implements ym0.p<r8.m, r8.n, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r8.n f46236a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f46237b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f46238c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(r8.n nVar, ym0.a<y> aVar, ym0.a<y> aVar2) {
            super(2);
            this.f46236a = nVar;
            this.f46237b = aVar;
            this.f46238c = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Comparator] */
        @Override // ym0.p
        public final y invoke(r8.m mVar, r8.n nVar) {
            r8.m GuidedPresentationTutorialNavHost = mVar;
            r8.n it = nVar;
            u.j(GuidedPresentationTutorialNavHost, "$this$GuidedPresentationTutorialNavHost");
            u.j(it, "it");
            for (MeasureTabTutorialScreen measureTabTutorialScreen : x.D0(MeasureTabTutorialScreen.a(), new Object())) {
                p d11 = measureTabTutorialScreen.d();
                androidx.navigation.compose.n.b(GuidedPresentationTutorialNavHost, d11.d(), null, null, null, null, null, null, new s1.a(true, -57573280, new i(d11, this.f46237b, this.f46238c, this.f46236a)), 126);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MeasureTabTutorial.kt */
    /* loaded from: classes4.dex */
    public static final class b extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r8.n f46240b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f46241c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f46242d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f46243e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(r8.n nVar, ym0.a<y> aVar, ym0.a<y> aVar2, int i11) {
            super(2);
            this.f46240b = nVar;
            this.f46241c = aVar;
            this.f46242d = aVar2;
            this.f46243e = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f46243e | 1);
            ym0.a<y> aVar2 = this.f46241c;
            ym0.a<y> aVar3 = this.f46242d;
            MeasureTabTutorial.this.a(this.f46240b, aVar2, aVar3, aVar, g11);
            return y.f85009a;
        }
    }

    public final void a(r8.n navController, ym0.a<y> onBack, ym0.a<y> onDone, androidx.compose.runtime.a aVar, int i11) {
        u.j(navController, "navController");
        u.j(onBack, "onBack");
        u.j(onDone, "onDone");
        androidx.compose.runtime.b g11 = aVar.g(220677724);
        t0.b(navController, "measureTabTutorialRoot", new a(navController, onBack, onDone), g11, 56);
        v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new b(navController, onBack, onDone, i11));
        }
    }
}
