package com.withings.healthplus.explore.ui.activity;

import com.withings.contentproviders.model.content.TaskType;
import com.withings.healthplus.contentscreens.ui.navigation.ContentScreenNavigation;
import com.withings.library.authentication.api.ConstantsWs;
/* compiled from: ExploreTabActivity.kt */
/* loaded from: classes3.dex */
final class u extends kotlin.jvm.internal.w implements ym0.p<TaskType, String, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ExploreTabActivity f40338a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ExploreTabActivity exploreTabActivity) {
        super(2);
        this.f40338a = exploreTabActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(TaskType taskType, String str) {
        TaskType taskType2 = taskType;
        String contentId = str;
        kotlin.jvm.internal.u.j(taskType2, "taskType");
        kotlin.jvm.internal.u.j(contentId, "contentId");
        ExploreTabActivity exploreTabActivity = this.f40338a;
        r8.n nVar = exploreTabActivity.f40243f;
        if (nVar != null) {
            androidx.navigation.e.L(nVar, ContentScreenNavigation.Destinations.a.b(ContentScreenNavigation.Destinations.f40134b, contentId, taskType2, ExploreTabActivity.D3(exploreTabActivity).b(), null, ConstantsWs.WS_STATUS_WRONGTZNAME), null, 6);
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("navController");
        throw null;
    }
}
