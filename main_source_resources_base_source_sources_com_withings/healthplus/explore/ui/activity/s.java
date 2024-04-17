package com.withings.healthplus.explore.ui.activity;

import android.content.Context;
import com.withings.contentproviders.model.content.TaskType;
import com.withings.healthplus.contentscreens.ui.navigation.ContentScreenNavigation;
/* compiled from: ExploreTabActivity.kt */
/* loaded from: classes3.dex */
final class s extends kotlin.jvm.internal.w implements ym0.u<TaskType, String, String, String, String, Boolean, String, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ExploreTabActivity f40336a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ExploreTabActivity exploreTabActivity) {
        super(7);
        this.f40336a = exploreTabActivity;
    }

    @Override // ym0.u
    public final nm0.y f(TaskType taskType, String str, String str2, String str3, String str4, Boolean bool, String str5) {
        TaskType taskType2 = taskType;
        String contentId = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        boolean booleanValue = bool.booleanValue();
        String str9 = str5;
        kotlin.jvm.internal.u.j(taskType2, "taskType");
        kotlin.jvm.internal.u.j(contentId, "contentId");
        ExploreTabActivity exploreTabActivity = this.f40336a;
        if (booleanValue) {
            r8.n nVar = exploreTabActivity.f40243f;
            if (nVar != null) {
                ContentScreenNavigation.Destinations.a aVar = ContentScreenNavigation.Destinations.f40134b;
                long b10 = ExploreTabActivity.D3(exploreTabActivity).b();
                aVar.getClass();
                androidx.navigation.e.L(nVar, ContentScreenNavigation.Destinations.a.a(contentId, taskType2, b10, true, str8, str7, str6, str9), null, 6);
            } else {
                kotlin.jvm.internal.u.s("navController");
                throw null;
            }
        } else {
            ch.d dVar = exploreTabActivity.f40242e;
            if (dVar != null) {
                ah.c o11 = dVar.o();
                Context applicationContext = exploreTabActivity.getApplicationContext();
                kotlin.jvm.internal.u.i(applicationContext, "getApplicationContext(...)");
                o11.getClass();
                exploreTabActivity.startActivity(ah.c.a(applicationContext));
            } else {
                kotlin.jvm.internal.u.s("intentBuilder");
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}
