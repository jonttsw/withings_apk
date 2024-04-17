package com.withings.healthplus.contentscreens.ui.navigation;

import com.withings.contentproviders.model.content.TaskType;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import r8.o;
/* compiled from: ContentScreenNavigation.kt */
/* loaded from: classes3.dex */
final class h extends w implements ym0.l<androidx.navigation.c, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TaskType f40152a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(TaskType taskType) {
        super(1);
        this.f40152a = taskType;
    }

    @Override // ym0.l
    public final y invoke(androidx.navigation.c cVar) {
        androidx.navigation.c navArgument = cVar;
        u.j(navArgument, "$this$navArgument");
        navArgument.d(new o.l(TaskType.class));
        TaskType taskType = this.f40152a;
        if (taskType != null) {
            navArgument.b(taskType);
        }
        return y.f85009a;
    }
}
