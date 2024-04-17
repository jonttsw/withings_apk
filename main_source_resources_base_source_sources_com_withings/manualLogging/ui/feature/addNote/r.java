package com.withings.manualLogging.ui.feature.addNote;

import com.withings.manualLogging.ui.common.LogType;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AddManualLogActivity.kt */
/* loaded from: classes4.dex */
public final class r extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ r8.n f41556a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AddManualLogActivity f41557b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k1 f41558c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ LogType f41559d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(r8.n nVar, LogType logType, AddManualLogActivity addManualLogActivity, k1 k1Var) {
        super(2);
        this.f41556a = nVar;
        this.f41557b = addManualLogActivity;
        this.f41558c = k1Var;
        this.f41559d = logType;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        String str;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            AddManualLogActivity addManualLogActivity = this.f41557b;
            if (AddManualLogActivity.B3(addManualLogActivity) != null) {
                str = "addManualLogScreen/{categoryId}";
            } else {
                str = "selectLogCategoryScreen";
            }
            String str2 = str;
            androidx.navigation.compose.s.b(this.f41556a, str2, null, null, null, o.f41537a, p.f41542a, null, null, new q(this.f41556a, this.f41559d, addManualLogActivity, this.f41558c), aVar2, 1769480, 412);
        }
        return nm0.y.f85009a;
    }
}
