package com.withings.wiscale2.device.common.screen.ui;

import com.withings.library.authentication.api.ConstantsWs;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ScreenSelectionViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel$save$1", f = "ScreenSelectionViewModel.kt", l = {ConstantsWs.WS_STATUS_MEASUPDATEERROR, ConstantsWs.WS_STATUS_ASSOCUPDATEERROR, ConstantsWs.WS_STATUS_TOOMANYSHARINGS, ConstantsWs.WS_STATUS_TWITTERROR, ConstantsWs.WS_STATUS_NOSUBSCRIPTION}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ScreenSelectionViewModel$save$1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f53244a;

    /* renamed from: b  reason: collision with root package name */
    int f53245b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ScreenSelectionViewModel f53246c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenSelectionViewModel$save$1(ScreenSelectionViewModel screenSelectionViewModel, qm0.d<? super ScreenSelectionViewModel$save$1> dVar) {
        super(2, dVar);
        this.f53246c = screenSelectionViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new ScreenSelectionViewModel$save$1(this.f53246c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((ScreenSelectionViewModel$save$1) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0155 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0168  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel$save$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
