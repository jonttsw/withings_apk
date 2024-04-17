package com.withings.manualLogging.ui.feature.addNote;

import com.withings.manualLogging.ui.common.LogType;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AddManualLogActivity.kt */
/* loaded from: classes4.dex */
public final class s extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AddManualLogActivity f41567a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1 f41568b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ LogType f41569c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f41570d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(AddManualLogActivity addManualLogActivity, k1 k1Var, LogType logType, int i11) {
        super(2);
        this.f41567a = addManualLogActivity;
        this.f41568b = k1Var;
        this.f41569c = logType;
        this.f41570d = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f41570d | 1);
        k1 k1Var = this.f41568b;
        LogType logType = this.f41569c;
        AddManualLogActivity.A3(this.f41567a, k1Var, logType, aVar, g11);
        return nm0.y.f85009a;
    }
}
