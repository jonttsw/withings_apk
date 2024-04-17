package com.withings.screen.repository.ws;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import qm0.d;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SendDeviceScreens.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.screen.repository.ws.SendDeviceScreens$invoke$2", f = "SendDeviceScreens.kt", l = {17, 27, 29}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class SendDeviceScreens$invoke$2 extends i implements p<CoroutineScope, d<? super y>, Object> {
    final /* synthetic */ long $deviceId;
    final /* synthetic */ String $syncContext;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ SendDeviceScreens this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendDeviceScreens$invoke$2(SendDeviceScreens sendDeviceScreens, long j5, String str, d<? super SendDeviceScreens$invoke$2> dVar) {
        super(2, dVar);
        this.this$0 = sendDeviceScreens;
        this.$deviceId = j5;
        this.$syncContext = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new SendDeviceScreens$invoke$2(this.this$0, this.$deviceId, this.$syncContext, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019c A[LOOP:3: B:60:0x0196->B:62:0x019c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f0 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x01ee -> B:8:0x001f). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r48) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.screen.repository.ws.SendDeviceScreens$invoke$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((SendDeviceScreens$invoke$2) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
