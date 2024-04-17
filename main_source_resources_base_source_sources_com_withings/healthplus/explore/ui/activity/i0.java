package com.withings.healthplus.explore.ui.activity;

import androidx.camera.camera2.internal.v1;
import com.google.gson.Gson;
import com.withings.contentfavorite.navigation.ContentFavoriteNavGraph;
import com.withings.contentproviders.model.content.TaskType;
import com.withings.healthplus.contentscreens.ui.navigation.ContentScreenNavigation;
import com.withings.healthplus.explore.ui.activity.ExploreTabActivity;
import com.withings.healthplus.library.ui.navigation.LibraryNavigation;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
/* compiled from: ExploreTabActivity.kt */
/* loaded from: classes3.dex */
final class i0 extends kotlin.jvm.internal.w implements ym0.l<r8.m, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ExploreTabActivity f40318a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(ExploreTabActivity exploreTabActivity) {
        super(1);
        this.f40318a = exploreTabActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(r8.m mVar) {
        ym0.a aVar;
        ExploreTabActivity.a.AbstractC0526a.C0527a c0527a;
        String str;
        ExploreTabActivity.a.AbstractC0526a.C0527a c0527a2;
        TaskType taskType;
        ExploreTabActivity.a.AbstractC0526a.C0527a c0527a3;
        String str2;
        ym0.q qVar;
        ym0.l lVar;
        ExploreTabActivity.a.AbstractC0526a.c cVar;
        ExploreTabActivity exploreTabActivity;
        ym0.a aVar2;
        ExploreTabActivity.a.AbstractC0526a.e eVar;
        Long l5;
        ExploreTabActivity.a.AbstractC0526a.e eVar2;
        Integer num;
        ExploreTabActivity.a.AbstractC0526a.e eVar3;
        Boolean bool;
        ym0.a aVar3;
        ExploreTabActivity.a.AbstractC0526a.d dVar;
        String str3;
        ExploreTabActivity.a.AbstractC0526a.d dVar2;
        TaskType taskType2;
        ExploreTabActivity.a.AbstractC0526a.d dVar3;
        Integer num2;
        ExploreTabActivity.a.AbstractC0526a.d dVar4;
        String str4;
        ExploreTabActivity.a.AbstractC0526a.b bVar;
        String str5;
        ym0.a aVar4;
        String str6;
        ym0.a aVar5;
        r8.m NavHost = mVar;
        kotlin.jvm.internal.u.j(NavHost, "$this$NavHost");
        ExploreTabActivity exploreTabActivity2 = this.f40318a;
        r8.n nVar = exploreTabActivity2.f40243f;
        if (nVar != null) {
            aVar = exploreTabActivity2.f40246i;
            long b10 = ExploreTabActivity.D3(exploreTabActivity2).b();
            ExploreTabActivity.a.AbstractC0526a D3 = ExploreTabActivity.D3(exploreTabActivity2);
            if (D3 instanceof ExploreTabActivity.a.AbstractC0526a.C0527a) {
                c0527a = (ExploreTabActivity.a.AbstractC0526a.C0527a) D3;
            } else {
                c0527a = null;
            }
            if (c0527a != null) {
                str = c0527a.d();
            } else {
                str = null;
            }
            ExploreTabActivity.a.AbstractC0526a D32 = ExploreTabActivity.D3(exploreTabActivity2);
            if (D32 instanceof ExploreTabActivity.a.AbstractC0526a.C0527a) {
                c0527a2 = (ExploreTabActivity.a.AbstractC0526a.C0527a) D32;
            } else {
                c0527a2 = null;
            }
            if (c0527a2 != null) {
                taskType = c0527a2.g();
            } else {
                taskType = null;
            }
            ExploreTabActivity.a.AbstractC0526a D33 = ExploreTabActivity.D3(exploreTabActivity2);
            if (D33 instanceof ExploreTabActivity.a.AbstractC0526a.C0527a) {
                c0527a3 = (ExploreTabActivity.a.AbstractC0526a.C0527a) D33;
            } else {
                c0527a3 = null;
            }
            if (c0527a3 != null) {
                str2 = (String) cr.a.a(new nm0.j(c0527a3.e(), Boolean.valueOf(c0527a3.h())), new r(c0527a3));
            } else {
                str2 = null;
            }
            qVar = exploreTabActivity2.f40247j;
            lVar = exploreTabActivity2.f40248k;
            ContentScreenNavigation.a(NavHost, lVar, nVar, new v(exploreTabActivity2), aVar, new w(exploreTabActivity2), new y(exploreTabActivity2), new z(exploreTabActivity2), new a0(exploreTabActivity2), b10, str, str2, qVar, taskType);
            ExploreTabActivity.a.AbstractC0526a D34 = ExploreTabActivity.D3(exploreTabActivity2);
            if (D34 instanceof ExploreTabActivity.a.AbstractC0526a.c) {
                cVar = (ExploreTabActivity.a.AbstractC0526a.c) D34;
            } else {
                cVar = null;
            }
            if (cVar != null) {
                aVar5 = exploreTabActivity2.f40246i;
                long b11 = ExploreTabActivity.D3(exploreTabActivity2).b();
                long c11 = cVar.c();
                exploreTabActivity = exploreTabActivity2;
                androidx.navigation.compose.n.b(NavHost, NavigationArguments.JoiningProgramLoadingDestination.route, kotlin.collections.x.W(v1.d0(NavigationArguments.PROGRAM_ID, new b(c11)), v1.d0(NavigationArguments.USER_ID, new c(b11))), null, null, null, null, null, new s1.a(true, -1467920694, new d(aVar5, new c0(exploreTabActivity, cVar), c11, b11)), 124);
            } else {
                exploreTabActivity = exploreTabActivity2;
            }
            aVar2 = exploreTabActivity.f40246i;
            ExploreTabActivity.a.AbstractC0526a D35 = ExploreTabActivity.D3(exploreTabActivity);
            if (D35 instanceof ExploreTabActivity.a.AbstractC0526a.e) {
                eVar = (ExploreTabActivity.a.AbstractC0526a.e) D35;
            } else {
                eVar = null;
            }
            if (eVar != null) {
                l5 = Long.valueOf(eVar.d());
            } else {
                l5 = null;
            }
            long b12 = ExploreTabActivity.D3(exploreTabActivity).b();
            ExploreTabActivity.a.AbstractC0526a D36 = ExploreTabActivity.D3(exploreTabActivity);
            if (D36 instanceof ExploreTabActivity.a.AbstractC0526a.e) {
                eVar2 = (ExploreTabActivity.a.AbstractC0526a.e) D36;
            } else {
                eVar2 = null;
            }
            if (eVar2 != null) {
                num = Integer.valueOf(eVar2.c());
            } else {
                num = null;
            }
            ExploreTabActivity.a.AbstractC0526a D37 = ExploreTabActivity.D3(exploreTabActivity);
            if (D37 instanceof ExploreTabActivity.a.AbstractC0526a.e) {
                eVar3 = (ExploreTabActivity.a.AbstractC0526a.e) D37;
            } else {
                eVar3 = null;
            }
            if (eVar3 != null) {
                bool = Boolean.valueOf(eVar3.e());
            } else {
                bool = null;
            }
            androidx.navigation.compose.n.b(NavHost, NavigationArguments.ProgramDetailDestination.route, kotlin.collections.x.W(v1.d0(NavigationArguments.PROGRAM_ID, new e(l5)), v1.d0(NavigationArguments.USER_ID, new f(b12)), v1.d0(NavigationArguments.INSTANCE_ID, new g(num)), v1.d0(NavigationArguments.SHOULD_DISPLAY_DAYS_BEFORE_START_TOAST, new h(bool))), null, null, null, null, null, new s1.a(true, 1014246260, new j(aVar2, new f0(exploreTabActivity), new h0(exploreTabActivity))), 124);
            long b13 = ExploreTabActivity.D3(exploreTabActivity).b();
            aVar3 = exploreTabActivity.f40246i;
            ExploreTabActivity.a.AbstractC0526a D38 = ExploreTabActivity.D3(exploreTabActivity);
            if (D38 instanceof ExploreTabActivity.a.AbstractC0526a.d) {
                dVar = (ExploreTabActivity.a.AbstractC0526a.d) D38;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                str3 = dVar.d();
            } else {
                str3 = null;
            }
            ExploreTabActivity.a.AbstractC0526a D39 = ExploreTabActivity.D3(exploreTabActivity);
            if (D39 instanceof ExploreTabActivity.a.AbstractC0526a.d) {
                dVar2 = (ExploreTabActivity.a.AbstractC0526a.d) D39;
            } else {
                dVar2 = null;
            }
            if (dVar2 != null) {
                taskType2 = dVar2.h();
            } else {
                taskType2 = null;
            }
            ExploreTabActivity.a.AbstractC0526a D310 = ExploreTabActivity.D3(exploreTabActivity);
            if (D310 instanceof ExploreTabActivity.a.AbstractC0526a.d) {
                dVar3 = (ExploreTabActivity.a.AbstractC0526a.d) D310;
            } else {
                dVar3 = null;
            }
            if (dVar3 != null) {
                num2 = dVar3.e();
            } else {
                num2 = null;
            }
            ExploreTabActivity.a.AbstractC0526a D311 = ExploreTabActivity.D3(exploreTabActivity);
            if (D311 instanceof ExploreTabActivity.a.AbstractC0526a.d) {
                dVar4 = (ExploreTabActivity.a.AbstractC0526a.d) D311;
            } else {
                dVar4 = null;
            }
            if (dVar4 != null) {
                Integer f11 = dVar4.f();
                if (f11 != null) {
                    str6 = new Gson().toJson(new NavigationArguments.MissionInformation(f11.intValue(), false, dVar4.g()));
                } else {
                    str6 = null;
                }
                str4 = str6;
            } else {
                str4 = null;
            }
            LibraryNavigation.a(b13, NavHost, taskType2, num2, str3, str4, aVar3, new s(exploreTabActivity));
            long b14 = ExploreTabActivity.D3(exploreTabActivity).b();
            ExploreTabActivity.a.AbstractC0526a D312 = ExploreTabActivity.D3(exploreTabActivity);
            if (D312 instanceof ExploreTabActivity.a.AbstractC0526a.b) {
                bVar = (ExploreTabActivity.a.AbstractC0526a.b) D312;
            } else {
                bVar = null;
            }
            if (bVar != null) {
                str5 = bVar.c();
            } else {
                str5 = null;
            }
            aVar4 = exploreTabActivity.f40246i;
            ContentFavoriteNavGraph.a(b14, NavHost, str5, aVar4, new t(exploreTabActivity), new u(exploreTabActivity));
            xb.i.a(NavHost, NavigationArguments.NutritionInformationSheetDestination.route, null, a.f40294a, 6);
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("navController");
        throw null;
    }
}
