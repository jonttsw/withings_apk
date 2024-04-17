package com.withings.manualLogging.ui.feature.addNote.cycle;

import androidx.compose.material3.j5;
import com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel.CycleDataStorageViewModel;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CycleTrackingSymptomsAndPeriodManualLoggingActivity.kt */
/* loaded from: classes4.dex */
public final class m3 extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CycleDataStorageViewModel f41109a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f41110b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f41111c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(CycleDataStorageViewModel cycleDataStorageViewModel, String str, ym0.a<nm0.y> aVar) {
        super(4);
        this.f41109a = cycleDataStorageViewModel;
        this.f41110b = str;
        this.f41111c = aVar;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        j5.e(num, cVar, "$this$composable", dVar, "it");
        ym0.a<nm0.y> aVar2 = this.f41111c;
        tx.v0.a(this.f41109a, this.f41110b, aVar2, null, aVar, 8, 8);
        return nm0.y.f85009a;
    }
}
