package com.withings.healthplus.explore.ui.activity;

import com.withings.contentproviders.model.content.TaskType;
import com.withings.healthplus.library.ui.navigation.LibraryNavigation;
/* compiled from: ExploreTabActivity.kt */
/* loaded from: classes3.dex */
final class w extends kotlin.jvm.internal.w implements ym0.q<TaskType, String, String, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ExploreTabActivity f40340a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(ExploreTabActivity exploreTabActivity) {
        super(3);
        this.f40340a = exploreTabActivity;
    }

    @Override // ym0.q
    public final nm0.y invoke(TaskType taskType, String str, String str2) {
        TaskType taskType2 = taskType;
        String originContentId = str;
        String str3 = str2;
        kotlin.jvm.internal.u.j(taskType2, "taskType");
        kotlin.jvm.internal.u.j(originContentId, "originContentId");
        ExploreTabActivity exploreTabActivity = this.f40340a;
        r8.n nVar = exploreTabActivity.f40243f;
        if (nVar != null) {
            androidx.navigation.e.L(nVar, LibraryNavigation.Destinations.a.a(LibraryNavigation.Destinations.f40407b, taskType2, ExploreTabActivity.D3(exploreTabActivity).b(), originContentId, str3, 20), null, 6);
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("navController");
        throw null;
    }
}
