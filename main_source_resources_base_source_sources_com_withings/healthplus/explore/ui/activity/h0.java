package com.withings.healthplus.explore.ui.activity;

import android.net.Uri;
import com.google.gson.Gson;
import com.withings.contentproviders.model.content.TaskType;
import com.withings.healthplus.contentscreens.ui.navigation.ContentScreenNavigation;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
/* compiled from: ExploreTabActivity.kt */
/* loaded from: classes3.dex */
final class h0 extends kotlin.jvm.internal.w implements ym0.l<rv.f, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ExploreTabActivity f40314a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(ExploreTabActivity exploreTabActivity) {
        super(1);
        this.f40314a = exploreTabActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(rv.f fVar) {
        rv.f taskClickedInformation = fVar;
        kotlin.jvm.internal.u.j(taskClickedInformation, "taskClickedInformation");
        boolean g11 = taskClickedInformation.g();
        ExploreTabActivity exploreTabActivity = this.f40314a;
        if (g11 && taskClickedInformation.c() != null) {
            rv.d c11 = taskClickedInformation.c();
            if (c11 != null) {
                int a11 = c11.a();
                long b10 = c11.b();
                gm.b.f69354a.e(Uri.parse("withings-bd2://timeline/measure?type=" + a11 + "&range=day&date=" + b10), new g0(exploreTabActivity));
            }
        } else {
            TaskType a12 = qu.a.a(taskClickedInformation.f());
            if (a12 != null) {
                r8.n nVar = exploreTabActivity.f40243f;
                if (nVar != null) {
                    androidx.navigation.e.L(nVar, ContentScreenNavigation.Destinations.a.b(ContentScreenNavigation.Destinations.f40134b, taskClickedInformation.a(), a12, ExploreTabActivity.D3(exploreTabActivity).b(), new Gson().toJson(new NavigationArguments.ProgramInformation(taskClickedInformation.d(), taskClickedInformation.b(), taskClickedInformation.e())), 224), null, 6);
                } else {
                    kotlin.jvm.internal.u.s("navController");
                    throw null;
                }
            }
        }
        return nm0.y.f85009a;
    }
}
