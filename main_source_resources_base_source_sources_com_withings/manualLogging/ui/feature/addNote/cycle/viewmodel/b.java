package com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CycleDataStorageViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel.CycleDataStorageViewModel$saveNoteGroup$1", f = "CycleDataStorageViewModel.kt", l = {228, ConstantsWs.WS_STATUS_WRONGACCOUNTPARAMS, ConstantsWs.WS_STATUS_WRONGASSOCID, ConstantsWs.WS_STATUS_WRONGDEVICETYPE, ConstantsWs.WS_STATUS_ALREADYACTIVATED, ConstantsWs.WS_STATUS_USERISPRIMARY}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class b extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f41362a;

    /* renamed from: b  reason: collision with root package name */
    Object f41363b;

    /* renamed from: c  reason: collision with root package name */
    gx.d f41364c;

    /* renamed from: d  reason: collision with root package name */
    int f41365d;

    /* renamed from: e  reason: collision with root package name */
    int f41366e;

    /* renamed from: f  reason: collision with root package name */
    private /* synthetic */ Object f41367f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ CycleDataStorageViewModel f41368g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ int f41369h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ ym0.a<y> f41370i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CycleDataStorageViewModel cycleDataStorageViewModel, int i11, ym0.a<y> aVar, qm0.d<? super b> dVar) {
        super(2, dVar);
        this.f41368g = cycleDataStorageViewModel;
        this.f41369h = i11;
        this.f41370i = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        b bVar = new b(this.f41368g, this.f41369h, this.f41370i, dVar);
        bVar.f41367f = obj;
        return bVar;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0132 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018e A[LOOP:2: B:55:0x0188->B:57:0x018e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01e8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f0  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
