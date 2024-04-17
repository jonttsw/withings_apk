package com.withings.healthplus.contentscreens.ui.navigation;

import com.withings.contentproviders.model.content.TaskType;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: ContentScreenNavigation.kt */
/* loaded from: classes3.dex */
final class s extends w implements ym0.p<TaskType, String, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.q<TaskType, String, String, y> f40175a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f40176b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s(ym0.q<? super TaskType, ? super String, ? super String, y> qVar, String str) {
        super(2);
        this.f40175a = qVar;
        this.f40176b = str;
    }

    @Override // ym0.p
    public final y invoke(TaskType taskType, String str) {
        TaskType taskType2 = taskType;
        String originalContentId = str;
        u.j(taskType2, "taskType");
        u.j(originalContentId, "originalContentId");
        this.f40175a.invoke(taskType2, originalContentId, this.f40176b);
        return y.f85009a;
    }
}
