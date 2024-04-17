package com.withings.healthplus.library.ui.navigation;

import com.withings.contentproviders.model.content.TaskType;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.r;
import ym0.u;
/* compiled from: LibraryNavigation.kt */
/* loaded from: classes3.dex */
final class h extends w implements r<TaskType, String, Boolean, String, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ u<TaskType, String, String, String, String, Boolean, String, y> f40418a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f40419b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f40420c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f40421d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(u<? super TaskType, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super String, y> uVar, String str, String str2, String str3) {
        super(4);
        this.f40418a = uVar;
        this.f40419b = str;
        this.f40420c = str2;
        this.f40421d = str3;
    }

    @Override // ym0.r
    public final y invoke(TaskType taskType, String str, Boolean bool, String str2) {
        TaskType taskType2 = taskType;
        String contentId = str;
        Boolean bool2 = bool;
        bool2.booleanValue();
        kotlin.jvm.internal.u.j(taskType2, "taskType");
        kotlin.jvm.internal.u.j(contentId, "contentId");
        String str3 = this.f40420c;
        String str4 = this.f40421d;
        this.f40418a.f(taskType2, contentId, this.f40419b, str3, str4, bool2, str2);
        return y.f85009a;
    }
}
