package com.withings.healthplus.explore.ui.activity;

import com.withings.contentproviders.model.content.TaskType;
import com.withings.healthplus.library.ui.navigation.LibraryNavigation;
/* compiled from: ExploreTabActivity.kt */
/* loaded from: classes3.dex */
final class t extends kotlin.jvm.internal.w implements ym0.l<TaskType, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ExploreTabActivity f40337a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(ExploreTabActivity exploreTabActivity) {
        super(1);
        this.f40337a = exploreTabActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(TaskType taskType) {
        TaskType taskType2 = taskType;
        kotlin.jvm.internal.u.j(taskType2, "taskType");
        ExploreTabActivity exploreTabActivity = this.f40337a;
        r8.n nVar = exploreTabActivity.f40243f;
        if (nVar != null) {
            androidx.navigation.e.L(nVar, LibraryNavigation.Destinations.a.a(LibraryNavigation.Destinations.f40407b, taskType2, ExploreTabActivity.D3(exploreTabActivity).b(), null, null, 60), null, 6);
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("navController");
        throw null;
    }
}
