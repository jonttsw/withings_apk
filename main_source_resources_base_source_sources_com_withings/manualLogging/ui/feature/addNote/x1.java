package com.withings.manualLogging.ui.feature.addNote;

import com.withings.manualLogging.ui.common.LogType;
import com.withings.manualLogging.ui.uikit.atoms.ManualLogCategory;
import com.withings.user.User;
import java.util.List;
/* compiled from: SelectManualLogCategoryScreen.kt */
/* loaded from: classes4.dex */
final class x1 extends kotlin.jvm.internal.w implements ym0.q<s0.b, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.l<ManualLogCategory, nm0.y> f41626a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LogType f41627b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ List<ManualLogCategory> f41628c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ User f41629d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x1(ym0.l<? super ManualLogCategory, nm0.y> lVar, LogType logType, List<? extends ManualLogCategory> list, User user) {
        super(3);
        this.f41626a = lVar;
        this.f41627b = logType;
        this.f41628c = list;
        this.f41629d = user;
    }

    @Override // ym0.q
    public final nm0.y invoke(s0.b bVar, androidx.compose.runtime.a aVar, Integer num) {
        s0.b item = bVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(item, "$this$item");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            xx.i.a(this.f41626a, null, this.f41627b, null, this.f41628c, this.f41629d, aVar2, 294912, 10);
        }
        return nm0.y.f85009a;
    }
}
