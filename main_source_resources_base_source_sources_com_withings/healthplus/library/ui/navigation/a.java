package com.withings.healthplus.library.ui.navigation;

import com.withings.contentproviders.model.content.TaskType;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import r8.o;
import ym0.l;
/* compiled from: LibraryNavigation.kt */
/* loaded from: classes3.dex */
final class a extends w implements l<androidx.navigation.c, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TaskType f40411a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(TaskType taskType) {
        super(1);
        this.f40411a = taskType;
    }

    @Override // ym0.l
    public final y invoke(androidx.navigation.c cVar) {
        androidx.navigation.c navArgument = cVar;
        u.j(navArgument, "$this$navArgument");
        navArgument.d(o.f94580k);
        TaskType taskType = this.f40411a;
        if (taskType != null) {
            navArgument.b(taskType.name());
        }
        return y.f85009a;
    }
}
