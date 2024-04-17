package com.withings.tutorials.ui.screens.tab;

import androidx.compose.runtime.v;
import b70.t0;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: AchieveTabTutorial.kt */
/* loaded from: classes4.dex */
public final class AchieveTabTutorial {

    /* renamed from: a  reason: collision with root package name */
    public static final AchieveTabTutorial f46214a = new Object();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AchieveTabTutorial.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/tutorials/ui/screens/tab/AchieveTabTutorial$AchieveTabTutorialScreen;", "", "ui_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class AchieveTabTutorialScreen {

        /* renamed from: c  reason: collision with root package name */
        private static final /* synthetic */ AchieveTabTutorialScreen[] f46215c;

        /* renamed from: d  reason: collision with root package name */
        private static final /* synthetic */ sm0.a f46216d;

        /* renamed from: a  reason: collision with root package name */
        private final int f46217a;

        /* renamed from: b  reason: collision with root package name */
        private final p f46218b;

        static {
            AchieveTabTutorialScreen[] achieveTabTutorialScreenArr = {new AchieveTabTutorialScreen("Root", 0, 0, new p(2131232748, C1987R.string.tutorial_achieve_tab_intro_body, "achieveTabTutorialRoot", d.f46259a, "achieveTabTutorialGoal")), new AchieveTabTutorialScreen("Goal", 1, 1, new p(2131232747, C1987R.string.tutorial_achieve_tab_goal_body, "achieveTabTutorialGoal", d.f46260b, "achieveTabTutorialPrograms")), new AchieveTabTutorialScreen("Programs", 2, 2, new p(2131232750, C1987R.string.tutorial_achieve_tab_programs_body, "achieveTabTutorialPrograms", d.f46261c, "achieveTabTutorialLibrary")), new AchieveTabTutorialScreen("Library", 3, 3, new p(2131232749, C1987R.string.tutorial_achieve_tab_library_body, "achieveTabTutorialLibrary", d.f46262d, null))};
            f46215c = achieveTabTutorialScreenArr;
            f46216d = sm0.b.a(achieveTabTutorialScreenArr);
        }

        private AchieveTabTutorialScreen(String str, int i11, int i12, p pVar) {
            this.f46217a = i12;
            this.f46218b = pVar;
        }

        public static sm0.a<AchieveTabTutorialScreen> a() {
            return f46216d;
        }

        public static AchieveTabTutorialScreen valueOf(String str) {
            return (AchieveTabTutorialScreen) Enum.valueOf(AchieveTabTutorialScreen.class, str);
        }

        public static AchieveTabTutorialScreen[] values() {
            return (AchieveTabTutorialScreen[]) f46215c.clone();
        }

        public final int b() {
            return this.f46217a;
        }

        public final p d() {
            return this.f46218b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AchieveTabTutorial.kt */
    /* loaded from: classes4.dex */
    public static final class a extends w implements ym0.p<r8.m, r8.n, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r8.n f46219a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f46220b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f46221c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(r8.n nVar, ym0.a<y> aVar, ym0.a<y> aVar2) {
            super(2);
            this.f46219a = nVar;
            this.f46220b = aVar;
            this.f46221c = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Comparator] */
        @Override // ym0.p
        public final y invoke(r8.m mVar, r8.n nVar) {
            r8.m GuidedPresentationTutorialNavHost = mVar;
            r8.n it = nVar;
            u.j(GuidedPresentationTutorialNavHost, "$this$GuidedPresentationTutorialNavHost");
            u.j(it, "it");
            for (AchieveTabTutorialScreen achieveTabTutorialScreen : x.D0(AchieveTabTutorialScreen.a(), new Object())) {
                p d11 = achieveTabTutorialScreen.d();
                androidx.navigation.compose.n.b(GuidedPresentationTutorialNavHost, d11.d(), null, null, null, null, null, null, new s1.a(true, -995113210, new c(d11, this.f46220b, this.f46221c, this.f46219a)), 126);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AchieveTabTutorial.kt */
    /* loaded from: classes4.dex */
    public static final class b extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r8.n f46223b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f46224c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f46225d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f46226e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(r8.n nVar, ym0.a<y> aVar, ym0.a<y> aVar2, int i11) {
            super(2);
            this.f46223b = nVar;
            this.f46224c = aVar;
            this.f46225d = aVar2;
            this.f46226e = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f46226e | 1);
            ym0.a<y> aVar2 = this.f46224c;
            ym0.a<y> aVar3 = this.f46225d;
            AchieveTabTutorial.this.a(this.f46223b, aVar2, aVar3, aVar, g11);
            return y.f85009a;
        }
    }

    public final void a(r8.n navController, ym0.a<y> onBack, ym0.a<y> onDone, androidx.compose.runtime.a aVar, int i11) {
        u.j(navController, "navController");
        u.j(onBack, "onBack");
        u.j(onDone, "onDone");
        androidx.compose.runtime.b g11 = aVar.g(-716862206);
        t0.b(navController, "achieveTabTutorialRoot", new a(navController, onBack, onDone), g11, 56);
        v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new b(navController, onBack, onDone, i11));
        }
    }
}
